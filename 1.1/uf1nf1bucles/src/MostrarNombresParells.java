
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 * Es demana un nombre N a l'usuari i es mostren els nombres parells 
 * d'1 a N 
 * @author alumne
 */
public class MostrarNombresParells {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Lector sc
        Scanner sc = new Scanner(System.in);
        //Missatge per l'usuari
        System.out.print("Indrodueix un nombre enter: ");
        //guardem valor a N
        int N = sc.nextInt();
//        int compt1 = 1;
//        //bucle while
//        while(compt1 < N){
//            System.out.println(compt1+1);
//            compt1 += 2;           
//        }
        //Fi de bucle
        
        //bucle do-while
        int compt2 = 1;
        do{
            System.out.println(compt2+1);
            compt2 += 2;
        }while(compt2 < N);
        
        //bucle for
        System.out.println("Bucle for");
        for(int compt3 = 1;compt3 < N; compt3+=2){
            System.out.println(compt3+1);
        }
        
        
        
    }
    
}
