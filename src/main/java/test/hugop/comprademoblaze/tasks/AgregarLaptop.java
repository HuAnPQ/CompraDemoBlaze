package test.hugop.comprademoblaze.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.Switch;
import org.openqa.selenium.NoAlertPresentException;
import test.hugop.comprademoblaze.userinterfaces.ProductosPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AgregarLaptop implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(ProductosPage.Nav_Home),
                Click.on(ProductosPage.Link_Laptops),
                Click.on(ProductosPage.Link_MacBook),
                Click.on(ProductosPage.Boton_Agregar_MacBook)
        );

        try {
            actor.attemptsTo( Switch.toAlert() );
        }catch (NoAlertPresentException ex){ ex.printStackTrace(); }

        actor.attemptsTo(Scroll.to(ProductosPage.Boton_Agregar_MacBook).andAlignToTop());

    }
    public static AgregarLaptop agregarLaptop(){ return instrumented(AgregarLaptop.class);}
}