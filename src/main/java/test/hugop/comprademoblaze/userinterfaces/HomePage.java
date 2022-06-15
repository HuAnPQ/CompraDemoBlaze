package test.hugop.comprademoblaze.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static final Target Log_in= Target.the("Inicio LOG IN").
            locatedBy("//a[@id=\"login2\"]");

    public static final Target Nombre_LogIn= Target.the("Nombre login").
            locatedBy("//input[@id=\"loginusername\"]");

    public static final Target Contrasena_LogIn= Target.the("Password login").
            locatedBy("//input[@id=\"loginpassword\"]");

    public static final Target Boton_Login= Target.the("Boton de login").
            locatedBy("//button[@onclick=\"logIn()\"]");

    public static final Target Usuario_ingresado= Target.the("Welcome usuario ingresado").
            locatedBy("//a[@id=\"nameofuser\"]");

}
