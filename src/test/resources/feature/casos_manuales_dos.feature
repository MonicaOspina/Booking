#language: en

Feature: Pruebas manuales

  Background:
    Given que Moni desea loguearse en la pagina Booking
    When ella ingresa el usuario y la contrasena
    Then ella se loguea correctamente en la pagina y lo verifica

  @manuales
  @Tag10
  Scenario: cancelar reserva realizada
    Given que Moni ingresa a la pagina de Booking
    When ella selecciona en su cuenta Reserva y busca alli la reserva que desea cancelar
    Then ella debería ver la reserva cancelada

  @Tag11
  Scenario: agrega tarjeta de credito
    Given que Moni ingresa a la pagina de Booking
    When ella selecciona en su cuenta Paymen Details y agrega la tarjeta de credito
    Then ella debería ver el mensaje de la tarjeta de credito añadida

  @Tag12
  Scenario: editar datos personales
    Given que Moni ingresa a la pagina de Booking
    When ella ingresa a Personal details en Gestionar cuenta y edita los datos personales que desee cambiar
    Then ella debería ver los nuevos datos personales

  @Tag13
  Scenario: editar datos de viajero agregado anteriormente
    Given que Moni ingresa a la pagina de Booking
    When ella ingresa a Other travelers en Gestionar cuenta y edita los datos del viajero agregado anteriormente
    Then ella debería ver los nuevos datos del viajero

  @Tag14
  Scenario: agrega una tarjeta de credito invalida
    Given que Moni ingresa a la pagina de Booking
    When ella selecciona en su cuenta Paymen Details y agrega la tarjeta de credito
    Then ella debería ver el mensaje de no poder agregar la tarjeta de credito

  @Tag15
  Scenario: editar preferencias
    Given que Moni ingresa a la pagina de Booking
    When ella ingresa a Preferences en Gestionar cuenta y edita los datos que desee cambiar
    Then ella debería ver los nuevos datos