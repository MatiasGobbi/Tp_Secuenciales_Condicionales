/*
Ejercicio 6: Evaluador de Hábitos Saludables
Escribe un programa que pida al usuario cuántas horas al día duerme, cuántas horas al día hace
ejercicio y cuántas comidas saludables consume al día. Luego, imprime una evaluación de sus
hábitos saludables basada en estos datos.
*/
import java.util.Scanner;

public class Ej6Condicionales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar información al usuario
        System.out.print("¿Cuántas horas al día duermes? ");
        int horas_suenio = scanner.nextInt();

        System.out.print("¿Cuántas horas al día haces ejercicio? ");
        int horas_ejercicio = scanner.nextInt();

        System.out.print("¿Cuántas comidas saludables consumes al día? ");
        int comidas_saludables = scanner.nextInt();

        // Evaluar hábitos saludables
        String evaluacion = evaluarHabitos(horas_suenio, horas_ejercicio, comidas_saludables);

        // Imprimir la evaluación
        System.out.println("Evaluación de tus hábitos saludables:");
        System.out.println(evaluacion);

        // Cerrar el escáner
        scanner.close();
    }

    public static String evaluarHabitos(int horas_suenio, int horas_ejercicio, int comidas_saludables) {
        StringBuilder resultado = new StringBuilder();

        // Evaluar horas de sueño
        if (horas_suenio >= 7) {
            resultado.append("Duerme lo suficiente, lo cual es excelente.\n");
        } else {
            resultado.append("Deberías dormir más horas para mejorar tu salud.\n");
        }

        // Evaluar horas de ejercicio
        if (horas_ejercicio >= 1) {
            resultado.append("Haces ejercicio regularmente, ¡bien hecho!\n");
        } else {
            resultado.append("Intenta hacer al menos 1 hora de ejercicio al día.\n");
        }

        // Evaluar comidas saludables
        if (comidas_saludables >= 3) {
            resultado.append("Consumes suficientes comidas saludables. ¡Sigue así!\n");
        } else {
            resultado.append("Considera aumentar el número de comidas saludables que consumes.\n");
        }

        return resultado.toString();
    }
}
