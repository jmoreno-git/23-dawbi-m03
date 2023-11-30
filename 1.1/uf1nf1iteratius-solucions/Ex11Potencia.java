
import java.util.Scanner;

/**
 *
 * @author ProvenSoft
 */
public class Ex11Potencia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //llegir dades
        System.out.print("Introdueix la base i l'exponent: ");
        int base = sc.nextInt();
        int exponent = sc.nextInt();
        System.out.format("base: %d, exponent: %d\n", base, exponent);
        //TODO fer el càlcul 
        //TODO tenir en compte el cas d'exponent negatiu!
        //Considerar usar el mètode Math.abs()
        double potencia = 1.0;
        boolean error = (base == 0) && (exponent <= 0);
        if (!error) {
            int pExponent = Math.abs(exponent);
            //calcular base elevat a valor absolut de exponent
            for (int i = 0; i < pExponent; i++) {
                potencia *= base;
            }
            if (exponent < 0) {  //si exponent negatiu, invertir resultat
                potencia = 1.0 / potencia;
            }
            System.out.format("%d^%d = %f\n", base, exponent, potencia);
        } else {
            System.out.println("Error: el càlcul no es pot realitzar!");
        }


    }

}
