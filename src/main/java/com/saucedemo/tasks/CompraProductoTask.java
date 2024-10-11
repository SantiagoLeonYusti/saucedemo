package com.saucedemo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.saucedemo.ui.CarroUI.*;
import static com.saucedemo.ui.PagoUI.TERMINAR_BTN;
import static com.saucedemo.ui.ProductosUI.CARRO_BTN;
import static com.saucedemo.ui.VerificacionUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CompraProductoTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CARRO_BTN),
                Click.on(VERIFICAR_BTN),
                Enter.theValue("Santiago").into(INGRESO_NOMBRE),
                Enter.theValue("Leon").into(INGRESO_APELLIDO),
                Enter.theValue("12345").into(INGRESO_POSTAL),
                Click.on(CONTINUAR_BTN),
                Click.on(TERMINAR_BTN)

        );

    }

    public static CompraProductoTask on() {
        return instrumented(CompraProductoTask.class);
    }
}
