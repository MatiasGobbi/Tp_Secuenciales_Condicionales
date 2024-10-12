import java.util.Scanner;

public class Ej3Condicionales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario su género de libro favorito
        System.out.println("Ingrese su género de libro favorito:");
        System.out.println("1. Fantasía");
        System.out.println("2. Misterio");
        System.out.println("3. Romance");
        System.out.println("4. Ciencia Ficción");
        System.out.print("Seleccione el número correspondiente a su género: ");

        int genero = scanner.nextInt();
        String libroRecomendado = switch (genero) {
            case 1 -> "El Hobbit de J.R.R. Tolkien";
            case 2 -> "El código Da Vinci de Dan Brown";
            case 3 -> "Orgullo y Prejuicio de Jane Austen";
            case 4 -> "Dune de Frank Herbert";
            default -> "Género no válido. ";
        };

        System.out.println("Recomendación: " + libroRecomendado);
    }
}
