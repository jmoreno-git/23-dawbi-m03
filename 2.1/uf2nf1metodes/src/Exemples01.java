
import java.util.Scanner;

/**
 *
 * @author ProvenSoft
 */
public class Exemples01 {

    public static void main(String[] args) {
        //entrar el radi
        double radiEsfera = llegirDouble("Entra el radi de l'esfera: ");
        System.out.println("El radi de l'esfera és: "+radiEsfera);
        //calcular àrea esfera
        double areaEsfera = calculaAreaEsfera(radiEsfera);
        System.out.println("L'àrea de l'esfera és: "+areaEsfera);
    }
    
    /**
     * calcula l'àrea d'una esfera donat el radi
     * @param radi el radi de l'esfera
     * @return el valor de l'àrea de l'esfera
     */
    public static double calculaAreaEsfera(double radi) {
        double area = 0.0;
        area = 4.0 * Math.PI * radi * radi;
        return area;
    }
    
    /**
     * pregunta a l'usuari un valor real i el retorna
     * @param missatge el missatge amb la pregunta a fer a l'usuari
     * @return el valor real entrat per l'usuari
     */
    public static double llegirDouble(String missatge) {
        Scanner sc = new Scanner(System.in);
        System.out.print(missatge);
        double resposta = sc.nextDouble();
        return resposta;
    }
    
}
