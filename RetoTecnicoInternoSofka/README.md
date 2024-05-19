


<p align="center">
  <img src="https://www.sofka.com.co/wp-content/uploads/2023/01/Sofka_logoTag_light.png" alt="Sofka Logo" width="200" />
</p>

___  
<span style="font-size: 30px; color: white;font-weight: bold;">Automatización Reto Tecnico - APIs</span>   


<span style="font-size: 25px; color: white;font-weight: bold;">Descripción y contexto</span>


---
### Objetivo:
Presentacion Reto Tecnico

___ 
<span style="font-size: 25px; color: white;font-weight: bold;">El framework</span>
---
### BDD
Se utiliza BDD como framework de automatización para la automatización de los escenarios de prueba, la idea es escribir las pruebas antes de escribir el código fuente, pero en lugar de pruebas unitarias, lo que haremos será escribir pruebas que verifiquen que el comportamiento del código es correcto desde el punto de vista de negocio. Tras escribir las pruebas escribimos el código fuente de la funcionalidad que haga que estas pruebas pasen correctamente. Después refactorizamos el código fuente.
partimos de historias de usuario, siguiendo el modelo “Como [rol ] quiero [ característica ] para que [los beneficios]”. A partir de aquí, en lugar de describir en 'lenguaje natural' lo que tiene que hacer esa nueva funcionalidad, vamos a usar un lenguaje que nos va a permitir describir todas nuestras funcionalidades de una misma forma, un lenguaje específico para BDD.
### Gherkin
Se utiliza Gherkin como lenguaje de desarrollo de las funcionalidades dado que es un lenguaje comprensible por humanos y por ordenadores, con el vamos a definir el comportamiento de la página que vamos a automatizar.
Se trata de un lenguaje fácil de leer, fácil de entender y fácil de escribir. Utilizar Gherkin nos va a permitir crear una documentación viva a la vez que automatizamos los tests, haciéndolo además con un lenguaje que puede entender negocio.
Lo bueno de Gherkin es que para empezar a hacer BDD sólo nos hace falta conocer 5 palabras, con las que construiremos sentencias con las que vamos a describir las funcionalidades:
- Feature: Indica el nombre de la funcionalidad que vamos a probar. Debe ser un título claro y explícito. Incluimos aquí una descripción en forma de historia de usuario: “Como [rol] quiero [característica] para que [los beneficios]”. Sobre esta descripción empezaremos a construir nuestros escenarios de prueba.
- Scenario: Describe cada escenario que vamos a probar.
-	Given: Provee contexto para el escenario en que se va a ejecutar el test, tales como punto donde se ejecuta el test, o prerequisitos en los datos. Incluye los pasos necesarios para poner al sistema en el estado que se desea probar.
-	When: Especifica el conjunto de acciones que lanzan el test. La interacción del usuario que acciona la funcionalidad que deseamos testear.
-	Then: Especifica el resultado esperado en el test. Observamos los cambios en el sistema y vemos si son los deseados.
Lo normal es probar distintos escenarios para comprobar una determinada funcionalidad. De esta forma vamos a pasar de nuestras historias de usuario a pruebas de comportamiento automatizables.
### Cucumber
Se utiliza cucumber como herramienta para para automatizar las pruebas en BDD. Cucumber nos va permitir ejecutar descripciones funcionales en texto plano como pruebas de software automatizadas. Totalmente compatible con el lenguaje Gherkin.

___ 
<span style="font-size: 25px; color: white;font-weight: bold;">Compilador</span>
---
Se crea el proyecto sobre gradle, es una herramienta de automatización de la construcción de nuestro código, es la versión mejorada de Maven, pero intenta llevarlo todo un paso más allá. Para empezar, se apoya en Groovy y en un DSL (Domain Specific Language) para trabajar con un lenguaje sencillo y claro a la hora de construir el build comparado con Maven. Por otro lado, dispone de una gran flexibilidad que permite trabajar con ella utilizando otros lenguajes y no solo Java. Dispone por otro lado de un sistema de gestión de dependencias sólido.
___ 
<span style="font-size: 25px; color: white;font-weight: bold;">Patrones de desarrollo</span>
---
Para el desarrollo de la automatización se utilizaron los siguientes patrones de desarrollo:
+ <span style="font-size: 15px; color: white;font-weight: bold;">Variables: </span>camelCase
+ <span style="font-size: 15px; color: white;font-weight: bold;">Funciones: </span>camelCase
+ <span style="font-size: 15px; color: white;font-weight: bold;">Clases: </span>PascalCase
+ <span style="font-size: 15px; color: white;font-weight: bold;">Paquetes: </span>camelCase

