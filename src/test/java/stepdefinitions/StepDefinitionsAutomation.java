package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answerto;
import tasks.*;

public class StepDefinitionsAutomation {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("I login on the page Evalart")
    public void iLoginOnThePageEvalart(DataTable loginTable) {
        OnStage.theActorCalled("trainee").wasAbleTo(OpenUp.thePage(), Login.thePage(LoginData.setData(loginTable).get(0)));
    }
    @When("I complete the first form")
    public void iCompleteTheFirstForm(DataTable formOne) {
        OnStage.theActorInTheSpotlight().attemptsTo(FormsOne.theData(FormsOneData.setData(formOne).get(0)));
    }
    @When("I complete the second form")
    public void iCompleteTheSecondForm(DataTable formTwo) {
        OnStage.theActorInTheSpotlight().attemptsTo(FormsTwo.TheDataForm2(FormsTwoData.setData(formTwo).get(0)));
    }
    @When("I complete the third form")
    public void iCompleteTheThirdForm(DataTable formThree) {
        OnStage.theActorInTheSpotlight().attemptsTo(FormsThree.TheDataForm3(FormsThreeData.setData(formThree).get(0)));
    }
    @When("I complete the fourth form")
    public void iCompleteTheFourthForm(DataTable formFour) {
        OnStage.theActorInTheSpotlight().attemptsTo(FormsFour.TheDataForm4(FormsFourData.setData(formFour).get(0)));
    }
    @When("I complete the fifth form")
    public void iCompleteTheFifthForm(DataTable formFive) {
        OnStage.theActorInTheSpotlight().attemptsTo(FormsFive.TheDataForm5(FormsFiveData.setData(formFive).get(0)));
    }
    @When("I complete the sixth form")
    public void iCompleteTheSixthForm(DataTable formSix) {
        OnStage.theActorInTheSpotlight().attemptsTo(FormsSix.TheDataForm6(FormsSixData.setData(formSix).get(0)));
    }
    @When("I complete the seventh form")
    public void iCompleteTheSeventhForm(DataTable formSeven) {
        OnStage.theActorInTheSpotlight().attemptsTo(FormsSeven.TheDataForm7(FormsSevenData.setData(formSeven).get(0)));
    }
    @When("I complete the eighth form")
    public void iCompleteTheEighthForm(DataTable formEight) {
        OnStage.theActorInTheSpotlight().attemptsTo(FormsEight.TheDataForm8(FormsEightData.setData(formEight).get(0)));
    }
    @When("I complete the ninth form")
    public void iCompleteTheNinthForm(DataTable formNine) {
        OnStage.theActorInTheSpotlight().attemptsTo(FormsNine.TheDataForm9(FormsNineData.setData(formNine).get(0)));
    }
    @When("I complete the tenth form")
    public void iCompleteTheTenthForm(DataTable formTen) {
        OnStage.theActorInTheSpotlight().attemptsTo(FormsTen.TheDataFormTen(FormsTenData.setData(formTen).get(0)));
    }
    @Then("I should see the text {string}")
    public void iShouldSeeTheTextFelicidadesHasTerminadoLaPruebaExitosamente(String page) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answerto.the(page)));
    }
}
