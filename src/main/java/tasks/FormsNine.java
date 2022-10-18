package tasks;

import models.FormsNineData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ui.Select;
import userinterfaces.FormsNinePage;

public class FormsNine implements Task {
    private FormsNineData formsNineData;

    public FormsNine(FormsNineData formsNineData) {
        this.formsNineData = formsNineData;
    }

    public static FormsNine TheDataForm9(FormsNineData formsNineData) {
        return Tasks.instrumented(FormsNine.class, formsNineData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(FormsNinePage.OPERATION_RESULT),
                Enter.theValue(formsNineData.getDate()).into(FormsNinePage.INPUT_DATE),
                Enter.theValue(formsNineData.getAnimal()).into(FormsNinePage.INPUT_ANIMAL),
                Select.value(formsNineData.getOperation()).from(FormsNinePage.OPERATION_SELECT),
                Click.on(FormsNinePage.BUTTON_OK));
    }
}
