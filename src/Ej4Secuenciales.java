/*
Ejercicio 4: Generador de Listas de Reproducción
Escribe un programa que pida al usuario su estado de ánimo (feliz, triste, enérgico, relajado) y
luego genere una lista de reproducción con canciones sugeridas para ese estado de ánimo.
*/
import java.util.Scanner;

public class Ej4Secuenciales {
    //Se definen la variables
    static String feliz = """
            Feliz:
            1. "Happy" - Pharrell Williams
            2. "Can't Stop the Feeling!" - Justin Timberlake
            3. "Uptown Funk" - Mark Ronson ft. Bruno Mars
            4. "Walking on Sunshine" - Katrina and the Waves
            5. "Good as Hell" - Lizzo
            6. "Feel Good Inc." - Gorillaz
            7. "I Got a Feeling" - The Black Eyed Peas
            8. "On Top of the World" - Imagine Dragons
            9. "Shut Up and Dance" - WALK THE MOON
            10. "Sunflower" - Post Malone & Swae Lee
            """;
    static String triste = """
            Triste:
            1. "Someone Like You" - Adele
            2. "The Night We Met" - Lord Huron
            3. "Fix You" - Coldplay
            4. "Tears Dry on Their Own" - Amy Winehouse
            5. "Hurt" - Johnny Cash
            6. "Skinny Love" - Bon Iver
            7. "Let Her Go" - Passenger
            8. "I Will Always Love You" - Whitney Houston
            9. "All I Want" - Kodaline
            10. "Creep" - Radiohead
            """;
    static String energico = """
            Energético:
            1. "Eye of the Tiger" - Survivor
            2. "Stronger" - Kanye West
            3. "Lose Yourself" - Eminem
            4. "We Will Rock You" - Queen
            5. "Titanium" - David Guetta ft. Sia
            6. "Born to Run" - Bruce Springsteen
            7. "Can't Hold Us" - Macklemore & Ryan Lewis
            8. "Party Rock Anthem" - LMFAO
            9. "Don't Stop Me Now" - Queen
            10. "Thunderstruck" - AC/DC
            """;
    static String relajado = """
            Relajado:
            1. "Banana Pancakes" - Jack Johnson
            2. "Weightless" - Marconi Union
            3. "Gravity" - John Mayer
            4. "Sunset Lover" - Petit Biscuit
            5. "Come Away With Me" - Norah Jones
            6. "Breathe Me" - Sia
            7. "Pink + White" - Frank Ocean
            8. "Sweater Weather" - The Neighbourhood
            9. "Holocene" - Bon Iver
            10. "Rivers and Roads" - The Head and the Heart
            """;

    public static void main(String[]arcs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su estado de ánimo y se le recomendará una playlist! \n1. Feliz \n2. Triste \n3. Enérgico \n4. Relajado ");
        int estado_animo = sc.nextInt();
        System.out.println("Su opción fue: ");

        //switch case para los estados de animo
        switch (estado_animo){
            case 1:
                System.out.println(feliz);
                break;
            case 2:
                System.out.println(triste);
                break;
            case 3:
                System.out.println(energico);
                break;
            case 4:
                System.out.println(relajado);
                break;
            default:
                System.out.println("Opción incorrecta!");
        }
    }
}
