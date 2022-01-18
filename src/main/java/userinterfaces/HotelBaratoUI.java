package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HotelBaratoUI {

    public static final Target BTN_PRECIO_BAJO= Target.the("Botón precio bajo").located(By.xpath("//li[@data-id='price']"));
    public static final Target IMG_CARGA = Target.the("cargar").located(By.xpath("//div[@class='bui-spinner bui-spinner--size-large']"));
    public static final Target BTN_DISPONIBILIDAD= Target.the("disponibilidad").located(By.xpath("(//div[@id='search_results_table']//a[contains(@role,'button')])[1]"));
    public static final Target BTN_RESERVAR = Target.the("botón reservar").located(By.xpath("//button[@id='hp_book_now_button']"));
    public static final Target LLENAR_NOMBRE = Target.the("llenar nombre").located(By.xpath("//*[@id='firstname']"));
    public static final Target LLENAR_APELLIDO = Target.the("llenar apellido").located(By.xpath("//*[@id='lastname']"));
    public static final Target NUMERO_CAMAS = Target.the("número de camas").located(By.xpath("(//select[contains(@id,'hprt_nos_select')])[1]"));
    public static final Target BTN_RESERVARE = Target.the("Botón Reservaré ").located(By.xpath("//div[@class='hprt-reservation-cta']//button"));
    public static final Target BTN_SIGUIENTE = Target.the("buton siguiente").located(By.xpath("//button[@name='book']"));
    public static final Target ANADIR_CEL = Target.the("se añade celular").located(By.xpath("//*[@id='phone']"));
    public static final Target BTN_RESERVA_COMPLETA = Target.the("botón reserva completa").located(By.xpath("//button[@name='book']"));
    public static final Target CONFIRMAR_RESERVA = Target.the("Confirmar reserva").located(By.xpath("//*[@id='gemOffersModal']//span[contains(.,'Se ha confirmado')]"));
}
