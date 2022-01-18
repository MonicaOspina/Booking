package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import org.hamcrest.CoreMatchers;
import questions.VerificarLoguin;
import tasks.Loguin;
import tasks.OpenTheBrowser;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;
import static userinterfaces.VerificarLoguinUI.VERIFICAR_LOGUIN;


public class LoguinStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

   @Given("^que (.*) desea loguearse en la pagina Booking$")
    public void queMoniDeseaLoguearseEnLaPaginaBooking(String Moni)  {
        theActorCalled(Moni).wasAbleTo(OpenTheBrowser.thePage());
    }

   @When("^ella ingresa el usuario y la contrasena$")
    public void ellaIngresaElUsuarioYLaContrasena()  {
        theActorInTheSpotlight().attemptsTo(Loguin.onThePage());
    }

    @Then("^ella se loguea correctamente en la pagina y lo verifica$")
    public void ellaSeLogueaCorrectamenteEnLaPaginaYLoVerifica() {
        theActorInTheSpotlight().should(
                seeThat(TheTarget.textOf(VERIFICAR_LOGUIN), CoreMatchers.is("Tu cuenta")),
                seeThat(VerificarLoguin.category(VERIFICAR_LOGUIN),equalTo(true))
        );
    }
}
