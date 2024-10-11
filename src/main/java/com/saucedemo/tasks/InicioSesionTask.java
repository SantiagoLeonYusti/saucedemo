package com.saucedemo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.saucedemo.ui.PaginaPrinciplaUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class InicioSesionTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("standard_user").into(INGRESO_USUARIO),
                Enter.theValue("secret_sauce").into(INGRESO_CONTRASENA),
                Click.on(LOGIN_BTN)
        );

    }

    public static InicioSesionTask on() {
        return instrumented(InicioSesionTask.class);
    }
}

