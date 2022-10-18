package tasks;

import models.FormsSevenData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ui.Select;
import userinterfaces.FormsFivePage;
import userinterfaces.FormsSevenPage;

public class FormsSeven implements Task {
    private FormsSevenData formsSevenData;

    public FormsSeven(FormsSevenData formsSevenData) {
        this.formsSevenData = formsSevenData;
    }

    public static FormsSeven TheDataForm7(FormsSevenData formsSevenData) {
        return Tasks.instrumented(FormsSeven.class, formsSevenData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Select.value(formsSevenData.getOperation()).from(FormsSevenPage.OPERATION_SELECT),
                Enter.theValue(formsSevenData.getDate()).into(FormsSevenPage.INPUT_DATE));
        for(int i=1; i<=91; i++){
            actor.attemptsTo(Enter.keyValues(formsSevenData.getText_y()).into(FormsSevenPage.INPUT_y));
        }
        actor.attemptsTo(Click.on(FormsSevenPage.BUTTON_OK));
    }
}
