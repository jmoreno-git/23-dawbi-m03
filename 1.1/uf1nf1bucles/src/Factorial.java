
import java.util.Scanner;

/**
 * Es demana un nombre a l'usuari i calcula el factorial
 * N! = N*(N-1)*(N-2)....*1
 * @author alumne
 */
public class Factorial {

    public static void main(String[] args) {
        // TODO code application logic here
        //Lector Scanner
        Scanner reader = new Scanner(System.in);
        //Missatge a l'usuari
        System.out.println("Introdueix un nombre enter per "
                + "calcular el factorial");
        //valor del factorial introduit per l'usuari
        int N = reader.nextInt();
        //Variable per guardar el resultat del factorial
        int factorialN = N;
        for(int compt = N-1; compt > 0 ; compt--){
            //Calcul iteratiu del factorial
            factorialN *= compt;
        }
        
        //Mostrar el resultat 
        System.out.format("%d! = %d \n", N, factorialN);
    }
    
}
