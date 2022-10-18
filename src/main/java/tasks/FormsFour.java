package tasks;

import models.FormsFourData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ui.Select;
import userinterfaces.FormsFourPage;
import userinterfaces.FormsTwoPage;

public class FormsFour implements Task {
    private FormsFourData formsFourData;
    public FormsFour(FormsFourData formsFourData) {
        this.formsFourData = formsFourData;
    }
    public static FormsFour TheDataForm4(FormsFourData formsFourData) {
        return Tasks.instrumented(FormsFour.class, formsFourData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        for(int i=1; i<=363; i++){
            actor.attemptsTo(Enter.keyValues(formsFourData.getText_c()).into(FormsFourPage.INPUT_C));
        }
        actor.attemptsTo(Select.value(formsFourData.getOperation()).from(FormsFourPage.OPERATION_SELECT),
                Click.on(FormsFourPage.OPERATION_RESULT),
                Click.on(FormsFourPage.CHECKBOX1),
                Click.on(FormsFourPage.CHECKBOX2),
                Click.on(FormsFourPage.CHECKBOX3),
                Click.on(FormsFourPage.CHECKBOX4),
                Click.on(FormsFourPage.CHECKBOX5),
                Click.on(FormsFourPage.BUTTON_OK));
    }
}
