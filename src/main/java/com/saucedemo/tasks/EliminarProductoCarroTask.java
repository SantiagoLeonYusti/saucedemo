package com.saucedemo.tasks;

import com.saucedemo.ui.CarroUI;
import com.saucedemo.ui.ProductosUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import static com.saucedemo.ui.CarroUI.ELIMINAR_PRODUCTO;
import static com.saucedemo.ui.ProductosUI.CARRO_BTN;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class EliminarProductoCarroTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CARRO_BTN),
                Click.on(ELIMINAR_PRODUCTO)
        );

    }
    public static EliminarProductoCarroTask on() {
        return instrumented(EliminarProductoCarroTask.class);
    }
}
