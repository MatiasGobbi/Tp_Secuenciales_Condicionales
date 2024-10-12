/*
Ejercicio 7: Calculadora de Índice de Felicidad
Escribe un programa que pida al usuario varios factores de felicidad (nivel de satisfacción con la
vida, nivel de estrés, nivel de salud, etc.) en una escala del 1 al 10 y luego calcule e imprima un
índice de felicidad basado en esos factores.
*/

import java.util.Scanner;

public class Ej7Secuenciales {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculadora de Índice de Felicidad");
        System.out.println("Por favor, ingrese una puntuación del 1 al 10 para cada factor:");

        System.out.print("Nivel de satisfacción con la vida: ");
        int satisfaccion = sc.nextInt();

        System.out.print("Nivel de estrés: ");
        int estres = sc.nextInt();

        System.out.print("Nivel de salud: ");
        int salud = sc.nextInt();

        System.out.print("Nivel de relaciones personales: ");
        int relaciones = sc.nextInt();

        System.out.print("Nivel de realización personal: ");
        int realizacion = sc.nextInt();

        System.out.print("Nivel de equilibrio trabajo-vida: ");
        int equilibrio = sc.nextInt();

        int totalFactores = 6;
        double indiceFelicidad = (satisfaccion + (10 - estres) + salud + relaciones + realizacion + equilibrio) / (double) totalFactores;

        System.out.print("Tu Índice de Felicidad es: " + indiceFelicidad + "\n");

        if (indiceFelicidad >= 8) {
            System.out.println("¡Estás en un nivel muy alto de felicidad! Sigue así.");
        } else if (indiceFelicidad >= 5) {
            System.out.println("Tienes un buen nivel de felicidad, pero hay áreas en las que podrías mejorar.");
        } else {
            System.out.println("Tu nivel de felicidad es bajo. Quizás sería útil reflexionar en los aspectos que podrían mejorarse.");
        }
    }
}
