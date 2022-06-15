package test.hugop.comprademoblaze.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import test.hugop.comprademoblaze.userinterfaces.CarritoPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CompletarCompra implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CarritoPage.Boton_Pago)
        );

    }
    public static CompletarCompra completarCompra(){ return instrumented(CompletarCompra.class);}
}