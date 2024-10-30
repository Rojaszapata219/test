Feature: CP01 - Validar inicio de sesion

    Background: Validar el inicio de sesión con credenciales válidas e invalidas

      Given El usuario navega al sitio web

      Scenario: 1 - Validar con credenciales correctas
        When Ingresa credenciales validas
        Then La aplicacion muestra el modulo principal

      Scenario: 2 - Validar con credenciales incorrectas
        When Ingresa credenciales invalidas
        Then La aplicacion debe mostrar un mensaje de error