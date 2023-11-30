
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Llegeix de l'usuari el radi d'un cercle,
 * en calcula l'àrea
 * i mostra el resultat a l'usuari.
 * @author ProvenSoft
 */
public class AreaCercle {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        //llegir el radi del cercle
        System.out.print("Entra el radi: ");
        try {
            double radi = lector.nextDouble();
            //calcular l'àrea
            //double area = Math.PI * radi * radi;
            double area = Math.PI * Math.pow(radi, 2);
            //mostrar resultats a l'usuari
            System.out.println("area="+area);
            System.out.format("El cercle de radi %.2f té area igual a %.2f\n", 
                    radi, area);
        } catch (InputMismatchException e){
            System.out.println("Dades incorrectes...");
        }
        System.out.println("-Fi del programa-");
    }
    
}
