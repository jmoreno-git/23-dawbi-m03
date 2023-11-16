
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class Ex06PositNeg {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MAX_NUMS = 5;
        int numero;  //número entrat per l'usuari
        int numPositius = 0;
        int numNegatius = 0;
        //llegir i processar dades
        for (int i = 0; i < MAX_NUMS; i++) {
            try {
                //llegir número
                System.out.format(
                        "Entra el número %2d: ",
                        i);
                numero = sc.nextInt();
                //descartar els zeros
                if (numero != 0) {
                    //actualitzar comptadors de positius i negatius
                    if (numero > 0) {
                        numPositius++;
                    } else {
                        numNegatius++;
                    }
                } else {  //descartar els zeros
                    i--;
                }
            } catch (InputMismatchException e) {
                //consumir l'entrada incorrecta
                sc.next();
                i--;
            }
        } //final for
        System.out.println("Nombre de positius: " + numPositius);
        System.out.println("Nombre de negatius: " + numNegatius);

    }

}
