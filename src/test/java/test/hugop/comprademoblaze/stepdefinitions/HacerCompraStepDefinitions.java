package test.hugop.comprademoblaze.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import test.hugop.comprademoblaze.questions.VerificacionCompra;
import test.hugop.comprademoblaze.tasks.*;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class HacerCompraStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver hisBrowser;

    @Before
    public void setThestage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("HuAn");
    }

    @Dado("^soy un usuario de DemoBlaze$")
    public void soyUnUsuarioDeDemoBlaze() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.demoblaze.com"));
    }

    @Cuando("^inicio sesion$")
    public void inicioSesion() {
        theActorInTheSpotlight().attemptsTo(
                LogIn.with()
                        .usuario("hugop2022").and()
                        .password("2022")
        );
    }

    @Cuando("^agrego una laptop al carrito$")
    public void agregoUnaLaptopAlCarrito() {
        theActorInTheSpotlight().attemptsTo(
                AgregarLaptop.agregarLaptop()
        );
    }

    @Cuando("^agrego un monitor al carrito$")
    public void agregoUnMonitorAlCarrito() {
        theActorInTheSpotlight().attemptsTo(
                AgregarMonitor.agregarMonitor()
        );
    }

    @Cuando("^visualizo el carrito$")
    public void visualizoElCarrito() {
        theActorInTheSpotlight().attemptsTo(
                VerCarrito.verCarrito()
        );
    }

    @Cuando("^completo el formulario de compra$")
    public void completoElFormularioDeCompra() {
        theActorInTheSpotlight().attemptsTo(
                LlenarFormulario.with()
                        .nombre("Hugo P")
                        .pais("Ecuador")
                        .ciudad("Quito")
                        .tarjetaCredito("2233445566778899")
                        .mes("06")
                        .anio("2022")
        );
    }

    @Entonces("^finalizo la compra$")
    public void finalizoLaCompra() {
        theActorInTheSpotlight().attemptsTo( CompletarCompra.completarCompra() );
    }

    @Entonces("^se confirma la compra$")
    public void seConfirmaLaCompra() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                VerificacionCompra.verificacionCompra(),
                Matchers.is(true))
        );
    }



}
