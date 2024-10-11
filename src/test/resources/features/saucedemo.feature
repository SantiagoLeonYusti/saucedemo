# language: es

  @tag
  Característica: Manejo del carrito en SauceDemo


  @selccionarProducto
  Escenario: El usuario selecciona un producto
    Dado Que el usuario ingresa a la pagina de productos con usuario y contraseña
    Cuando El usuario selecciona un producto
    Entonces El usuario podra ver el producto

  @agregarProducto
  Escenario: Agregar un producto al carrito
    Dado Que el usuario ingresa a la pagina de productos con usuario y contraseña
    Cuando El usuario agrega un producto al carrito
    Entonces El producto debe estar en el carrito

  @eliminarProducto
  Escenario: Eliminar un producto del carrito
    Dado Que el usuario ingresa a la pagina de productos con usuario y contraseña
    Y El usuario agrega un producto al carrito
    Cuando El usuario elimina un producto del carrito
    Entonces El carrito debe estar vacío

  @compraProducto
  Escenario: Verificar la compra de un producto
    Dado Que el usuario ingresa a la pagina de productos con usuario y contraseña
    Y El usuario agrega un producto al carrito
    Cuando Siga los pasos y finalice la compra
    Entonces El ususario tendra un mensaje de exito

  @cerrarSesion
  Escenario: Cerrar sesion
    Dado Que el usuario ingresa a la pagina de productos con usuario y contraseña
    Cuando El usuario presionar cerrar sesion
    Entonces El usuario volvera a la pagina de inicio

