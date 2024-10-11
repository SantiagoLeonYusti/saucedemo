package com.saucedemo.ui;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaPrinciplaUI {

    public static Target INGRESO_USUARI = Target.the("Ingreso ususario de excel")
            .locatedBy("//*[@id='user-name']");

    public static Target INGRESO_CONTRASEN = Target.the("Ingreso contraseña de excel")
            .locatedBy("//*[@id='password']");

    public static final Target INGRESO_USUARIO = Target.the("Ingreso de usuario").locatedBy("//*[@id='user-name']");
    public static final Target INGRESO_CONTRASENA = Target.the("Ingreso de contraseña").locatedBy("//*[@id='password']");
    public static final Target LOGIN_BTN = Target.the("Boton ingresar").locatedBy("//*[@id='login-button']");

}
