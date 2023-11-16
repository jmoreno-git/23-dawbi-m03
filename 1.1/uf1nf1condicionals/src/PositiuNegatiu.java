
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Codi que donat un nombre de l'usuari ens diu si és positiu o negatiu
 * considerant el 0 positiu.
 *
 * @author alumne
 */
public class PositiuNegatiu {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        try {
            System.out.print("Introdueix un número: ");
            int num = lector.nextInt();
            if (num >= 0) {
                System.out.println("Aquest és positiu!");
            } else {
                System.out.println("Aquest és negatiu!");
            }
        } catch (InputMismatchException e) {
            System.out.println("Dada incorrecta: no és un número!");
        }

    }

}
