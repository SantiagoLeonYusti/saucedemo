package com.saucedemo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


import static com.saucedemo.ui.ProductosUI.CERRAR_SESION_BTN;
import static com.saucedemo.ui.ProductosUI.MENU_BTN;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CerrarSesionTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(MENU_BTN),
                Click.on(CERRAR_SESION_BTN)
        );
    }

    public static CerrarSesionTask on() {
        return instrumented(CerrarSesionTask.class);
    }
}
