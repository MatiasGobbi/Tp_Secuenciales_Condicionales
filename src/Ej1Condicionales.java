import java.util.Scanner;

public class Ej1Condicionales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuál es tu género de película favorito?");
        System.out.println("1. Acción");
        System.out.println("2. Comedia");
        System.out.println("3. Drama");
        System.out.println("4. Ciencia Ficción");
        System.out.print("Ingresa el número correspondiente a tu elección: ");
        int eleccion = scanner.nextInt();

        switch (eleccion) {
            case 1:
                System.out.println("Te recomendamos ver 'Mad Max: Fury Road'.");
                break;
            case 2:
                System.out.println("Te recomendamos ver 'La La Land'.");
                break;
            case 3:
                System.out.println("Te recomendamos ver 'The Shawshank Redemption'.");
                break;
            case 4:
                System.out.println("Te recomendamos ver 'Interstellar'.");
                break;
            default:
                System.out.println("Opción no válida. Por favor, elige un número entre 1 y 4.");
                break;
        }
    }
}
