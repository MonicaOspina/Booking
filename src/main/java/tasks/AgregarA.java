package tasks;

import models.ViajeroModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static userinterfaces.AgregarViajeroUI.*;


public class AgregarA implements Task {

    private ViajeroModel viajeroModel;

    public static AgregarA viajero(ViajeroModel viajeroModel) {
        return Tasks.instrumented(AgregarA.class, viajeroModel);
    }

    public AgregarA (ViajeroModel viajeroModel){
        this.viajeroModel = viajeroModel;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AGREGAR_VIAJERO),
                Enter.theValue(viajeroModel.getNombre()).into(NOMBRE),
                Enter.theValue(viajeroModel.getApellido()).into(APELLIDO),
                Enter.theValue(viajeroModel.getDia()).into(DIA),
                Enter.theValue(viajeroModel.getMes()).into(MES),
                Enter.theValue(viajeroModel.getAno()).into(ANO),
                Click.on(BTN_GUARDAR),
                WaitUntil.the(BTN_GUARDAR, isEnabled()).forNoMoreThan(10).seconds()
        );
    }
}
