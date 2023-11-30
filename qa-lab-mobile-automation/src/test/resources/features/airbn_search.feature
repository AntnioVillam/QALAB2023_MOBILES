
Feature: Búsqueda de hoteles en la aplicación de Airbnb
  @test
  Scenario: Búsqueda de hoteles en la aplicación de Airbnb

    Given que me enuentro en el login de Airbnb
    And cierro cualquier ventana emergente
    When busco "Hoteles en Vichayito" en el campo de Where To?
    And selecciono Skip en el formulario de When's your trip?
    And hago clic en el botón de Search
    Then valido que hay más de 1 resultado
    And muestra el texto "Over 1,000 places"
