/*
Ejercicio 5: Juego de Piedra, Papel o Tijera
Escribe un programa que pida al usuario que elija entre piedra, papel o tijera. Luego, el programa
elige una opción al azar y determina quién gana. Imprime el resultado del juego.
*/

import java.util.Random;
import java.util.Scanner;

public class Ej5Condicionales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Opciones disponibles
        String[] opciones = {"Piedra", "Papel", "Tijera"};

        // Solicitar al usuario que elija una opción
        System.out.println("Elige: Piedra, Papel o Tijera:");
        String eleccionUsuario = scanner.nextLine();

        // Validar la elección del usuario
        boolean eleccionValida = false;
        for (String opcion : opciones) {
            if (opcion.equalsIgnoreCase(eleccionUsuario)) {
                eleccionValida = true;
                break;
            }
        }

        if (!eleccionValida) {
            System.out.println("Opción inválida. Por favor, elige entre Piedra, Papel o Tijera.");
            scanner.close();
            return; // Terminar el programa si la elección no es válida
        }

        // Elegir una opción al azar para la computadora
        int indiceComputadora = random.nextInt(3);
        String eleccionComputadora = opciones[indiceComputadora];

        // Mostrar las elecciones
        System.out.println("Tu elección: " + eleccionUsuario);
        System.out.println("Elección de la computadora: " + eleccionComputadora);

        // Determinar el resultado
        if (eleccionUsuario.equalsIgnoreCase(eleccionComputadora)) {
            System.out.println("¡Es un empate!");
        } else if (
                (eleccionUsuario.equalsIgnoreCase("Piedra") && eleccionComputadora.equals("Tijera")) ||
                        (eleccionUsuario.equalsIgnoreCase("Papel") && eleccionComputadora.equals("Piedra")) ||
                        (eleccionUsuario.equalsIgnoreCase("Tijera") && eleccionComputadora.equals("Papel"))
        ) {
            System.out.println("¡Ganaste!");
        } else {
            System.out.println("¡Perdiste! La computadora ganó.");
        }

        // Cerrar el escáner
        scanner.close();
    }
}
