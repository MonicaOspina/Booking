package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EliminarViajeroAgregadoUI {

    public static final Target BTN_REMOVE = Target.the("botón remover viajero").located(By.xpath("(//button[@data-ga-label = 'Remove Traveller'])[1]"));
    public static final Target MENSAJE_REMOVE = Target.the("mensaje de viajero eliminado").located(By.xpath("(//div[contains(text(),'Add or edit info about the people you’re traveling with.')])[2]"));
}
