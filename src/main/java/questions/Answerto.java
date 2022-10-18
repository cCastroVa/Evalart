package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterfaces.FormsTenPage;

public class Answerto implements Question<Boolean> {
    private String page;

    public Answerto(String page) {
        this.page = page;
    }

    public static Answerto the(String page) {
        return new Answerto(page);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String message = Text.of(FormsTenPage.MESSAGE).asString().answeredBy(actor);
        if (page.equalsIgnoreCase(message)){
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
