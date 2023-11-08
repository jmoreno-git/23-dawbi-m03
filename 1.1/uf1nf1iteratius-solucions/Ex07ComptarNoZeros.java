
import java.util.Scanner;


/**
 * Llegeix números enters
 * fins que l'usuari entra un zero
 * i diu quants han estat positius
 * i quants negatius i el total.
 * @author Jose
 */
public class Ex07ComptarNoZeros {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        //declaració de variables
        int numero;  //número entrat a cada iteració
        int total = 0;
        int numPositius = 0;
        int numNegatius = 0;
        //entrar dades i actualitzar comptadors
        do {
            //entrar número
            System.out.print("Entra un número: ");
            numero = lector.nextInt();
            //actualitzar comptadors
            if (numero != 0) {
                total++;
                if (numero > 0) {
                    numPositius++;
                } else {
                    numNegatius++;
                }
            }
        } while ( numero != 0 );
        //mostrar resultats
        System.out.println("Total: "+total);
        System.out.println("Positius: "+numPositius);
        System.out.println("Negatius: "+numNegatius);
    }
    
}
