import java.util.Scanner;

/**
 * Hola món
 * @author ProvenSoft
 */
public class HolaMon {
    public static void main(String[] args) {
		
        //imprimir missatge
        
        System.out.print("Quants anys tens?  "); 
        Scanner lector = new Scanner(System.in); 
        int edat = lector.nextInt(); 
        System.out.println("La teva edat és: "+edat);
    } 
}
