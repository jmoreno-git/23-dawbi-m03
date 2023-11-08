
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class Ex18Factura {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        final double PREU_OLI_GIRASOL = 3.0;
        final double PREU_OLI_OLIVA = 10.0;
        final double PREU_OLI_OLIVA_VERGE_EXTRA = 15.0;
        final String NOM_OLI_GIRASOL = "oli girasol";
        final String NOM_OLI_OLIVA = "oli oliva";
        final String NOM_OLI_OLIVA_VERGE_EXTRA = "oliva verge extra";
        //declaració de variables
        int numLinies = 0; //comptador d'entrades de factura
        double importTotal = 0.0; //import total de la factura
        boolean sortir = false;  //senyal per sortir i finalitzar
        do {
            try {
                //preguntar producte i import
                System.out.print("Introdueix el nom del producte: ");
                String producte = sc.next();
                System.out.print("Introdueix la quantitat: ");
                double quantitat = sc.nextDouble();
                //determinar preu producte
                double preuProducte = 0.0;
                switch (producte) {
                    case NOM_OLI_GIRASOL:
                        preuProducte = PREU_OLI_GIRASOL;
                        break;
                    case NOM_OLI_OLIVA:
                        preuProducte = PREU_OLI_OLIVA;
                        break;
                    case NOM_OLI_OLIVA_VERGE_EXTRA:
                        preuProducte = PREU_OLI_OLIVA_VERGE_EXTRA;
                        break;
                    default:
                        System.out.println("Producte no trobat");
                        continue;  //volver a iterar
                }
                //incrementar comptador de línies (entrades)
                numLinies++;
                //incrementar import factura
                importTotal += quantitat * preuProducte;
            } catch (InputMismatchException e) {
                sc.next();
                System.out.println("Error en dades");
            }  //final try-catch
            //preguntar si es vol entrar una altra línia
            System.out.print("Continuar comprant? (S/N)");
            char resposta = sc.next().toLowerCase().charAt(0);
            sortir = (resposta == 'n');
        } while (!sortir);
        //mostrar resultats
        System.out.println("Nombre de línies (entrades) a la factura: " + numLinies);
        System.out.println("Import total de la factura: " + importTotal);
    }   //final main()

}
