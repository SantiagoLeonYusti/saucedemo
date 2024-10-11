package com.saucedemo.tasks;

import com.saucedemo.ui.PaginaPrinciplaUI;
import com.saucedemo.utils.Excel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static com.saucedemo.ui.PaginaPrinciplaUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class InicioSesionTask implements Task {

    private  static ArrayList<Map<String, String>> data= new ArrayList<>();
    @Override
    public <T extends Actor> void performAs(T actor) {



        try {
            data = Excel.leerDatosDeHojaDeExcel("src/test/resources/Data/Data.xlsx", "Search");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        actor.attemptsTo(

                Enter.theValue(data.get(0).get("Usuario")).into(INGRESO_USUARI),
                Enter.theValue(data.get(0).get("Contraseña")).into(INGRESO_CONTRASEN),
                Click.on(LOGIN_BTN)
        );

    }

    public static Performable fromHome(){
        return instrumented(InicioSesionTask.class);
    }
}

