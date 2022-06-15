package test.hugop.comprademoblaze.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import test.hugop.comprademoblaze.userinterfaces.CarritoPage;

public class VerificacionCompra implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        boolean compare= CarritoPage.Mensaje_Pago_Ok.resolveFor(actor)
                .getText().contains("Thank you for your purchase!");
        return compare;
    }
    public static VerificacionCompra verificacionCompra(){return new VerificacionCompra();}
}