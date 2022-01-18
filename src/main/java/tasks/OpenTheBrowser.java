package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Step;
import net.serenitybdd.screenplay.actions.Open;
import userinterfaces.BookingHomePageUI;

public class OpenTheBrowser implements Task {

   BookingHomePageUI bookingHomePage;
    public static OpenTheBrowser thePage() {
        return Tasks.instrumented(OpenTheBrowser.class);
    }

    @Override
    @Step("{0} enter to booking page")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.browserOn(bookingHomePage));
    }
}