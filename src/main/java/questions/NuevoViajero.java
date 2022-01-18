package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterfaces.AgregarViajeroUI.NOMBRE_AGREGADO;

public class NuevoViajero implements Question<Boolean> {

    private String nombre;

    public NuevoViajero(String nombre) {
        this.nombre = nombre;
    }

    public static NuevoViajero agregado(String nombre) {
        return new NuevoViajero(nombre);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return NOMBRE_AGREGADO.of(nombre).resolveFor(actor).isVisible();
    }
}
