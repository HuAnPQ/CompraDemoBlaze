package test.hugop.comprademoblaze.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import test.hugop.comprademoblaze.userinterfaces.CarritoPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LlenarFormulario implements Task {

    private String nombre;
    private String pais;
    private String ciudad;
    private String tarjetaCredito;
    private String mes;
    private String anio;

    public LlenarFormulario(String nombre, String pais,
                            String ciudad, String tarjetaCredito,
                            String mes, String anio) {
        this.nombre = nombre;
        this.pais = pais;
        this.ciudad = ciudad;
        this.tarjetaCredito = tarjetaCredito;
        this.mes = mes;
        this.anio = anio;
    }

    public static LlenarFormularioCon with() { return new LlenarFormularioCon(); }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(nombre).into(CarritoPage.Input_Nombre),
                Enter.theValue(pais).into(CarritoPage.Input_Pais),
                Enter.theValue(ciudad).into(CarritoPage.Input_Ciudad),
                Enter.theValue(tarjetaCredito).into(CarritoPage.Input_Tarjeta),
                Enter.theValue(mes).into(CarritoPage.Input_Mes),
                Enter.theValue(anio).into(CarritoPage.Input_Anio)
        );

    }
    public static LlenarFormulario llenarFormulario(){ return instrumented(LlenarFormulario.class);}

    public static class LlenarFormularioCon {

        private String nombre;
        private String pais;
        private String ciudad;
        private String tarjetaCredito;
        private String mes;
        private String anio;

        public LlenarFormularioCon nombre(String nombre){
            this.nombre = nombre;
            return this;
        }

        public LlenarFormularioCon pais(String pais){
            this.pais = pais;
            return this;
        }

        public LlenarFormularioCon ciudad(String ciudad){
            this.ciudad = ciudad;
            return this;
        }

        public LlenarFormularioCon tarjetaCredito(String tarjetaCredito){
            this.tarjetaCredito = tarjetaCredito;
            return this;
        }

        public LlenarFormularioCon mes(String mes){
            this.mes = mes;
            return this;
        }

        public Performable anio(String anio){
            return new LlenarFormulario(nombre, pais,
                    ciudad, tarjetaCredito,
                    mes, anio);
        }

    }

}