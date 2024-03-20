
import java.util.Scanner;

/**
 * Programa que demana a l’usuari un nombre enter 
 * i mostra si és positiu, zero o negatiu.
 * @author ProvenSoft
 */
public class Ex04Signe {
    
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        //llegir nombre enter de l'usuari
        System.out.print("Número: ");
        int num = teclat.nextInt();
        //determinar el signe
        int signeObtingut = obteSigne(num);
        String missatge;
        switch (signeObtingut) {
            case -1:
                missatge = "negatiu";
                break;
            case 0:
                missatge = "zero";
                break;
            case 1:
                missatge = "positiu";
                break;
            default:
                throw new AssertionError();
        }
        //mostrar la informació a l'usuari
        System.out.format("El número %d és %s%n", num, missatge);
    }  //final de main()
    
    /**
     * obté el signe del paràmetre
     * @param x el número del qual s'ha d 'obtenir el signe
     * @return -1 si el paràmetre és negatiu, 0 si és 0, +1 si és positiu
     */
    public static int obteSigne(int x) {
        int signe = 0;
        if (x != 0) {
//            if (x > 0) {
//                signe = 1;
//            } else {
//                signe = -1;
//            }
            signe = (x > 0) ? 1 : -1;
        }
        return signe;
    }
    
}
