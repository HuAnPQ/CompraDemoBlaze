package test.hugop.comprademoblaze.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.Switch;
import org.openqa.selenium.NoAlertPresentException;
import test.hugop.comprademoblaze.userinterfaces.ProductosPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AgregarMonitor implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(ProductosPage.Nav_Home));

        actor.attemptsTo(
                Click.on(ProductosPage.Link_Monitores),
                Click.on(ProductosPage.Link_AppleMonitor),
                Click.on(ProductosPage.Boton_Agregar_AppleMonitor)
        );

        try {
            actor.attemptsTo( Switch.toAlert() );
        }catch (NoAlertPresentException ex){ ex.printStackTrace(); }

        actor.attemptsTo(Scroll.to(ProductosPage.Boton_Agregar_AppleMonitor).andAlignToTop());

    }
    public static AgregarMonitor agregarMonitor(){ return instrumented(AgregarMonitor.class);}
}