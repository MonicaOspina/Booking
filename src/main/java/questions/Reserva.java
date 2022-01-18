package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterfaces.HotelBaratoUI.CONFIRMAR_RESERVA;

public class Reserva implements Question<Boolean> {

    public static Reserva estaLista() {
        return new Reserva();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return CONFIRMAR_RESERVA.resolveFor(actor).isVisible();
    }
}
