package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static userinterfaces.EliminarViajeroAgregadoUI.BTN_REMOVE;
import static userinterfaces.EliminarViajeroAgregadoUI.MENSAJE_REMOVE;


public class EliminarA implements Task {

    public static EliminarA viajero() {
        return new EliminarA();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                JavaScriptClick.on(BTN_REMOVE),
                WaitUntil.the(BTN_REMOVE, isVisible()).forNoMoreThan(30).seconds(),
                WaitUntil.the(MENSAJE_REMOVE, isVisible()).forNoMoreThan(30).seconds()
        );
    }
}
