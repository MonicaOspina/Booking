#language: en
Feature: add traveler
  As a Booking user
  I want to  add traveler
  to verify added traveler

  Background:
    Given que Moni desea loguearse en la pagina Booking
    When ella ingresa el usuario y la contrasena
    Then ella se loguea correctamente en la pagina y lo verifica

  @automatizado
  Scenario: añadir viajante
    Given Moni ingresa a la opcion de agregar viajero
    When ella ingresa los datos del viajante
      | nombre | apellido | dia | mes | ano |
      | Luis   | Cardona  | 20  | 07  | 2000|
    Then ella deberia ver a Luis agregado


