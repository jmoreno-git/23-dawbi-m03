
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 * Programa que llegeix 10 nombres i compta quants són positius i quants
 * són negatius
 * @author alumne
 */
public class NegatiusPositius {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Scanner per llegir de l'usuari
        Scanner sc = new Scanner(System.in);
        
        //Missatge d'inici
        System.out.println("Introdueix 10 nombres enters");
        //Variables per comptar positius i negatius
        int comptP = 0, comptN = 0;
        //Bucle for que anirà demanant nombres a l'usuari
        for(int i = 0; i < 10; i++){
            System.out.println("Et queden per introduir "+ (10-i));
            int num = sc.nextInt();
            //comprovar si son positius o negatius
            if(num > 0){
                //Comptar positiu
                comptP++;
            }else if( num < 0){
                //comptar negatiu
                comptN++;
            } //Fi del if
                       
        }//Fi del for
        
        System.out.println("A la teva seqüència hi ha " + comptP + " nombres "
                + "positius i "+ comptN + " nombres negatius");
    }
    
}
