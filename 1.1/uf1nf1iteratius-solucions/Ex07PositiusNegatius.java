
import java.util.Scanner;


/**
 *
 * @author ProvenSoft
 */
public class Ex07PositiusNegatius {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //declarar comptadors
        int comptP = 0;
        int comptN = 0;
        //llegir i comptar
        int num = 0;
        do {
            //llegir
            System.out.print("Nùmero: ");
            num = sc.nextInt();
            //evitar el zero
            if ( num != 0 ) {
                if ( num > 0 ) {
                    comptP++;
                } else {
                    comptN++;
                }
            } 
        } while ( num != 0 );
        //sortida
        System.out.println("Positius: "+comptP);
        System.out.println("Negatius: "+comptN);
        System.out.println("Totals: "+comptP+comptN);
    }
    
}
