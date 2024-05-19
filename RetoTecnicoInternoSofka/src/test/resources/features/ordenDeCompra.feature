@crearOrdenDeCompra
Feature: Crear Orden de Compra de mascota

  @crearOrdenDeCompraSuccessful
  Scenario Outline: Crear Orden de Compa de mascota
    Given envio la informacion de la Orden de compra
      | id   | petId   | quantity   |
      | <id> | <petId> | <quantity> |
    When envio la peticion "OrdenCompra" para crear la Orden de compra
    Then valido el codigo de respuesta 200
    And valido el esquema que responde "OrdenCompraSchema"
    Then envio la peticion "OrdenCompra" para consultar la Orden de compra creada
    Then valido el codigo de respuesta 200
    And valido el esquema que responde "OrdenCompraSchema"
    Examples:
      | id     | petId | quantity |
      | Random | 4     | 4        |



