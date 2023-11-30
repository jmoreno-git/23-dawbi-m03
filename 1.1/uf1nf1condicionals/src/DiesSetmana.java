
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author alumne
 * Llegeix un valor numèric que demanem a l'usuari 
 * en funció d'aquest valor torna el dia de la setmana corresponent
 */
public class DiesSetmana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declarem i inicialitzem el lector
        Scanner lector = new Scanner(System.in);
        //Missatge per demanar número a l'usuari
        System.out.print("Introdueix un número de l'1 al 7: ");
        //Llegim de l'usuari el número i guardem a variable dia.
        int dia = lector.nextInt();
        //Mostrem a l'usuari la dada que ens ha donat
        System.out.println("Has introduit: "+ dia);
        /*Comprovem el valor que ha introduit l'usuari i en funció
        d'aquest mostra el dia de la setmana
        */ 
    
        switch(dia){
            case 1: 
                System.out.println("Dilluns!");
                break;
            case 2: 
                System.out.println("Avui és dimarts");
                break;
            case 3:
                System.out.println("Avui és dimecres");
                break;
            case 4:
                System.out.println("Avui és dijous");
                break;
            case 5:
                System.out.println("Avui és divendres. Hurra!, demà serà dissabte");
                break;
            case 6:
                System.out.println("Avui és dissabte");
                break;
            case 7:
                System.out.println("Avui és diumenge. Ohh! demà serà dilluns");
                break;
            default:
                System.out.println("Aquesta dada no és vàlida...");
                break;
                
            
        }
        
        
        
    }
    
}
