package test.hugop.comprademoblaze.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CarritoPage {

    public static final Target Nav_Carrito = Target.the("Carrito de compras").
            locatedBy("//a[@id=\"cartur\"]");

    public static final Target Boton_PagarOrden = Target.the("Boton pagar").
            locatedBy("//button[@data-target=\"#orderModal\"]");

    public static final Target Input_Nombre = Target.the("Nombre formulario").
            locatedBy("//input[@id=\"name\"]");

    public static final Target Input_Pais = Target.the("Pais formulario").
            locatedBy("//input[@id=\"country\"]");

    public static final Target Input_Ciudad = Target.the("Ciudad formulario").
            locatedBy("//input[@id=\"city\"]");

    public static final Target Input_Tarjeta = Target.the("Tarjeta de credito formulario").
            locatedBy("//input[@id=\"card\"]");

    public static final Target Input_Mes = Target.the("Mes TC formulario").
            locatedBy("//input[@id=\"month\"]");

    public static final Target Input_Anio = Target.the("Año TC formulario").
            locatedBy("//input[@id=\"year\"]");

    public static final Target Boton_Pago = Target.the("Enviar el formulario").
            locatedBy("//button[@onclick=\"purchaseOrder()\"]");

    public static final Target Mensaje_Pago_Ok = Target.the("Mensaje de confirmacion de compra").
            locatedBy("//div[@data-custom-class]/h2");

    public static final Target Boton_Pago_Ok = Target.the("Boton de confirmacion de compra").
            locatedBy("//button[@class=\"confirm btn btn-lg btn-primary\"]");

}
