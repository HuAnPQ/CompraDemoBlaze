package test.hugop.comprademoblaze.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import test.hugop.comprademoblaze.userinterfaces.CarritoPage;
import test.hugop.comprademoblaze.userinterfaces.ProductosPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class VerCarrito implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CarritoPage.Nav_Carrito),
                Scroll.to(CarritoPage.Boton_PagarOrden).andAlignToTop(),
                Click.on(CarritoPage.Boton_PagarOrden)
        );

    }
    public static VerCarrito verCarrito(){ return instrumented(VerCarrito.class);}
}