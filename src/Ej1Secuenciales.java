/*
Ejercicio 1: Generador de Horóscopo
Escribe un programa que pida al usuario su fecha de nacimiento (en formato DD/MM/AAAA) y luego
imprima su signo del zodiaco y un mensaje de horóscopo correspondiente.

*/

import java.util.Scanner;

public class Ej1Secuenciales {
    static String mensaje_horoscopo_acuario = ("Tu creatividad y espíritu libre son un faro para los demás. No temas ser diferente, porque es tu originalidad la que te llevará lejos.");
    static String mensaje_horoscopo_piscis = ("Tienes un corazón lleno de empatía y una intuición profunda. Confía en ti mismo y en tu capacidad para navegar cualquier situación con calma y sabiduría.");
    static String mensaje_horoscopo_aries = ("Eres pura energía y determinación. Cada desafío que enfrentas te fortalece, sigue adelante con tu pasión porque tu coraje te llevará al éxito.");
    static String mensaje_horoscopo_tauro = ("Tu perseverancia y sentido práctico son inquebrantables. Recuerda que cada pequeño paso cuenta, y el esfuerzo constante te llevará a conquistar tus metas.");
    static String mensaje_horoscopo_geminis = ("Tu mente inquieta y curiosa te abre puertas inimaginables. No dejes que nada te detenga, sigue explorando, aprendiendo y conectando con los demás.");
    static String mensaje_horoscopo_cancer = ("Tu sensibilidad y cuidado hacia los demás son regalos que compartes con el mundo. Recuerda también cuidarte a ti mismo, porque el equilibrio te dará la fuerza para seguir creciendo.");
    static String mensaje_horoscopo_leo = ("Tu luz interior brilla intensamente y motiva a los que te rodean. No temas mostrar tu grandeza, tu liderazgo y confianza te llevarán a lograr cosas extraordinarias.");
    static String mensaje_horoscopo_virgo = ("Tu atención al detalle y tu sentido del orden son herramientas poderosas. No te preocupes por la perfección, lo que haces ya es valioso y cada paso te acerca a la maestría.");
    static String mensaje_horoscopo_libra = ("Tu búsqueda de la armonía y la justicia te convierte en una fuerza equilibrante en el mundo. Confía en tu capacidad para encontrar soluciones pacíficas, tu equilibrio te llevará lejos.");
    static String mensaje_horoscopo_escorpio = ("Tu intensidad y determinación son incomparables. Sigue confiando en tu intuición y en tu capacidad para transformar cualquier situación en algo positivo.");
    static String mensaje_horoscopo_sagitario = ("Tu espíritu aventurero y optimismo son contagiosos. Sigue explorando nuevas ideas y caminos, porque cada experiencia te acerca más a la libertad que tanto anhelas.");
    static String mensaje_horoscopo_capricornio = ("La disciplina que pones en todo lo que haces es tu fuerza más grande. Sigue avanzando con paciencia, los resultados que esperas están más cerca de lo que imaginas.");

    public static void GeneradorHoroscopo(int dia, int mes){

        if (((mes == 1) && (dia >= 20)) || ((mes == 2) && (dia <= 18))) {
            System.out.println("Tu signo es: Acuario " + "\n" + "Mensaje motivador: " + mensaje_horoscopo_acuario);
        } else if (mes == 2 || mes == 3 && dia <= 20) {
            System.out.println("Tu signo es: Piscis " + "\n" + "Mensaje motivador: " + mensaje_horoscopo_piscis);
        } else if (mes == 3 || mes == 4 && dia <= 19) {
            System.out.println("Tu signo es: Aries " + "\n" + "Mensaje motivador: " + mensaje_horoscopo_aries);
        } else if (mes == 4 || mes == 5 && dia <= 20) {
            System.out.println("Tu signo es: Tauro " + "\n" + "Mensaje motivador: " + mensaje_horoscopo_tauro);
        } else if (mes == 5 || mes == 6 && dia <= 20) {
            System.out.println("Tu signo es: Géminis " + "\n" + "Mensaje motivador: " + mensaje_horoscopo_geminis);
        } else if (mes == 6 || mes == 7 && dia <= 22) {
            System.out.println("Tu signo es: Cáncer " + "\n" + "Mensaje motivador: " + mensaje_horoscopo_cancer);
        } else if (mes == 7 || mes == 8 && dia <= 22) {
            System.out.println("Tu signo es: Leo " + "\n" + "Mensaje motivador: " + mensaje_horoscopo_leo);
        } else if (mes == 8 || mes == 9 && dia <= 22) {
            System.out.println("Tu signo es: Virgo " + "\n" + "Mensaje motivador: " + mensaje_horoscopo_virgo);
        } else if (mes == 9 || mes == 10 && dia <= 22) {
            System.out.println("Tu signo es: Libra " + "\n" + "Mensaje motivador: " + mensaje_horoscopo_libra);
        } else if (mes == 10 || mes == 11 && dia <= 21) {
            System.out.println("Tu signo es: Escorpio " + "\n" + "Mensaje motivador: " + mensaje_horoscopo_escorpio);
        } else if (mes == 11 || mes == 12 && dia <= 21) {
            System.out.println("Tu signo es: Sagitario " + "\n" + "Mensaje motivador: " + mensaje_horoscopo_sagitario);
        } else if (mes == 12 || mes == 1) {
            System.out.println("Tu signo es: Capricornio " + "\n" + "Mensaje motivador: " + mensaje_horoscopo_capricornio);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dia = 0, mes = 0, anio = 0, dia_minimo = 0, dia_maximo = 31, mes_minimo = 0, mes_maximo = 12, anio_minimo = 0;
        System.out.println("Ingrese su fecha de nacimiento: (Formato: dd/mm/aaaa)");
        String fecha = scanner.nextLine();
        try {
            dia = Integer.parseInt((fecha.split("/")[0]));
            mes = Integer.parseInt((fecha.split("/")[1]));
            anio = Integer.parseInt((fecha.split("/")[2]));
        } catch (NumberFormatException e) {
            System.out.println("Formato inválido, error: " + e);
        }
        if (dia > dia_minimo && dia <= dia_maximo){
            if (mes > mes_minimo && mes <= mes_maximo){
                if (anio > anio_minimo){
                    GeneradorHoroscopo(dia, mes);
                } else System.out.println("Año inválido");
            } else System.out.println("Mes inválido");
        } else System.out.println("Día inválido");
    }
}

