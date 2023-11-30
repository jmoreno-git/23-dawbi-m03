import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class UtilitatsString {

    public static void main(String[] args) {
        String s = new String("Hola dawbio!");
        System.out.println("El teu string és: " + s);
        System.out.println("Conté "+s.length()+" caracters");
        System.out.println("Comença amb el caracter: "+ s.charAt(0));
        System.out.println("Acaba amb: "+s.charAt(s.length()-1));
        
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Digues un index per mostrar-te el caracter:");
            int idx = sc.nextInt();
            System.out.println("El caracter a l'index "+ idx + " es "+ s.charAt(idx));
            
         
        }catch(IndexOutOfBoundsException e1){
            System.out.println("Has posat un index erroni hauria "
                    + "d'anar de 0 a "+ (s.length()-1));
        }catch(InputMismatchException e2){
            System.out.println("Has d'introduir un enter");
        }
        
        String s2 = new String("Aola dawbio!");
        String s3 = new String("Lola dawbio!");
        String s4 = "Hola dawbio!";
        
        
        
    }
    
}
