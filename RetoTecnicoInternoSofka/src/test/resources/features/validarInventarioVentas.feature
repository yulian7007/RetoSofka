@validarInventarioVentas
Feature: Validar el inventario de ventas

  @validarInventarioVentasSuccessful
  Scenario: Validar el inventario de ventas
    When envio la peticion "ValidarInventarioVentas" para consultar el inventario
    Then valido el codigo de respuesta 200
    And valido el esquema que responde "ValidarInventarioVentasSchema"

