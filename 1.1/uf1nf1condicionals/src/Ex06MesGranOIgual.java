
import java.util.Scanner;

/**
 * Demana a l'usuari dos nombres enters,
 * determina quin és el més gran o si són iguals
 * i informa del resultat a l'usuari
 * @author ProvenSoft
 */
public class Ex06MesGranOIgual {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        //demana a l'usuari els dos números
        System.out.print("Entra el primer número: ");
        int num1 = lector.nextInt();
        System.out.print("Entra el segon número: ");
        int num2 = lector.nextInt();
        //determinar quin és més gran o si són iguals
        String missatge = "";
        int major = 0;
        if ( num1 == num2 ) {   //són iguals
            missatge = "Els dos números són iguals"; 
            major = num1;
        } else {   //són diferents
            if ( num1 > num2 ) {   //el primer és el més gran
                missatge = "El més gran és el primer";
                major = num1;
            } else {   //el primer no és el més gran
                missatge = "El més gran és el segon";
                major = num2;
            }
        }
        //informar a l'usuari
        System.out.println(missatge);
        System.out.println("El valor del més gran es "+major);
        System.out.println("El valor del més gran es "+Math.max(num1, num2));
    }
    
}
