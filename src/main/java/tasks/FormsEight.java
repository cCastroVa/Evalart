package tasks;

import models.FormsEightData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.FormsEightPage;

public class FormsEight implements Task {
    private FormsEightData formsEightData;

    public FormsEight(FormsEightData formsEightData) {
        this.formsEightData = formsEightData;
    }

    public static FormsEight TheDataForm8(FormsEightData formsEightData) {
        return Tasks.instrumented(FormsEight.class, formsEightData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(formsEightData.getDate()).into(FormsEightPage.INPUT_DATE),
                Click.on(FormsEightPage.CHECKBOX1),
                Click.on(FormsEightPage.CHECKBOX2),
                Click.on(FormsEightPage.CHECKBOX3),
                Click.on(FormsEightPage.OPERATION_RESULT),
                Enter.theValue(formsEightData.getAnimal()).into(FormsEightPage.INPUT_ANIMAL),
                Click.on(FormsEightPage.BUTTON_OK));
    }
}
