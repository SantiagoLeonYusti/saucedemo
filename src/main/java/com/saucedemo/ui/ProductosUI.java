package com.saucedemo.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ProductosUI {

    public static final Target PRODUCTO = Target.the("Seleccionar producto").locatedBy("//*[text()='Sauce Labs Backpack']");

    public static final Target AGREGAR_PRODUCTO_CARRO = Target.the("Agregar producto al carro").locatedBy("//*[@id='add-to-cart-sauce-labs-backpack']");

    public static final Target CARRO_BTN = Target.the("Seleccionar boton carro").locatedBy("//*[@id='shopping_cart_container']/a");
    public static final Target MENU_BTN = Target.the("Seleccionar boton carro").locatedBy("//*[@id='react-burger-menu-btn']");
    public static final Target CERRAR_SESION_BTN = Target.the("Seleccionar boton carro").locatedBy("//*[@id='logout_sidebar_link']");




}
