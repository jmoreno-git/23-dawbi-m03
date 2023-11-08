/**
 * Imprimeix els primers 20 números naturals
 * @author ProvenSort
 */
public class Print20Enters {

    public static void main(String[] args) {
        final int LIMIT = 20;
        //Amb bucle while
        System.out.println("Amb bucle while");
        //inicialitzar comptador
        int comptador1 = 20;
        while ( comptador1 < LIMIT ) {
            System.out.println(comptador1+1);
            //comptador = comptador + 1;
            //comptador += 1;
            comptador1++;
        }
        //Amb bucle do-while
        System.out.println("Amb bucle do-while");
        //inicialitzar comptador
        int comptador2 = 20;
        do {
            System.out.println(comptador2+1);
            comptador2++;            
        } while ( comptador2 < LIMIT );
        //Amb bucle for
        System.out.println("Amb bucle for");
        for ( int comptador3 = 20; comptador3 < LIMIT; comptador3++ ) {
            System.out.println(comptador3+1);
        }
        System.out.println("Final del programa");
    }
    
}
