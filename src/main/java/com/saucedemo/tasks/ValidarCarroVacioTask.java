package com.saucedemo.tasks;

import com.saucedemo.ui.CarroUI;
import com.saucedemo.ui.ProductosUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidarCarroVacioTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.should(
                seeThat(WebElementQuestion.the(CarroUI.YOU_CART_LBL), isVisible()),
                seeThat(WebElementQuestion.the(ProductosUI.PRODUCTO), isNotVisible())
        );
    }
}
