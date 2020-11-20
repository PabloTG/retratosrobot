# EJERCICIO JAVA - RETRATOS ROBOT
> Ciclo Formativo de Grado Superior en Desarrollo de Aplicaciones Web.<br>
> Módulo de Programación, curso 2020/2021.<br>
> Autor: Pablo Turrero García

Este programa crea retratos robot utilizando cadenas de caracteres, escogiendo por teclado una opción de las presentadas por consola para cada segmento de una cara, como se ilustra a continuación:

 - Pelo
 
	1. WWWWWWWWW
	2. \\\//////
	3. |"""""""|
	4. |||||||||
    
- Ojos

	1. | 0   0 |
	2. |-(. .)-|
	3. |-(o o)-|
	4. | \   / |
    
- Nariz

	1. @   J   @
	2. {   "   }
	3. [   j   ]
	4. <   -   >
	
- Boca

	1. |  ===  |
	2. |   -   |
	3. |  ___  |
	4. |  ---  |
	
- Barbilla

	1. \_______/
	2. \,,,,,,,/


Al combinar las diferentes selecciones, se formará una cara que se mostrará por consola. Como ejemplo, se muestra la combinación de los elementos 3, 2, 1, 4, 2:

    |"""""""|
    |-(. .)-|
    @   J   @
    |  ---  |
    \,,,,,,,/

El programa permite crear tantos retratos robot como se desee con un solo inicio de programa, mediante dos ``while`` y una variable ``repetirRetratos``.

Como avisa [la guía online del lenguaje Markdown](https://www.markdownguide.org/basic-syntax/ "Recomendada en el enunciado de la tarea"), la sintaxis puede variar entre las diferentes aplicaciones que permiten interpretar el lenguaje. Este documento tiene sentido utilizando el lector incluido en Eclipse, pero no tanto, por ejemplo, en [el lector online Dillinger](https://dillinger.io/).