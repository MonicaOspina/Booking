package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterfaces.EliminarViajeroAgregadoUI.MENSAJE_REMOVE;


public class ViajeroEliminado implements Question <Boolean>{

    public static ViajeroEliminado noDisponible() {
        return new ViajeroEliminado();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
         return MENSAJE_REMOVE.resolveFor(actor).isVisible();
    }
}
