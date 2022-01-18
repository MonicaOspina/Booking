#language: en

Feature: Pruebas manuales

  @manuales
  @Tag1
  Scenario: Loguin fallido
    Given que Moni desea loguearse en la pagina Booking
    When ella ingresa el usuario y la contrasena
      | email             | password |
      | monipoc@gmail.com | 12345    |
    Then ella deberia ver: La combinación de e-mail y contraseña que has introducido no coinciden

  @Tag2
   Scenario: añade hotel a favorito
     Given que Moni ingresa los datos a reservar
       |  destino |  partida   | lleagada  |
       | Cartagena| 2022-01-31 | 2022-02-10 |
     When ella agrega el hotel a favoritos
     Then ella debería ver el hotel agregado en favoritos

   @Tag3
   Scenario: escoge moneda para pagar
     Given que Moni ingresa a la pagina de Booking
     When ella selecciona la moneda para pagar
     Then ella debería ver la moneda escogida

  @Tag4
  Scenario: escoge idioma para la pagina
    Given que Moni ingresa a la pagina de Booking
    When ella selecciona el idioma que prefiera para ver la pagina Booking
    Then ella debería ver el idioma escogido

  @Tag5
  Scenario: crear nuevo registro
    Given que Moni ingresa a la pagina de Booking
    When ella ingresa a Registra tu alojamiento y añade los datos para registrarse
      | email             | nombres | apellidos | celular | contrasena | confirmar contrasena |
      | tester@gmail.com | Laura    | Galindo   | 3224567890  |Aa12345678   | Aa12345678   |
    Then ella debería verificar la cuenta con el enlace mandado al correo

  @Tag6
  Scenario: Suscríbete para ver ofertas secretas
    Given que Moni ingresa a la pagina de Booking
    When ella busca la imagen para suscribirse con el correo y recibir ofertas
    Then ella debería ver el mensaje de suscripcion

  @Tag7
  Scenario: buscar vuelos
    Given que Moni ingresa a la pagina de Booking
    When ella entra los datos del vuelo
      |origen| destino | fecha-partida   | fecha-llegada  |
      |Cartagena| Medellin    | enero 31 | febrero 12 |
    Then ella deberia ver los vuelos disponibles

  @Tag8
  Scenario: buscar carros para rentar
    Given que Moni ingresa a la pagina de Booking
    When ella ingresa los datos para rentar el carro
      | origen | destino  | mes-partida  | dia-partida | mes-llegada  | dia-llegada |
      | Bogota | Medellin | Octubre     | 1            |    Octubre  | 5  |
    Then  ella deberia ver los carros disponibles

  @Tag9
  Scenario: buscar atracciones turísticas
    Given que Moni ingresa a la pagina de Booking
    When ella ingresa datos para rentar el carro
      | caja-busqueda |
      | Museo España  |
    Then  ella deberia ver los museos disponibles para visitar


