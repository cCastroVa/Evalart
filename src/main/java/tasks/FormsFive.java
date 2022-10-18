package tasks;

import models.FormsFiveData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ui.Select;
import userinterfaces.FormsFivePage;

public class FormsFive implements Task {
    private FormsFiveData formsFiveData;

    public FormsFive(FormsFiveData formsFiveData) {
        this.formsFiveData = formsFiveData;
    }

    public static FormsFive TheDataForm5(FormsFiveData formsFiveData) {
        return Tasks.instrumented(FormsFive.class, formsFiveData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        for(int i=1; i<=414; i++){
            actor.attemptsTo(Enter.keyValues(formsFiveData.getText_b()).into(FormsFivePage.INPUT_B));
        }
        actor.attemptsTo(Click.on(FormsFivePage.OPERATION_RESULT),
                Enter.theValue(formsFiveData.getDate()).into(FormsFivePage.INPUT_DATE),
                Select.value(formsFiveData.getOperation()).from(FormsFivePage.OPERATION_SELECT),
                Click.on(FormsFivePage.BUTTON_OK));
    }
}
