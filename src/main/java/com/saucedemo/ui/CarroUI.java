package com.saucedemo.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CarroUI {

    public static final Target YOU_CART_LBL = Target.the("Texto You Cart").locatedBy("//span[text()='Your Cart']");

    public static final Target ELIMINAR_PRODUCTO = Target.the("Eliminar producto del carro").locatedBy("//*[@id='remove-sauce-labs-backpack']");

    public static final Target VERIFICAR_BTN = Target.the("Boton para verificar datos de usuario").locatedBy("//*[@id='checkout']");



}
