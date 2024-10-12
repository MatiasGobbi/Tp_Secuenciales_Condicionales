/*
Ejercicio 4: Calculadora de IMC con Recomendaciones
Escribe un programa que pida al usuario su peso en kilogramos y su altura en metros, y luego
calcule su Índice de Masa Corporal (IMC). Imprime una recomendación basada en el IMC (bajo
peso, peso normal, sobrepeso, obesidad).
*/

import java.util.Scanner;

public class Ej4Condicionales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su peso en kilogramos: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);
        System.out.print("Su Índice de Masa Corporal (IMC) es: " + imc + "/n" );

        if (imc < 18.5) {
            System.out.println("Recomendación: Bajo peso. Es recomendable consultar a un médico o nutricionista.");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Recomendación: Peso normal. ¡Sigue manteniendo un estilo de vida saludable!");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Recomendación: Sobrepeso. Considera mejorar tu dieta y aumentar la actividad física.");
        } else {
            System.out.println("Recomendación: Obesidad. Es importante consultar a un médico o nutricionista para recibir orientación.");
        }
    }
}
