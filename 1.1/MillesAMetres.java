import java.util.Scanner;

/**
 * Pregunta a l'usuari una distància en milles, 
 * la converteix a metres
 * i informa a l'usuari del resultat.
 */
public class MillesAMetres {
	
	public static void main (String[] args) {
		//definim un Scanner per llegir dades de l'usuari
		Scanner lector = new Scanner(System.in);
		//definim el factor de conversió de milles a metres
		final float MILLES_A_METRES = 1852.0f;
		//llegir de l'usuari les milles a convertir
		System.out.print("Entra les milles a convertir: ");
		float milles = lector.nextFloat();
		//calcular la conversió
		float metres = milles * MILLES_A_METRES;
		//informar a l'usuari del resultat
		System.out.println("El resultat és: "+metres+" metres");
		System.out.println(milles+" milles equivalen a "+metres+" metres");
	}
}

