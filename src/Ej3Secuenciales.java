/*
Ejercicio 3: Generador de Rutinas de Ejercicio
Escribe un programa que pida al usuario su nivel de condición física (principiante,
intermedio, avanzado) y luego genere una rutina de ejercicio semanal con diferentes
tipos de ejercicios y duraciones.
*/

import java.util.Scanner;

public class Ej3Secuenciales {

    //Rutinas para cada nivel
    static String principiante = """
            Objetivo: Familiarizarte con los movimientos básicos, mejorar la movilidad y ganar fuerza inicial.
            
            Día 1: Full Body
            
            1. Sentadillas (Squats): 3 series de 12 repeticiones
            2. Flexiones contra la pared o en el suelo (Push-ups): 3 series de 8 repeticiones
            3. Puente de glúteos (Glute Bridge): 3 series de 15 repeticiones
            4. Plancha (Plank): 3 series de 20 segundos
            
            Estiramiento de piernas y brazos en el suelo: 3 series de 30 segundos cada lado
            
            Día 2: Cardio y Core
            
            1. Caminar rápido o trotar: 20-30 minutos
            2. Rodillas al pecho (High Knees): 3 series de 30 segundos
            3. Crunch abdominal: 3 series de 12 repeticiones
            4. Plancha lateral: 3 series de 15 segundos por lado
            
            Día 3: Fuerza de brazos y pierna
            1. Elevación de talones (Calf Raises): 3 series de 15 repeticiones
            2. Flexiones de brazos en rodillas (Knee Push-ups): 3 series de 10 repeticiones
            3. Zancadas (Lunges): 3 series de 10 repeticiones por pierna
            4. Plancha en codos: 3 series de 20 segundos
            """;
    static String intermedio = """
            Objetivo: Desarrollar fuerza y resistencia, mejorar la técnica y añadir algo de intensidad.
            
            Día 1: Fuerza
            1. Sentadillas con salto (Jump Squats): 4 series de 12 repeticiones
            2. Flexiones (Push-ups): 4 series de 10-12 repeticiones
            3. Desplantes caminando (Walking Lunges): 3 series de 10 repeticiones por pierna
            4. Plancha lateral con elevación de cadera: 3 series de 10 repeticiones por lado
            5. Superman (Extensiones de espalda): 3 series de 15 repeticiones
            
            Día 2: Cardio y Core
            
            1. Trotar o saltar la cuerda: 20-30 minutos
            2. Mountain climbers: 4 series de 30 segundos
            3. Bicicleta abdominal (Bicycle crunch): 4 series de 20 repeticiones por lado
            4. Plancha con toques de hombros: 3 series de 30 segundos
            
            Día 3: Full Body con pesas (si es posible)
            
            1. Sentadillas con mancuernas: 4 series de 12 repeticiones
            2. Peso muerto con mancuernas (Deadlift): 4 series de 12 repeticiones
            3. Press de hombros con mancuernas: 4 series de 10 repeticiones
            4. Remo con mancuernas (Bent Over Rows): 4 series de 12 repeticiones
            
            Día 4: Cardio y flexibilidad
            
            1. HIIT básico: Alterna 30 segundos de saltos de tijera, burpees y descanso. Haz 4-5 rondas.
            2. Estiramientos dinámicos: 10 minutos
            """;
    static String avanzado = """
            Objetivo: Aumentar la intensidad, fuerza máxima y resistencia muscular, incluir ejercicios más complejos.
            
            Día 1: Piernas y glúteos
            
            1. Sentadillas búlgaras (Bulgarian Split Squats): 4 series de 12 repeticiones por pierna
            2. Peso muerto (Deadlift): 4 series de 10 repeticiones
            3. Sentadillas con salto y peso: 4 series de 15 repeticiones
            4. Zancadas con salto (Jumping Lunges): 4 series de 12 repeticiones por pierna
            
            Día 2: Fuerza de torso
            
            1. Dominadas (Pull-ups o asistidas): 4 series de 8-10 repeticiones
            2. Flexiones con palmada: 4 series de 12 repeticiones
            3. Press militar con mancuernas: 4 series de 10 repeticiones
            4. Plancha con peso: 4 series de 45 segundos
            
            Día 3: HIIT avanzado
            
            1. Burpees: 5 series de 30 segundos
            2. Sprint (sprints rápidos): 6-8 series de 30 segundos
            3. Mountain climbers avanzados: 5 series de 40 segundos
            
            Día 4: Full Body con pesas
            
            1. Sentadillas con barra: 4 series de 10 repeticiones
            2. Press de banca: 4 series de 8-10 repeticiones
            3. Peso muerto rumano (Romanian Deadlift): 4 series de 12 repeticiones
            4. Remo invertido: 4 series de 10 repeticiones
            
            Día 5: Cardio y Core
            
            1. Trotar/correr: 30-40 minutos a ritmo moderado
            2. Bicicleta abdominal: 4 series de 25 repeticiones por lado
            3. Plancha con cambios de apoyo: 4 series de 1 minuto
            """;
    public static void main(String[]args){

        //Scanner para la entrada de datos
        Scanner sc = new Scanner(System.in);

        //Pedimos que ingrese su nivel
        System.out.println("Ingrese su nivel de condición física: \n1. Principiante \n2. Intermedio \n3. Avanzado \nSu Opción: ");
        int opcion;
        opcion = sc.nextInt();

        // Ciclo para asegurarse de que el usuario ingrese una opción válida
        while (opcion < 1 || opcion > 3) {
            System.out.println("Ingrese su nivel de condición física: \n1. Principiante \n2. Intermedio \n3. Avanzado \nSu Opción: ");
            opcion = sc.nextInt();

            // Switch case para los tipos de niveles
            switch (opcion) {
                case 1:
                    System.out.println("Programa para principiantes: \n");
                    System.out.println(principiante);
                    break;
                case 2:
                    System.out.println("Programa para intermedios: \n");
                    System.out.println(intermedio);
                    break;
                case 3:
                    System.out.println("Programa para avanzados: \n");
                    System.out.println(avanzado);
                    break;
            }
        }
        sc.close();
    }
}