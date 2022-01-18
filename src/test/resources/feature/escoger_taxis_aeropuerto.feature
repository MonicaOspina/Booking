#language: en

Feature: Airport taxis on Booking
  As a Booking user
  I want to search a car at the airport
  To transport me to the airport

  @automatizado
  Scenario: Taxi aeropuerto
    Given que Moni desea loguearse en la pagina Booking
    When ella ingresa los datos para el taxi
      | lugarRecogida    | destino                               | fecha          | hora     | pasajeros |
      | Hilton Cartagena | Aeropuerto Internacional Rafael       | 31, enero 2022 |  14   | 2         |
    Then ella deberia ver los taxis disponibles