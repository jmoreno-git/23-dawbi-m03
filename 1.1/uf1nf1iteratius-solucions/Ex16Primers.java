
import java.util.Scanner;

/**
 * Llegeix un nombre natural N
 * i mostra els que entre 1 i N són primers així com quants en són.
 * @author Jose
 */
public class Ex16Primers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;  //nombres 
        int numPrimers = 0;  //quantitat de nombres primers trobats
        //llegir nombre
        System.out.print("Entra els nombre natural: ");
        num = sc.nextInt();
        //recórrer nombres entre 1 i N
        for (int i = 1; i <= num; i++) {
            //verificar la condició de nombre primer
            boolean esPrimer = true;
            for (int j = 2; j <= i/2; j++) {
                if (i%j == 0) {  //i és divisible entre j, per tant, no és primer
                    esPrimer = false;
                    break;
                }
            }
            //incrementar comptador de primers i mostrar el nombre primer trobat
            if (esPrimer) {
                numPrimers++;
                System.out.format("%d ", i);
            }
        }
        System.out.println("");
        //mostrar resultat
        System.out.format("Total de nombres primers trobats entre 1 i %d: %d\n", num, numPrimers);
    }
    
}
