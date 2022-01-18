package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class VerificarLoguinUI {

    public static final Target VERIFICAR_LOGUIN = Target.the("Tu cuenta").located(By.xpath(" //*[@id='profile-menu-trigger--title']"));

}
