
public class BaseDerivMain {
	
	public static void main (String[] args) {
		Base base1 = new Base("Peter");
		System.out.println("base1.nom: "+base1.nom);
		Derivada deriv1 = new Derivada("Albert");
		System.out.println("deriv1.nom: "+deriv1.nom);
		base1.saluda();
		deriv1.saluda();
		deriv1.comiat();
	}
}

