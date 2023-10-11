Feature: Registrarme en la pagina de AutomationTesting
  Background:
    Given el usuario abre el navegador
    When ingresa a la pagina de AutomationTesting
    And hace clic en My Acount
    And ingresa su correo "<correo>" y password "<password>" en los campos de registro
    And hace clic en "Register"

    Scenario: Registrarse correctamente en la pagina
      And ingresa su correo "brianazcona25@gmail.com" y password "Corrientes1025" en los campos de registro
      And hace clic en "Register"
      Then el usuario se registra correctamente
      And vuelve a la Home page

    Scenario Outline: Registro fallido por <motivo>
      Then el usuario falla en el registro
      And muestra un mensaje en pantalla <mensaje>

      @datosInvalids
      Examples:
        | motivo           | correo               | password       | mensaje                        |
        | correo no valido | leonidas45@otmal.com | Corrientes1025 | debe ingresar un correo valido |

      @camposIncompletos
      Examples:
        | motivo                  | correo                  | password       | mensaje                               |
        | campo de correo vacio   |                         | Corrientes1025 | debe ingresar un correo valido        |
        | campo de password vacio | brianazcona25@gmail.com |                | ingrese una password de cuenta valida |
