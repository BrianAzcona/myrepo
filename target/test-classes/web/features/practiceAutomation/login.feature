@login
Feature: Iniciar sesión a la cuenta
  Background:
    Given el usuario se dirige a la pagina automationTesting
    When haga clic en el menú "My Account"

  @loginExitoso
  Scenario: Login exitoso
    And ingresa el nombre de usuario "brianazcona25" y contraseña "Corrientes1025"
    And haga clic en el botón "Login"
#    Then el usuario debe iniciar sesión correctamente en la página web

 @loginFallido
 Scenario Outline: Login Fallido por <motivo>
   And ingresa el nombre de usuario "<usuario>" y contraseña "<password>"
   And hago click en el botón de "Login"
   Then La pagina muestra un mensaje <mensaje>

   @datosIncorrectos
   Examples:
     | motivo                         | usuario  | password       | mensaje                                 |
     | usuario y password incorrectos | Leonidas | Corrientes1025 | Nombre de usuario no valido, reintentar |
   @datosIncompletos
   Examples:
     | motivo              | usuario       | password       | mensaje                                 |
     | password incompleto | brianazcona25 |                | password no valida, reintentar          |
     | usuario incompleto  |               | Corrientes1025 | nombre de usuario no válido, reintentar |