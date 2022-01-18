#language: en
Feature: eraser a added traveler
  As a Booking user
  I want to eraser a added traveler
  to verify deleted traveler


  Background:
    Given que Moni desea loguearse en la pagina Booking
    When ella ingresa el usuario y la contrasena
    Then ella se loguea correctamente en la pagina y lo verifica

  @automatizado
  Scenario: eliminar a viajero agregado recientemente
    Given Moni ingresa a la opcion de agregar viajero
    When ella elimina a viajero agregado recientemente
    Then ella deberia ver que el viajero ya no esta agregado