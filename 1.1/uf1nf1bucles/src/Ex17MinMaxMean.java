
import java.util.Scanner;

/**
 * Programa que entra nombres reals fins que l’usuari vol finalitzar 
 * (cal preguntar cada vegada si es vol continuar entrant dades) 
 * i calcula el valor màxim, el valor mínim 
 * i la mitjana aritmètica dels nombres entrats. 
 * Finalment ha de mostrar els resultats.
 * @author ProvenSoft
 */
public class Ex17MinMaxMean {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        float minim = Float.MAX_VALUE;
        float maxim = Float.MIN_NORMAL;
        float mitjana = 0.0f;
        //llegir dades i calcular
        boolean finalitzar = false;
        do {
            //llegir número real
            System.out.print("Entra número: ");
            float num = lector.nextFloat();
            //actualitzar càlculs
            if (num > maxim) {
                maxim = num;
            }
            //preguntar si continuar
            System.out.print("Vols continuar (S/N): ");
            char resposta = lector.next().toLowerCase().charAt(0);
            if (resposta == 'n') {
                finalitzar = true;
            }
        } while (!finalitzar);
        //sortida de dades
        System.out.println("Mínim: "+minim);
        System.out.println("Màxim: "+maxim);
        System.out.println("Mitjana aritmètica: "+mitjana);        
    }
    
}
