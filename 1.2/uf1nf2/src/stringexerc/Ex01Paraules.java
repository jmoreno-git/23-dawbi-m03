
package stringexerc;

import java.util.Scanner;

/**
 *
 * @author ProvenSoft
 */
public class Ex01Paraules {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\n");
        System.out.print("Entra una frase: ");
        String frase = scan.next();
        //String frase = scan.nextLine();
        System.out.println("La frase que has entrat: "+ frase);
        //
        char c = ' ';  //caràcter a buscar
        //solució recursiva
        primeraParaula(frase, c);
        //solució iterativa
//        int index = 0;
//        int indexPrevi = -1;
//        String paraula;
//        while ((index != -1) && (index < frase.length())) {
//            index = frase.indexOf(c, indexPrevi+1);
//            if (index < 0) {  //caràcter no trobat
//                paraula = frase.substring(indexPrevi+1);
//            } else {  //caràcter trobat
//                paraula = frase.substring(indexPrevi+1, index);
//                indexPrevi= index;
//            }
//            System.out.println(paraula);
//        }
        
        //solució utilitzant Scanner
//        Scanner strScan = new Scanner(frase);
//        scan.useDelimiter(String.valueOf(c));
//        while (strScan.hasNext()) {
//            String paraula = strScan.next();
//            System.out.println(paraula);
//        }
    }
    
    public static void primeraParaula(String text, char c) {
        String paraula = "";
        int index = text.indexOf(c);
        if (index < 0) {
            paraula = text.substring(0);
            System.out.println(paraula);
        } else {
            paraula = text.substring(0, index);
            System.out.println(paraula);
            primeraParaula(text.substring(index+1), c);
        }
    }
    
}
