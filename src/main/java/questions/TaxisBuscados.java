package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterfaces.EscogerTaxisAeropuertoUI.MENSAJE_CONFIRMACION;


public class TaxisBuscados implements Question <Boolean>{
    public static TaxisBuscados estanDisponibles() {
        return new TaxisBuscados();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return MENSAJE_CONFIRMACION.resolveFor(actor).isVisible();
    }
}
