
import java.util.Random;
import java.util.Scanner;

/**
 * Programa on l’ordinador pensa un número (aleatòriament) 
 * entre 1 i 100 i l’usuari intenta endevinar-lo. 
 * El programa demanarà de forma iterativa a l’usuari 
 * que entri números i indicarà si el número a endevinar
 * és més gran o més petit. 
 * El programa acaba quan l’usuari endevina el número 
 * i s’haurà de mostrar el nombre d’intents que s’han utilitzat.
 * @author ProvenSoft
 */
public class Ex12Endevinar {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        final int MAXIM = 100;
        final int MINIM = 1;
        Random rnd = new Random();
        int numSecret = rnd.nextInt(MINIM, MAXIM);
        int numIntents = 0;  //comptador d'intents
        //endevinar
        boolean endevinat = false; //senyal de si s'ha endevinat el número secret
        do {
            //demanar número
            System.out.print("Número: ");
            int numero = lector.nextInt();  //numero intentat per l'usuari
            //incrementar el comptador d'intents
            numIntents++;
            //verificar si és el secret
            if (numero != numSecret) {  //no endevinat
                System.out.println("Has fallat!");
                //informar de si és més gran o més petit
                if ( numero > numSecret ) {
                    System.out.println("Prova'n un de més petit");
                } else {
                    System.out.println("Prova'n un de més gran");
                }
            } else {  //endevinat
                endevinat = true;
            }
        } while ( !endevinat );
        //informar a l'usuari: joc acabat
        System.out.println("L'has encertat! enhorabona!");
        System.out.println("Número d'intents: "+numIntents);
//        //Amb Math.random()
//        int numAleat = (int) Math.floor( (MAXIM - MINIM) * Math.random() );
//        System.out.println(numAleat);
//        //Amb la classe Random
//        Random rnd = new Random();
//        int numAleat2 = rnd.nextInt(MINIM, MAXIM);
//        System.out.println(numAleat2);
    
//        System.out.println("round(3.52): "+Math.round(3.52));
//        System.out.println("floor(3.52): "+Math.floor(3.52));
//        System.out.println("ceil(3.52): "+Math.ceil(3.52));
//        System.out.println("round(-3.52): "+Math.round(-3.52));
//        System.out.println("floor(-3.52): "+Math.floor(-3.52));
//        System.out.println("ceil(3.52): "+Math.ceil(-3.52)); 
//        System.out.println("round(3.5): "+Math.round(3.52));
//        System.out.println("floor(3.5): "+Math.floor(3.52));
//        System.out.println("ceil(3.5): "+Math.ceil(3.52));  
//        System.out.println("round(-3.5): "+Math.round(-3.52));
//        System.out.println("floor(-3.5): "+Math.floor(-3.52));
//        System.out.println("ceil(-3.5): "+Math.ceil(-3.52));  
//        System.out.println("round(3.42): "+Math.round(3.42));
//        System.out.println("floor(3.42): "+Math.floor(3.42));
//        System.out.println("ceil(3.42): "+Math.ceil(3.42));
    }
    
}
