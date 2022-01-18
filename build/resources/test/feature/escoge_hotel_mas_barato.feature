#language: en
Feature: Search a hotel
  As a Booking user
  I want to search a lower cost hotel
  to verify the hotel searched


  Background:
    Given que Moni desea loguearse en la pagina Booking
    When ella ingresa el usuario y la contrasena
    Then ella se loguea correctamente en la pagina y lo verifica

  @automatizado
  Scenario: escoger hotel mas barato
    Given que Moni ingresa los datos a reservar
      | destino   | check in   | check out  |
      | Cartagena | 2022-01-31 | 2022-02-10 |
    When ella busca el hotel mas barato
    Then ella deberia ver el hotel buscado



