package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.HotelBuscadoModel;

import questions.Reserva;
import tasks.EscogerHotel;
import tasks.IngresarHotel;
import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class EscogeHotelBaratoStepDefinitions {

    @Given("^que Moni ingresa los datos a reservar$")
    public void queMoniIngresaLosDatosAReservar(List<HotelBuscadoModel> data)  {
        theActorInTheSpotlight().wasAbleTo(IngresarHotel.onPage(data.get(0)));
    }

    @When("^ella busca el hotel mas barato$")
    public void ellaBuscaElHotelMasBarato() {
        theActorInTheSpotlight().attemptsTo(
                EscogerHotel.masBarato()
        );
    }

    @Then("^ella deberia ver el hotel buscado$")
    public void ellaDeberiaVerElHotelBuscado()  {
        theActorInTheSpotlight().should(
                seeThat(Reserva.estaLista()));
    }
}
