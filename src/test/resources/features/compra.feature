#language: es
#Author: hugoponcequiroz@gmail.com

Característica: Compra de Productos
  Se realiza una prueba funcional automatizada de un flujo de compra en la página https://www.demoblaze.com/

  Escenario: Compra exitosa
    Dado soy un usuario de DemoBlaze
    Cuando inicio sesion
    Cuando agrego una laptop al carrito
    Cuando agrego un monitor al carrito
    Cuando visualizo el carrito
    Cuando completo el formulario de compra
    Entonces finalizo la compra
    Y se confirma la compra

