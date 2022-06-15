package test.hugop.comprademoblaze.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ProductosPage {

    public static final Target Nav_Home = Target.the("Lista de productos").
            locatedBy("//a[@href=\"index.html\"][@class=\"nav-link\"]");

    public static final Target Link_Monitores = Target.the("Lista de monitores").
            locatedBy("//a[@onclick=\"byCat('monitor')\"]");

    public static final Target Link_AppleMonitor = Target.the("Producto Apple monitor").
            locatedBy("//a[@href=\"prod.html?idp_=10\"][@class=\"hrefch\"]");

    public static final Target Boton_Agregar_AppleMonitor = Target.the("Boton agregar al carrito Apple Monitor").
            locatedBy("//a[@onclick=\"addToCart(10)\"]");

    public static final Target Link_Laptops = Target.the("Lista de laptops").
            locatedBy("//a[@onclick=\"byCat('notebook')\"]");

    public static final Target Link_MacBook = Target.the("Producto MacBook Pro").
            locatedBy("//a[@href=\"prod.html?idp_=15\"][@class=\"hrefch\"]");

    public static final Target Boton_Agregar_MacBook = Target.the("Boton agregar al carrito laptop").
            locatedBy("//a[@onclick=\"addToCart(15)\"]");

}
