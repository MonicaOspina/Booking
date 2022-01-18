package tasks;

import models.HotelBuscadoModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterfaces.EscogerHotelUI.*;

public class IngresarHotel implements Task {

    private HotelBuscadoModel hotelBuscadoModel;

    public static IngresarHotel onPage(HotelBuscadoModel data){
        return instrumented(IngresarHotel.class, data);
    }

    public IngresarHotel(HotelBuscadoModel hotelBuscadoModel) {
        this.hotelBuscadoModel = hotelBuscadoModel;
    }

        @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(SEARCH_BOX, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(hotelBuscadoModel.getDestino()).into(SEARCH_BOX),
                Click.on(CALENDAR_BOX),
                Click.on(CHECK_IN.of(hotelBuscadoModel.getCheckIn())),
                Click.on(CHECK_OUT.of(hotelBuscadoModel.getCheckOut())),
                Click.on(BTN_SEARCH)
        );
    }
}
