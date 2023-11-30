
import java.util.Scanner;


/**
 * Programa que entra un número enter N i calcula 
 * i escriu la suma i el producte dels primers N nombres naturals.
 * @author ProvenSoft
 */
public class Ex08SumaProducte {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //definició de dades
        int n;  //número entrat per l'usuari
        int suma;
        int producte;
        //llegir número
        System.out.print("Introdueix un número: ");
        n = sc.nextInt();
        //calcular suma i producte
        suma = 0;
        producte = 1;
        for (int i = n; i <= 1 ; i--) {
            suma += i;
            producte *= i; 
        }
        //mostrar resultats
        System.out.println("Suma: "+suma);
        System.out.println("Producte: "+producte);
        
        
       
        System.out.println( Float.MIN_VALUE);
        System.out.println( Float.MIN_NORMAL);
    }
    
}
