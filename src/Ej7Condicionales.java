/*
Ejercicio 7: Sistema de Recomendación de Actividades
Escribe un programa que pida al usuario su estado de ánimo (feliz, triste, enérgico, relajado) y luego
recomiende una actividad basada en su estado de ánimo.
*/

import java.util.Scanner;

public class Ej7Condicionales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el estado de ánimo al usuario
        System.out.println("¿Cuál es tu estado de ánimo? (feliz, triste, enérgico, relajado): ");
        String estadoAnimo = scanner.nextLine().toLowerCase();

        // Recomendar una actividad según el estado de ánimo
        String actividad = recomendarActividad(estadoAnimo);

        // Imprimir la recomendación
        System.out.println("Actividad recomendada: " + actividad);

        // Cerrar el escáner
        scanner.close();
    }

    public static String recomendarActividad(String estadoAnimo) {
        return switch (estadoAnimo) {
            case "feliz" -> "¡Ve a dar un paseo con amigos o disfruta de tu música favorita!";
            case "triste" -> "Considera ver una película divertida o leer un buen libro.";
            case "enérgico" -> "Sal a hacer ejercicio, como correr o practicar un deporte.";
            case "relajado" -> "Prueba meditar o practicar yoga para mantener la tranquilidad.";
            default -> "Estado de ánimo no reconocido. Intenta de nuevo con feliz, triste, enérgico o relajado.";
        };
    }
}