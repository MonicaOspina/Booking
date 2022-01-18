package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AgregarViajeroUI {
    public static final Target BTN_TU_CUENTA=Target.the("botón Tu cuenta").located(By.id("profile-menu-trigger--title"));
    public static final Target BTN_GESTIONAR_CUENTA= Target.the("botón gestionar cuenta").located(By.xpath("//*[@id='b2indexPage']//div[6]//ul/li[1]//span[2]"));
    public static final Target OTHER_TRAVELERS = Target.the("boton para gregar viajeros").located(By.xpath("//li[@data-ga-label='Category: other_travellers']"));
    public static final Target AGREGAR_VIAJERO = Target.the("agregar otro viajero").located(By.xpath("//button[@data-ga-label='Edit section: new_traveller']"));
    public static final Target NOMBRE = Target.the("nombre del viajero").located(By.xpath("//*[@name='first']"));
    public static final Target APELLIDO = Target.the("apellido del viajero").located(By.xpath("//*[@name='last']"));
    public static final Target DIA = Target.the("dia de nacimiento del viajero").located(By.xpath("//*[@name='day']"));
    public static final Target MES = Target.the("mes de nacimiento del viajero").located(By.xpath("//*[@name='month']"));
    public static final Target ANO = Target.the("año de nacimiento del viajero").located(By.xpath("//*[@name='year']"));
    public static final Target BTN_GUARDAR = Target.the("guardar datos del viajero").located(By.xpath("//button[@data-ga-label='Save section: new_traveller']"));
    public static final Target NOMBRE_AGREGADO= Target.the("nombre agregado del viajero").locatedBy("//h3[contains(.,'{0}')]");

}
