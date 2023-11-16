
import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class Ex02Factorial {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Entra n: ");
            int n = in.nextInt();
            if (n >= 0) {
                int fact = factorial(n);
                System.out.printf("%d! = %d%n", n, fact);            
            } else {
                System.out.println("El número no pot ser negatiu");
            }            
        } catch (Exception e) {
            System.out.println("Has d'introduir un número enter no negatiu");
        }

    }

    private static int factorial(int n) {
        int result = n;
        if (n == 0) {
            result = 1;
        } else {
            result *= factorial(n-1);
        }
        return result;
    }
    
}
