
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author alumne
 * L'usuari ens donarà un més en format String i el rpograma
 * printa per pantalla le número de dies que té el més
 */
public class MesosADies {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Scanner per llegir dades 
        Scanner lector = new Scanner(System.in);
        //Missatge per l'usuari
        System.out.print("Escriu un més de l'any: ");
        //String per guardar dades del usuari
        String mes = lector.next();
        //Variable per guardar els dies
        int dies=0;
        //Switch per comprovar el mes que ha posat l'usuari
        switch(mes){
            case "gener":
            case "març":
            case "maig":
            case "juliol":
            case "agost":
            case "octubre":
            case "desembre":
                dies = 31;
                break;
            case "abril":
            case "juny":
            case "setembre":
            case "novembre":
                dies = 30;
                break;
            case "febrer":
                dies = 28;
                break;
            default: 
                dies = -1;
                break;   
            
        }//Fi de switch
        
        //Imprimir el missatge
        if(dies > 0){
            System.out.println("El més "+ mes + " té "+ dies+ " dies");
        }else{
            System.out.println("Error a les dades, no és un més vàlid");
        }
        
        
        
                
                
        
    }//Fi de main
    
}//Fi de classe
