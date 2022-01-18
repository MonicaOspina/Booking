package stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import questions.ViajeroEliminado;
import tasks.EliminarA;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class EliminarViajeroAgregadoStepDefinitions {

    @When("^ella elimina a viajero agregado recientemente$")
    public void ellaEliminaAViajeroAgregadoRecientemente() {
        theActorInTheSpotlight().attemptsTo(EliminarA.viajero());

    }

    @Then("^ella deberia ver que el viajero ya no esta agregado$")
    public void ellaDeberiaVerQueElViajeroYaNoEstaAgregado() {
        theActorInTheSpotlight().should(seeThat(ViajeroEliminado.noDisponible()));
    }

}
