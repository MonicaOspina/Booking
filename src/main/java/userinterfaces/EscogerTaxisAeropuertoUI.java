package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EscogerTaxisAeropuertoUI {

    public static final Target BTN_AEROPUERTO_TAXI = Target.the("botón aeropuerto taxi").located(By.xpath("//a[@data-decider-header='rideways']"));
    public static final Target BTN_IDA =Target.the("botón solo ida").located(By.xpath("(//span[@class='rw-radio__label'])[1]"));
    public static final Target LUGAR_RECOGIDA =Target.the("indica el campo de recogida").located(By.xpath("//*[@id='pickupLocation']"));
    public static final Target LBL_LUGAR_RECOGIDA= Target.the("indica el label de recogida").located(By.xpath("//ul[@id='pickupLocation-items']/child::li[2]"));
    public static final Target LUGAR_DESTINO =Target.the("indica el campo de llegada").located(By.xpath("//*[@id='dropoffLocation']"));
    public static final Target LBL_LUGAR_DESTINO= Target.the("indica el label de llegada").located(By.xpath("//ul[@id='dropoffLocation-items']/child::li[2]"));
    public static final Target CAJA_FECHAS =Target.the("caja para localizar fechas").located(By.xpath("//button[@aria-label='pickup date input field']"));
    public static final Target BTN_FECHAS= Target.the("botón para localizar fechas").locatedBy("//a[@aria-label='{0}']");
    public static final Target CAJA_HORAS = Target.the("caja para localizar horas").located(By.xpath("//button[@aria-label='pickup time input field']"));
    public static final Target BTN_HORA =Target.the("botón para seleccionar hora").located(By.xpath("//select[@id='pickupHour']"));
    public static final Target BTN_HORA_CONFIRMAR = Target.the("botón para confirmar hora").located(By.xpath("//button[@data-test='rw-time-picker__confirm-button']"));
    public static final Target CANTIDAD_PASAJEROS =Target.the("botón para agreagr pasajeros").located(By.xpath("//select[@id='passengers']"));
    public static final Target BTN_BUSCAR =Target.the("botón buscar").located(By.xpath("(//*[@name='searchButton'])[1]"));
    public static final Target MENSAJE_CONFIRMACION =Target.the("mensaje que confirma búsqueda realizada").located(By.xpath("//h1[contains(text(),'Estamos buscando la mejor oferta para usted ...')]"));

}
