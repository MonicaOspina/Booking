package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EscogerHotelUI {
    public static final Target SEARCH_BOX = Target.the("caja de busqueda").located(By.id("ss"));
    public static final Target CALENDAR_BOX = Target.the("caja del Calendario").located(By.xpath("//div[@data-mode='checkin']"));
    public static final Target CHECK_IN = Target.the("CheckIn Calendario").locatedBy("//td[@data-date='{0}']");
    public static final Target CHECK_OUT = Target.the("CheckOut calendario").locatedBy("//td[@data-date='{0}']");
    public static final Target BTN_SEARCH = Target.the("Search Button").located(By.xpath("//button[@data-sb-id='main']"));

}
