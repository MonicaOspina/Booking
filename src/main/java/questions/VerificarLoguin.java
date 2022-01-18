package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import userinterfaces.VerificarLoguinUI;


public class VerificarLoguin implements Question<Boolean> {

    public static VerificarLoguin category(Target question) {
        return new VerificarLoguin();
    }

       @Override
    public Boolean answeredBy(Actor actor) {
           boolean  r;
           String a = Text.of(VerificarLoguinUI.VERIFICAR_LOGUIN).viewedBy(actor).asString();
           String question = "Tu cuenta";
           r = a.equals(question);
        return r;
       }
}

