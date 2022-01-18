package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static userinterfaces.AgregarViajeroUI.*;

public class IrA implements Task {

    public static IrA miCuenta() {
        return new IrA();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                Click.on(BTN_TU_CUENTA),
                Click.on(BTN_GESTIONAR_CUENTA),
                Click.on(OTHER_TRAVELERS)
            );
    }
}
