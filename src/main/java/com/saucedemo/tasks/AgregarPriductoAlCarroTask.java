package com.saucedemo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


import static com.saucedemo.ui.ProductosUI.AGREGAR_PRODUCTO_CARRO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AgregarPriductoAlCarroTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(AGREGAR_PRODUCTO_CARRO)
        );
    }

    public static AgregarPriductoAlCarroTask on() {
        return instrumented(AgregarPriductoAlCarroTask.class);
    }
}
