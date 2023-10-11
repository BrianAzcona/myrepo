@HomePage
Feature: Página de inicio
  Background:
    Given el usuario se dirige a la pagina automationTesting
    When hace clic en el menu "Tienda"
    And hace clic en "Inicio"

  @Sliders
  Scenario: Verificar que la página de inicio tiene solo tres Sliders
    Then se verifica que la home page tenga tres "Sliders"
  @Arrivals
  Scenario: Verificar que la página de inicio tiene solo tres "Arrivals"
    Then se verifica que la home page tiene tres "Arrivals"


  Scenario: Verificar que las imágenes en "Arrivals" son navegables
    Then se verifica que la home page tiene tres "Arrivals"
    And hace clic en una de las imagenes en "Arrivals"
    Then se navega a la siguiente pagina
    And se agrega ese libro al cesto