### Camel Case: 
El nombre viene porque se asemeja a las dos jorobas de un camello, y se puede dividir en dos tipos:

* **Upper Camel Case:**
Cuando la primera letra de cada una de las palabras es mayúscula. También denominado Pascal Case. Ejemplo: EjemploDeNomenclatura.

* **Lower Camel Case:**
Igual que la anterior con la excepción de que la primera letra es minúscula. Ejemplo: ejemploDeNomenclatura.
Es muy usada en los #hashTags de Twitter o en lenguajes como Java, PHP, C#…
___ 
<span style="font-size: 25px; color: white;font-weight: bold;">Prácticas de automatización</span>
---

Los tests usan tareas (tasks), interacciones (interactions), preguntas (questions), elementos de páginas (user_interface) y basicamente se tiene la siguiente estructura a nivel de proyecto de automatización.

+ <span style="font-size: 15px; color: white;font-weight: bold;">model: </span>Clases que usan el patrón DTO o relacionadas con el modelo de dominio.
+ <span style="font-size: 15px; color: white;font-weight: bold;">tasks: </span>Clases que representan tareas que realiza el actor a nivel de proceso de negocio.
+ <span style="font-size: 15px; color: white;font-weight: bold;">interacion: </span>Clases que representan las interacciones directas con la interfaz de usuario.
+ <span style="font-size: 15px; color: white;font-weight: bold;">user_interface: </span>Page Objects y Page Elements. Mapean los objetos de la interfaz de usuario **(No aplica para Auto en APIs)**.
+ <span style="font-size: 15px; color: white;font-weight: bold;">questions: </span>Objectos usados para consultar acerca del estado de la aplicación.
+ <span style="font-size: 15px; color: white;font-weight: bold;">util: </span>Una capa opcional que será creada a criterio de cada equipo en caso de que hayan utilidades que consideren se puedan reusar.
+ <span style="font-size: 15px; color: white;font-weight: bold;">exceptions: </span>Una capa donde se crearán las excepciones específicas que permitirán la legibilidad de los reportes cuando las pruebas fallen.
___ 
<span style="font-size: 25px; color: white;font-weight: bold;">Herramienta de automatización</span>
---
Se pueden utilizar los IDEs Eclipse o IntelliJ para el desarrollo de la automatización. 
+ **Eclipse** es una plataforma de desarrollo, diseñada para ser extendida de forma indefinida a través de plug-ins. Fue concebida desde sus orígenes para convertirse en una plataforma de integración de herramientas de desarrollo. No tiene en mente un lenguaje específico, sino que es un IDE genérico, aunque goza de mucha popularidad entre la comunidad de desarrolladores del lenguaje Java usando el plug-in JDT que viene incluido en la distribución estándar del IDE. Proporciona herramientas para la gestión de espacios de trabajo, escribir, desplegar, ejecutar y depurar aplicaciones.

+ **IntelliJ IDEA** es un entorno de desarrollo integrado (IDE) para el desarrollo de programas informáticos. Es desarrollado por JetBrains (anteriormente conocido como IntelliJ), y está disponible en dos ediciones: edición para la comunidad1​ y edición comercial. IntelliJ IDEA no está basada en Eclipse como MyEclipse u Oracle Enterprise Pack para Eclipse.
___
<span style="font-size: 25px; color: white;font-weight: bold;">La automatizacion es desarrollada por SOFKA TECHNOLOGIES</span>


___ 
<span style="font-size: 25px; color: white;font-weight: bold;">Otros</span>
---
* Para correr el proyecto se necesita Java JDK 1.8 y Gradle preferiblemente con la versión 4.7.
* Recomendable instalar el plugin de Cucumber.
* **Comando de ejecucion en terminal de intellij:**   ./gradlew clean test --tests co.com.reto.runners.* -i


