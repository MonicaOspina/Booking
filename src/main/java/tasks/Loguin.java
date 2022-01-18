package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.LoguinPanelUI;

public class Loguin implements Task {

    public static Loguin onThePage() {
        return Tasks.instrumented(Loguin.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LoguinPanelUI.INICIAR_SESION),
                Enter.theValue("monipoc@gmail.com").into(LoguinPanelUI.USER),
                Click.on(LoguinPanelUI.CONTINUAR_EMAIL),
                Enter.theValue("Pruebadevco1").into(LoguinPanelUI.PASSWORD),
                Click.on(LoguinPanelUI.BOTON_LOGIN)
     );
    }
}
