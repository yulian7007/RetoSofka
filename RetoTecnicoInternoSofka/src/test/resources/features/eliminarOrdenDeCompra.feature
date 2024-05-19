@eliminarOrdenDeCompra
Feature: Eliminar una Orden De Compra

  @eliminarOrdenDeCompraSuccessful
  Scenario: Eliminar una Orden De Compra
    Given envio la informacion de la Orden de compra
      | id |
      | 33 |
    When envio la peticion "OrdenCompra" para eliminar una Orden De Compra
    Then valido el codigo de respuesta 200
    And valido el esquema que responde "EliminarOrdenDeCompraSchema"