package com.saucedemo.stepDefinitions;

import com.saucedemo.tasks.*;
import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class SaucedemoStepDefinition {

    @Before
    public void setStage() {
        setTheStage(new OnlineCast());
    }

    @Dado("Que el usuario ingresa a la pagina de productos con usuario y contraseña")
    public void queElUsuarioIngresaALaPaginaDeProductosConUsuarioYContraseña() {
        theActorCalled("usuario").wasAbleTo(
                Open.url("https://www.saucedemo.com/")
        );
        theActorInTheSpotlight().attemptsTo(
                InicioSesionTask.on()
        );
    }

    @Cuando("El usuario selecciona un producto")
    public void elUsuarioSeleccionaUnProducto() {
        theActorInTheSpotlight().attemptsTo(
                SeleccionarProductoTask.on()
        );

    }

    @Entonces("El usuario podra ver el producto")
    public void elUsuarioPodraVerElProducto() {
        theActorInTheSpotlight().attemptsTo(
                new VerificarProductoTask()
        );

    }

    @Cuando("El usuario agrega un producto al carrito")
    public void elUsuarioAgregaUnProductoAlCarrito() {
        theActorInTheSpotlight().attemptsTo(
                AgregarPriductoAlCarroTask.on()
        );

    }

    @Entonces("El producto debe estar en el carrito")
    public void elProductoDebeEstarEnElCarrito() {
        theActorInTheSpotlight().attemptsTo(
                VerificarProductoEnCarroTask.on()
        );

    }

    @Cuando("El usuario elimina un producto del carrito")
    public void elUsuarioEliminaUnProductoDelCarrito() {
        theActorInTheSpotlight().attemptsTo(
                EliminarProductoCarroTask.on()
        );

    }

    @Entonces("El carrito debe estar vacío")
    public void elCarritoDebeEstarVacío() {
        theActorInTheSpotlight().attemptsTo(
                new ValidarCarroVacioTask()
        );


    }

    @Cuando("Siga los pasos y finalice la compra")
    public void sigaLosPasosYFinaliceLaCompra() {
        theActorInTheSpotlight().attemptsTo(
                CompraProductoTask.on()
        );
    }

    @Entonces("El ususario tendra un mensaje de exito")
    public void elUsuarioTendraUnMensajeDeExito() {
        theActorInTheSpotlight().attemptsTo(
                new ValidarCompraTask()
        );
    }

    @Cuando("El usuario presionar cerrar sesion")
    public void elUsuarioPresionarCerrarSesion() {
        theActorInTheSpotlight().attemptsTo(
                CerrarSesionTask.on()
        );
    }

    @Entonces("El usuario volvera a la pagina de inicio")
    public void elUsuarioVolveraALaPaginaDeInicio() {
        theActorInTheSpotlight().attemptsTo(
                new ValidarCierreSesionTask()
        );

    }
}
