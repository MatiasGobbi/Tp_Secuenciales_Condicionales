/*
Ejercicio 2: Calculadora de Calorías Quemadas
Escribe un programa que pida al usuario su peso en kilogramos, la duración del
ejercicio en minutos y el tipo de ejercicio (correr, nadar, andar en bicicleta),
y luego calcule e imprima las calorías quemadas. Utiliza diferentes tasas de
calorías quemadas por minuto para cada tipo de ejercicio.

*/

import java.util.Scanner;

public class Ej2Secuenciales {

    // Constantes: METs de cada ejercicio
    static final double MET_CORRER = 8.3;
    static final double MET_NADAR = 7.0;
    static final double MET_CAMINAR = 3.8;
    static final double MET_BICICLETA = 7.5;

    public static void main(String[]args){
        //Escaner para la entrada de datos del usuario
        Scanner sc = new Scanner(System.in);

        //Se pide el ingreso de datos de los kilogramos, la duración del ejercicio
        //realizado y el tipo de ejercicio.
        System.out.println("Ingrese su peso en kilogramos: ");
        float peso = sc.nextFloat();

        System.out.println("Ingrese la duración del ejercicio realizado en minutos: ");
        int duracion = sc.nextInt();

        System.out.println("Seleccione el tipo de ejercicio que realizó: ");
        System.out.println("1.Correr");
        System.out.println("2.Nadar");
        System.out.println("3.Caminar");
        System.out.println("4.Bicicleta");
        System.out.println("Su opción: ");

        int opcion = sc.nextInt();

        //Calcular las calorías quemadas con un switch
        double calorias;

        switch (opcion){
            case 1:
                calorias = MET_CORRER * peso * duracion * 0.0175;
                break;
            case 2:
                calorias = MET_NADAR * peso * duracion * 0.0175;
                break;
            case 3:
                calorias = MET_CAMINAR * peso * duracion * 0.0175;
                break;
            case 4:
                calorias = MET_BICICLETA * peso * duracion * 0.0175;
                break;
            default:
                //Mensaje de error si el usuario elige una opción incorrecta
                System.out.println("Por favor, ingrese una opción válida.");

                return; //Salir del programa si la opción es incorrecta
        }
        //Mostrar el resultado
        System.out.println("Las calorías totales quemadas son: " + calorias);
    }
}
