
import java.util.Scanner;


/**
 *
 * @author ProvenSoft
 */
public class ComptarAminoacids {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //introduir seqüència
        System.out.print("Introdueix la seqüència: ");
        String sequencia = sc.next();
        //declarar comptadors
        int comptA = 0;
        int comptC = 0;
        int comptT = 0;
        int comptG = 0;
        int comptErr = 0;
        //fer el recompte recorrent el string
        //TODO
        for(int i = 0; i < sequencia.length(); i++){
            char aminoacid = sequencia.charAt(i);
            switch(aminoacid){
                case 'A':
                case 'a':
                    comptA++;
                    break;
                case 'C':
                case 'c':
                    comptC++;
                    break;
                case 'T':
                case 't':
                    comptT++;
                    break;
                case 'G':
                case 'g':
                    comptG++;
                    break;
                default: 
                    comptErr++;
                    break;
                
            }
        }
        //imprimir comptadors
        System.out.println("Nombre de A: "+comptA);
        System.out.println("Nombre de C: "+comptC);
        System.out.println("Nombre de T: "+comptT);
        System.out.println("Nombre de G: "+comptG);
        System.out.println("Nombre de errors: "+comptErr);
    }
    
}
