#language: en
Feature: Login
  I as a Booking  user
  I want to Login
  verify correct login

  @automatizado
    Scenario: Ingresar a la pagina de Booking y loguearme correctamente en la página
      Given que Moni desea loguearse en la pagina Booking
      When ella ingresa el usuario y la contrasena
      Then ella se loguea correctamente en la pagina y lo verifica


