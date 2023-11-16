
import java.util.Scanner;

/**
 * Llegeix dos nombres naturals, suma els parells i senars per separat
 * i mostra les sumes
 * @author Jose
 */
public class Ex10SumesParellsSenars {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;  //nombres a llegir
        int sumaParells = 0, sumaSenars = 0;  //sumes
        //llegir nombres
        System.out.print("Entra els dos nombres: ");
        m = sc.nextInt();
        n = sc.nextInt();
        //verificar ordenació
        if (m > n) { //invertir ordre si mal ordenats
            int aux = m;
            m = n;
            n = aux;
        }
        //calcular sumes
        for (int i = m; i <= n; i++) {
            if ((i%2)==0) {  //parell
                sumaParells += i;
            } else {  //senar
                sumaSenars += i;
            }
        }
        //mostrar resultats
        System.out.format("Suma dels parells entre %d i %d: %d\n", m, n, sumaParells);
        System.out.format("Suma dels senars entre %d i %d: %d\n", m, n, sumaSenars);
    }
    
}
