Feature: Shop
  Background:
    Given el usuario se dirige a la pagina automationTesting
    When hace clic en el menu "Tienda"
@filtros
  Scenario: Verificar el filtrado por precio en la tienda
    And el usuario ajusta el filtro por precio entre 150 y 450 rps
    When el usuario hace clic en el menu "Filtro"
    Then el usuario debería poder ver solo libros con un precio entre 150 y 450 rps
@categories
  Scenario: Verificar la funcionalidad de categorías de productos
    And el usuario hace clic en cualquiera de los enlaces de productos disponibles en la categoría de productos
    Then el usuario debería poder ver solo ese producto en particular
@classification
  Scenario: Verificar la funcionalidad de clasificación predeterminada por popularidad
    And el usuario hace clic en el elemento "Ordenar por Popularidad" en el menú desplegable de clasificación predeterminada
    Then el usuario debería poder ver solo los productos populares
