
import java.util.Scanner;

/**
 * Entra dos enters,
 * i imprimeix tots els compresos entre els dos entrats
 * incloent-hi els extrems.
 * @author ProvenSoft
 */
public class PrintInterval {

    public static void main(String[] args) {
       Scanner lector = new Scanner(System.in);
       //declara variables
       int primer;
       int segon;
       //entrada de dades
       System.out.print("Entra el primer: ");
       primer = lector.nextInt();
       System.out.print("Entra el segon: ");
       segon = lector.nextInt();
       //imprimir interval
       //Amb bucle while
        System.out.println("Amb bucle while");
        int iter = primer;  //declarar l'iterador i inicialitzar-lo
        while ( iter <= segon ) {
            //imprimir
            System.out.println(iter);
            //actualitzar iterador
            iter++;
        }
        //Amb bucle do-while
        System.out.println("Amb bucle do-while");
        int iter2 = primer;
        do {
            System.out.println(iter2);
            iter2++;
        } while ( iter2 <= segon );
        //Amb bucle for
        System.out.println("Amb bucle for");
        for (int i=primer; i<=segon; i++) {
            System.out.println(i);
        }
        //fi del programa
        System.out.println("Fi del programa");
    }
    
}
