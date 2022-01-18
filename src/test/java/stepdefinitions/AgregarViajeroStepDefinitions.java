package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.ViajeroModel;
import questions.NuevoViajero;
import tasks.AgregarA;
import tasks.IrA;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AgregarViajeroStepDefinitions {

    @Given("^(.*) ingresa a la opcion de agregar viajero$")
    public void moniIngresaALaOpcionDeAgregarViajero(String Moni) {
        theActorCalled(Moni).wasAbleTo(IrA.miCuenta());
    }

    @When("^ella ingresa los datos del viajante$")
    public void ellaIngresaLosDatosDelViajante(List <ViajeroModel> data) {
        theActorInTheSpotlight().attemptsTo(AgregarA.viajero(data.get(0)));
    }

    @Then("^ella deberia ver a (.*) agregado$")
    public void ellaDeberiaVerALuisAgregado(String Luis) {
        theActorInTheSpotlight().should(seeThat(
                NuevoViajero.agregado(Luis)));
    }
}
