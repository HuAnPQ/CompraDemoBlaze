package test.hugop.comprademoblaze.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import test.hugop.comprademoblaze.userinterfaces.HomePage;

public class LogIn implements Task {

    private String usuario;
    private String password;

    public LogIn(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public static LoginCon with() {
        return new LoginCon();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(HomePage.Log_in)
        );

        actor.attemptsTo(
                Enter.theValue(usuario).into(HomePage.Nombre_LogIn),
                Enter.theValue(password).into(HomePage.Contrasena_LogIn)
        );

        actor.attemptsTo(
                Click.on(HomePage.Boton_Login)
        );

    }

    public static class LoginCon {

        private String usuario;
        private String password;

        public LoginCon usuario(String usuario) {
            this.usuario = usuario;
            return this;
        }

        public LoginCon and() {
            return this;
        }

        public Performable password(String password) {
            return new LogIn(usuario, password);
        }

    }
}
