package tasks;

import models.FormsTwoData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ui.Select;
import userinterfaces.FormsTwoPage;

public class FormsTwo implements Task {
    private FormsTwoData formsTwoData;
    public FormsTwo(FormsTwoData formsTwoData) {
        this.formsTwoData = formsTwoData;
    }
    public static FormsTwo TheDataForm2(FormsTwoData formsTwoData) {
        return Tasks.instrumented(FormsTwo.class, formsTwoData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(FormsTwoPage.CHECKBOX_OPERATION),
                Enter.theValue(formsTwoData.getSharks()).into(FormsTwoPage.INPUT_SHARK),
                Select.value(formsTwoData.getOperation2()).from(FormsTwoPage.OPERATION_SELECT));
        for(int i=1; i<=393; i++){
            actor.attemptsTo(Enter.keyValues(formsTwoData.getText_s()).into(FormsTwoPage.INPUT_S));
        }
        actor.attemptsTo(Click.on(FormsTwoPage.BUTTON_OK));
    }
}
