
import java.util.Scanner;

/**
 * Comptar aparicions d'una lletra en un text
 * @author ProvenSoft
 */
public class Exerc01 {

    public static void main(String[] args) {
        //TODO implementar preguntar el text a l'usuari
        String textAAnalitzar = "En un lugar de la Mancha de cuyo nombre no quiero acordarme";
        System.out.println(textAAnalitzar);
        Scanner sc = new Scanner(System.in);
        System.out.print("Entra el caràcter a buscar: ");
        char caracterABuscar = sc.next().charAt(0);
        int numAparicions =  comptarCharAString(textAAnalitzar, caracterABuscar);
        System.out.format("El caràcter %c apareix %d vegades%n",
                caracterABuscar, numAparicions);  
    }
    
    /**
     * compta les aparicions d'un caràcter en un text 
     * @param text el text on buscar el caràcter
     * @param c el caràcter a buscar
     * @return el nombre de vegades que es troba el caràcter en el text
     */
    public static int comptarCharAString(String text, char c) {
        int comptador = 0;
        for (int i = 0; i < text.length(); i++) {
            //obtenir el caràcter en la posició i
            char car = text.charAt(i);
            //if ( car == c ) {
            if (Character.toLowerCase(car) == Character.toLowerCase(c))  {
                comptador++;
            }
        }
        return comptador;
    }
}
