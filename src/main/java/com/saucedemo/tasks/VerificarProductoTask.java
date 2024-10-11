package com.saucedemo.tasks;

import com.saucedemo.ui.ProductoUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class VerificarProductoTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.should(seeThat(WebElementQuestion.the(ProductoUI.DESC_PRODUCTO), isVisible()));
    }
}
