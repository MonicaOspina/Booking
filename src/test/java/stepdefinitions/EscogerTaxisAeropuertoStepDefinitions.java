package stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.EscogerTaxisAeropertoModel;
import questions.NuevoViajero;
import questions.TaxisBuscados;
import tasks.BuscarTaxi;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class EscogerTaxisAeropuertoStepDefinitions {


    @When("^ella ingresa los datos para el taxi$")
    public void ellaIngresaLosDatosParaElTaxi(List<EscogerTaxisAeropertoModel> data) {
        theActorInTheSpotlight().attemptsTo(BuscarTaxi.alAeropuerto(data.get(0)));
    }

    @Then("^ella deberia ver los taxis disponibles$")
    public void ellaDeberiaVerLosTaxisDisponibles() {
        theActorInTheSpotlight().should(seeThat(
             TaxisBuscados.estanDisponibles()));
    }
}
