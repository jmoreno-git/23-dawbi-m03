
import java.util.Scanner;

/**
 *
 * @author Aquest programa demana l'edat a l'usuari, comprova que l'edat sigui
 * major a 0 i després comprova si està jubilat. Si és major o igual a 67 està
 * jubilat, en cas contrari no està jubilat
 */
public class Jubilacio {

    public static void main(String[] args) {
        int edat;
        Scanner lector = new Scanner(System.in);
        //Preguntem a l'usuari l'edat
        System.out.print("Posa la teva edat: ");
        //Llegim l'entrada de l'usuari
        edat = lector.nextInt();
        String missatge;
        //Inici de les comprovacions, primer mirem edat >= 0
        if (edat >= 0) {
//Condicional que comprova edat de jubilació
            if (edat >= 67) {
                //Missatge afirmant jubilació
                missatge = "Estàs jubilat!";
            } else {
                //Missatge indicant que no estàs jubilació
                missatge = "Encara no estàs jubilat...";
            }
        } else {
            //Missatge d'edat no vàlida
            missatge = "L'edat no és vàlida";
        }
        //Mostrar a l'usuari el missatge 
        System.out.println(missatge);

    }

}
