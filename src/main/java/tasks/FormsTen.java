package tasks;

import models.FormsTenData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.FormsTenPage;

public class FormsTen implements Task {
    private FormsTenData formsTenData;

    public FormsTen(FormsTenData formsTenData) {
        this.formsTenData = formsTenData;
    }

    public static FormsTen TheDataFormTen(FormsTenData formsTenData) {
        return Tasks.instrumented(FormsTen.class, formsTenData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(formsTenData.getAnimal()).into(FormsTenPage.INPUT_ANIMAL),
                Click.on(FormsTenPage.CHECKBOX),
                Click.on(FormsTenPage.OPERATION_RESULT));
        for(int i=1; i<=145; i++){
            actor.attemptsTo(Enter.keyValues(formsTenData.getText_H()).into(FormsTenPage.INPUT_H));
        }
        actor.attemptsTo(Click.on(FormsTenPage.BUTTON_OK));
    }
}
