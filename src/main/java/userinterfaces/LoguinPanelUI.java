package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoguinPanelUI {
    public static final Target INICIAR_SESION = Target.the("iniciar_sesion").located(By.xpath("//*[@id='b2indexPage']/header/nav[1]/div[2]/div[6]/a/span"));
    public static final Target USER = Target.the("user").located(By.xpath("//*[@id='username']"));
    public static final Target CONTINUAR_EMAIL = Target.the("continuar_email").located(By.xpath("//span[contains(text(), 'Continuar con e-mail')]"));
    public static final Target PASSWORD = Target.the("password").located(By.id("password"));
    public static final Target BOTON_LOGIN = Target.the("boton_login").located(By.xpath("(//span[contains(text(), 'Iniciar sesión')])[1]"));
}
