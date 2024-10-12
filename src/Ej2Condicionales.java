import java.util.Scanner;

public class Ej2Condicionales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precioOriginal = scanner.nextDouble();

        System.out.println("Seleccione la categoría del cliente:");
        System.out.println("1. Estudiante");
        System.out.println("2. Adulto");
        System.out.println("3. Jubilado");
        System.out.print("Ingrese el número correspondiente a su categoría: ");
        int categoria = scanner.nextInt();

        double descuento = 0;

        switch (categoria) {
            case 1:
                descuento = 0.10;
                break;
            case 2:
                descuento = 0.05;
                break;
            case 3:
                descuento = 0.15;
                break;
            default:
                System.out.println("Categoría no válida. No se aplicará ningún descuento.");
        }

        double precioFinal = precioOriginal - (precioOriginal * descuento);

        System.out.print("El precio final después del descuento es: " + precioFinal);
    }
}
