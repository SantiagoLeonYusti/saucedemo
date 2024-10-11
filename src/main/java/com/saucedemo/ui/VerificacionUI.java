package com.saucedemo.ui;

import net.serenitybdd.screenplay.targets.Target;

public class VerificacionUI {

    public static final Target INGRESO_NOMBRE = Target.the("Ingreso de nombre").locatedBy("//*[@id='first-name']");

    public static final Target INGRESO_APELLIDO = Target.the("Ingreso de apellido").locatedBy("//*[@id='last-name']");

    public static final Target INGRESO_POSTAL = Target.the("Ingreso codigo postal").locatedBy("//*[@id='postal-code']");

    public static final Target CONTINUAR_BTN = Target.the("Boton continuar").locatedBy("//*[@id='continue']");
}
