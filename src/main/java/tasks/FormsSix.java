package tasks;

import models.FormsSixData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ui.Select;
import userinterfaces.FormsSixPage;

public class FormsSix implements Task {
    private FormsSixData formsSixData;

    public FormsSix(FormsSixData formsSixData) {
        this.formsSixData = formsSixData;
    }

    public static FormsSix TheDataForm6(FormsSixData formsSixData) {
        return Tasks.instrumented(FormsSix.class, formsSixData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Select.value(formsSixData.getOperation()).from(FormsSixPage.OPERATION_SELECT),
                Enter.theValue(formsSixData.getDate()).into(FormsSixPage.INPUT_DATE),
                Enter.theValue(formsSixData.getT_rex()).into(FormsSixPage.INPUT_T_REX),
                Click.on(FormsSixPage.CHECKBOX1),
                Click.on(FormsSixPage.CHECKBOX2),
                Click.on(FormsSixPage.BUTTON_OK));
    }
}
