package tasks;

import net.serenitybdd.screenplay.Task;
import interactions.CambiarVentana;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static userinterfaces.HotelBaratoUI.*;

public class EscogerHotel implements Task {

    public static EscogerHotel masBarato() {
        return Tasks.instrumented(EscogerHotel.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_PRECIO_BAJO),
                WaitUntil.the(BTN_DISPONIBILIDAD, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BTN_DISPONIBILIDAD),
                CambiarVentana.uno(),
                Click.on(BTN_RESERVAR),
                SelectFromOptions.byValue("1").from(NUMERO_CAMAS),
                Click.on(BTN_RESERVARE),
                Scroll.to(LLENAR_NOMBRE),
                Enter.theValue("Mónica").into(LLENAR_NOMBRE),
                Scroll.to(LLENAR_APELLIDO),
                Enter.theValue("Ospina").into(LLENAR_APELLIDO),
                Scroll.to(BTN_SIGUIENTE),
                Click.on(BTN_SIGUIENTE),
                Scroll.to(ANADIR_CEL),
                Enter.theValue("3224567890").into(ANADIR_CEL),
                Scroll.to(BTN_RESERVA_COMPLETA),
                Click.on(BTN_RESERVA_COMPLETA)
        );
    }
}
