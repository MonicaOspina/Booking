#Booking
Prueba de conocimeintos de automatización para ingresar a Devco de la pagina: https://www.booking.com/
En ella se desarrollan 5 casos de pruebas automatizados y 15 casos de pruebas manuales

##Instalacion
Se necesita tener instalado en el computador lo siguiente:
- Java 11
- IntelliJ IDEA Community Edition version 2019.3 o mas reciente
- Gradle version 7.0
- La ultima version de chrome la cual se debe de pegar en la ruta del proyecto: src\test\resources\webdriver
- Git
- "Cucumber for java" y "Gherkin" instalado desde el plugin de Intellij
- Clonar el proyecto desde github a la máquina local con el comando: `git clone https://github.com/MonicaOspina/Booking.git`
- Abrir el proyecto desde Intellij 

##Como probar los casos
- Desde la consola de Intellijse puede poner este comando: gradle clean test aggregate
- Se recomienda probar caso por caso, para eso nos vamos a la carpeta runner y buscamos el nombre del caso que queremos probar:
--lo abrimos y le damos click derecho sobre este y la opcion Run y el inmediatamente empezará a correr. Si al momento
de loguearse aparece el mensaje de mantenga pulsado para demostrar que no es un robot, debes de volver a lanzar el escenario
pues si no lo haces este no correra correctamente.

###Casos de prueba automatizados
- Para diferenciarlos de los casos de pruebas manuales, dentro de cada feature aparecera con el tag @automatizado
- Para correr el caso EliminarViajeroAgregadoRunner se debe correr primero el caso de AgregarViajeroRunner

###Casos de pruebas manuales
- Para diferenciarlos de los casos de pruebas automatizados, dentro de cada feature aparecera con el tag @manuales
- Todos los casos manuales de divideron en dos fearures:
-- En el primero estan los casos que no requieren la precondicion de estar logueados en la pagina y se pueden realizar sin ese paso previo
-- En el segundo feature estan los casos que requieren como precondicion estar logueados en la pagina para luego poder ejecutarlos.

##Reporte de evidencias
Para poder visualizarlos se debe buscar en la carpeta target\site\serenity en el archivo index.html, pero este se reescribe cada que se ejecuta un caso.