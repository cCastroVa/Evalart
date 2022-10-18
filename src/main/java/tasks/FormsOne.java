package tasks;

import models.FormsOneData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.FormsOnePAge;

public class FormsOne implements Task {
    private FormsOneData formsOneData;
    public FormsOne(FormsOneData formsOneData) {
        this.formsOneData = formsOneData;
    }
    public static FormsOne theData(FormsOneData formsOneData) {
        return Tasks.instrumented(FormsOne.class, formsOneData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(formsOneData.getT_rex()).into(FormsOnePAge.INPUT_T_REX),
                Click.on(FormsOnePAge.CHECKBOX1),
                Click.on(FormsOnePAge.CHECKBOX2),
                Click.on(FormsOnePAge.CHECKBOX3),
                Click.on(FormsOnePAge.CHECKBOX4),
                Click.on(FormsOnePAge.CHECKBOX5),
                Click.on(FormsOnePAge.CHECKBOX6),
                Enter.theValue(formsOneData.getDate()).into(FormsOnePAge.INPUT_DATE),
                Click.on(FormsOnePAge.OPERATION),
                Click.on(FormsOnePAge.BUTTON_OK));
    }
}
