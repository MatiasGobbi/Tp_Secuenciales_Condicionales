/*
Ejercicio 6: Generador de Planes de Estudio
Escribe un programa que pida al usuario cuántas horas al día puede estudiar y luego genere un
plan de estudio semanal distribuyendo esas horas en diferentes materias.
*/

import java.util.Scanner;

public class Ej6Secuenciales {
    static String una_hora = """
            Plan 1: 1 hora por día (7 horas a la semana)
            
            Objetivo: Aprender los fundamentos de la programación de forma eficiente en poco tiempo.
            
            Día 1: Introducción y sintaxis básica
            Conceptos: ¿Qué es la programación? Variables, tipos de datos.
            Práctica: Crear un programa que imprima texto y utilice variables.
            
            Día 2: Estructuras de control
            Conceptos: Condicionales (if, else) y operadores lógicos.
            Práctica: Crear un programa que tome decisiones basadas en entradas.
            
            Día 3: Bucles (Loops)
            Conceptos: for, while, do-while.
            Práctica: Crear un programa que repita una acción un número determinado de veces.
            
            Día 4: Funciones (Métodos)
            Conceptos: Definición de funciones, paso de parámetros y retorno de valores.
            Práctica: Crear un programa que use funciones para organizar el código.
            
            Día 5: Arreglos (Arrays)
            Conceptos: Qué son los arreglos, cómo se definen y cómo acceder a ellos.
            Práctica: Crear un programa que almacene y procese una lista de elementos.
            
            Día 6: Depuración básica
            Conceptos: Cómo encontrar y solucionar errores en tu código (debugging).
            Práctica: Identificar y corregir errores en un código preexistente.
            
            Día 7: Proyecto simple
            Práctica: Crear un pequeño proyecto que combine lo aprendido (como una calculadora o una lista de tareas).
            """;
    static String dos_horas = """
            Plan 2: 2 horas por día (14 horas a la semana)
            
            Objetivo: Profundizar un poco más en los fundamentos de la programación, con más práctica.
            
            Día 1: Introducción, variables y tipos de datos
            Conceptos: Diferentes tipos de datos (int, float, string, boolean).
            Práctica: Crear un programa que manipule varios tipos de datos.
            
            Día 2: Estructuras de control y operadores lógicos
            Conceptos: Condicionales anidadas, switch statements.
            Práctica: Crear un programa que implemente decisiones más complejas.
            
            Día 3: Bucles (Loops)
            Conceptos: Uso avanzado de bucles, bucles anidados.
            Práctica: Crear un programa que realice operaciones repetitivas con bucles.
            
            Día 4: Funciones y reutilización de código
            Conceptos: Ámbito de las variables, funciones recursivas.
            Práctica: Crear un programa que divida el problema en varias funciones.
            
            Día 5: Arreglos (Arrays)
            Conceptos: Uso avanzado de arreglos, recorrerlos con bucles.
            Práctica: Crear un programa que realice operaciones en listas de datos.
            
            Día 6: Introducción a estructuras de datos
            Conceptos: Listas y matrices.
            Práctica: Crear un programa que gestione datos más complejos (lista de estudiantes, por ejemplo).
            
            Día 7: Proyecto intermedio
            Práctica: Crear un proyecto que combine bucles, funciones y arreglos, como un sistema de gestión de inventarios.
            """;
    static String tres_horas = """
            Plan 3: 3 horas por día (21 horas a la semana)
            
            Objetivo: Ganar una comprensión sólida de la programación con proyectos más complejos.
            
            Día 1: Variables, tipos de datos y operadores
            Conceptos: Introducción detallada a los operadores aritméticos y lógicos.
            Práctica: Crear un programa que combine operadores en cálculos complejos.
            
            Día 2: Estructuras de control y bucles
            Conceptos: Condicionales complejas, bucles for, while, y anidados.
            Práctica: Crear un programa que utilice estructuras de control avanzadas.
            
            Día 3: Funciones y modularización
            Conceptos: Funciones con múltiples parámetros, sobrecarga de funciones.
            Práctica: Crear un programa modular, dividiendo las responsabilidades en varias funciones.
           
            Día 4: Arreglos y colecciones básicas
            Conceptos: Arrays multidimensionales, listas.
            Práctica: Crear un programa que manipule grandes conjuntos de datos.
            
            Día 5: Manejo de errores
            Conceptos: Excepciones y manejo de errores en el programa.
            Práctica: Crear un programa que incluya mecanismos de manejo de errores.
            
            Día 6: Introducción a la programación orientada a objetos (POO)
            Conceptos: Clases, objetos, métodos, encapsulación.
            Práctica: Crear un programa que defina una clase y la use para resolver un problema.
            
            Día 7: Proyecto completo
            Práctica: Crear un proyecto que combine lo aprendido, como un sistema de gestión de empleados o un juego simple.
            """;
    static String cuatro_horas = """
            Plan 4: 4 horas por día (28 horas a la semana)
            
            Objetivo: Lograr una comprensión profunda de la programación con proyectos avanzados y POO.
            
            Día 1: Variables, tipos de datos, operadores y bucles
            Conceptos: Variables, operadores avanzados, control de flujo, bucles.
            Práctica: Crear programas que utilicen bucles y operadores en problemas reales.
            
            Día 2: Funciones y modularización avanzada
            Conceptos: Funciones complejas, recursividad y modularización de problemas grandes.
            Práctica: Crear programas que dividan un problema complejo en partes más pequeñas usando funciones.
            
            Día 3: Arreglos, colecciones y manejo de datos
            Conceptos: Arrays multidimensionales, listas, conjuntos y mapas.
            Práctica: Crear programas que utilicen diferentes tipos de colecciones de datos.
            
            Día 4: Programación orientada a objetos (POO)
            Conceptos: Clases, objetos, herencia, polimorfismo, encapsulación.
            Práctica: Crear un programa que utilice objetos para representar entidades del mundo real.
            
            Día 5: Manejo de archivos
            Conceptos: Lectura y escritura de archivos.
            Práctica: Crear un programa que almacene y recupere datos de archivos.
            
            Día 6: Manejo de errores y pruebas
            Conceptos: Excepciones, manejo de errores, pruebas unitarias.
            Práctica: Crear un programa con pruebas para asegurar su correcto funcionamiento.
            
            Día 7: Proyecto avanzado
            Práctica: Crear un proyecto completo, como un juego básico o un sistema de reservas, utilizando todas las herramientas aprendidas.
            """;
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de horas empleadas en su estudio, entre 1 y 4 horas respectivamente, para un plan semanal: ");
        int horas = sc.nextInt();

        switch (horas){
            case 1:
                System.out.println(una_hora);
                break;
            case 2:
                System.out.println(dos_horas);
                break;
            case 3:
                System.out.println(tres_horas);
                break;
            case 4:
                System.out.println(cuatro_horas);
                break;
            default:
                System.out.println("Perdón!! Horas incorrectas.");
        }
    }
}
