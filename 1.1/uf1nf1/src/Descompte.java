/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author alumne
 */
public class Descompte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double preuReal = 12.50;
        double preuReduit = 10.00;
        
        double descompte = 100 - ((preuReduit/preuReal) * 100);
        
        System.out.format("El descompte és de -> %.2f",descompte);
        
    }
    
}
