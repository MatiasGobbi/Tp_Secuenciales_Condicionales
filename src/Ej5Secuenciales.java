/*
Ejercicio 5: Calculadora de Costo de Viaje
Escribe un programa que pida al usuario la distancia del viaje en kilómetros, el consumo de
combustible del vehículo en litros por kilómetro y el precio del combustible por litro, y luego
calcule e imprima el costo total del viaje.
*/

import java.util.Scanner;

public class Ej5Secuenciales {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculemos el costo de su viaje: ");

        System.out.println("Ingrese la distancia del viaje en kilómetros: ");
        float distancia_viaje = sc.nextFloat();

        System.out.println("A continuación, el consumo de combustible del vehículo en litros por kilómetro recorrido: ");
        float consumo_vehiculo = sc.nextFloat();

        System.out.println("Finalmente, el precio del combustible por litro: ");
        float precio_combustible = sc.nextFloat();

        float costo_total = distancia_viaje * consumo_vehiculo * precio_combustible;

        System.out.println("El costo de su viaje fue: " + costo_total + "\nMUCHAS GRACIAS!!!");
    }
}
