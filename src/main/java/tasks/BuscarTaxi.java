package tasks;

import models.EscogerTaxisAeropertoModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterfaces.EscogerTaxisAeropuertoUI.*;

public class BuscarTaxi  implements Task {

    private EscogerTaxisAeropertoModel escogerTaxisAeropertoModel;

    public BuscarTaxi(EscogerTaxisAeropertoModel escogerTaxisAeropertoModel){
        this.escogerTaxisAeropertoModel = escogerTaxisAeropertoModel;
    }

    public static BuscarTaxi alAeropuerto(EscogerTaxisAeropertoModel escogerTaxisAeropertoModel) {
        return Tasks.instrumented(BuscarTaxi.class, escogerTaxisAeropertoModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_AEROPUERTO_TAXI),
                Click.on(BTN_IDA),
                Enter.theValue(escogerTaxisAeropertoModel.getLugarRecogida()).into(LUGAR_RECOGIDA),
                WaitUntil.the(LBL_LUGAR_RECOGIDA, isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(LBL_LUGAR_RECOGIDA),
                Enter.theValue(escogerTaxisAeropertoModel.getDestino()).into(LUGAR_DESTINO),
                WaitUntil.the(LBL_LUGAR_DESTINO, isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(LBL_LUGAR_DESTINO),
                Click.on(CAJA_FECHAS),
                Click.on(BTN_FECHAS.of(escogerTaxisAeropertoModel.getFecha())),
                Click.on(CAJA_HORAS),
                SelectFromOptions.byVisibleText(escogerTaxisAeropertoModel.getHora()).from(BTN_HORA),
                Click.on(BTN_HORA_CONFIRMAR),
                SelectFromOptions.byVisibleText(escogerTaxisAeropertoModel.getPasajeros()).from(CANTIDAD_PASAJEROS),
                Click.on(BTN_BUSCAR),
                WaitUntil.the(MENSAJE_CONFIRMACION, isVisible()).forNoMoreThan(120).seconds()

        );
    }
}
