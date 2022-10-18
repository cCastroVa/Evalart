package tasks;

import models.FormsThreeData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ui.Select;
import userinterfaces.FormsThreePage;


public class FormsThree implements Task {
    private FormsThreeData formsThreeData;

    public FormsThree(FormsThreeData formsThreeData) {
        this.formsThreeData = formsThreeData;
    }

    public static FormsThree TheDataForm3(FormsThreeData formsThreeData) {
        return Tasks.instrumented(FormsThree.class, formsThreeData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Select.value(formsThreeData.getOperation()).from(FormsThreePage.SELECT_OPERATION),
                Enter.theValue(formsThreeData.getDate()).into(FormsThreePage.INPUT_DATE),
                Click.on(FormsThreePage.CHECKBOX1),
                Click.on(FormsThreePage.CHECKBOX2),
                Click.on(FormsThreePage.CHECKBOX3),
                Click.on(FormsThreePage.CHECKBOX4),
                Click.on(FormsThreePage.CHECKBOX5),
                Click.on(FormsThreePage.OPERATION_RESULT),
                Click.on(FormsThreePage.BUTTON_OK));
    }
}
