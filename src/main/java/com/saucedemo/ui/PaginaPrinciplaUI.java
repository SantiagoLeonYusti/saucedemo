package com.saucedemo.ui;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaPrinciplaUI {

    public static final Target INGRESO_USUARIO = Target.the("Ingreso de usuario").locatedBy("//*[@id='user-name']");
    public static final Target INGRESO_CONTRASENA = Target.the("Ingreso de contraseña").locatedBy("//*[@id='password']");
    public static final Target LOGIN_BTN = Target.the("Boton ingresar").locatedBy("//*[@id='login-button']");

}
