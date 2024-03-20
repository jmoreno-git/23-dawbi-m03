
public abstract class Base {
	protected String nom;
	
	public Base(String nom) {
		System.out.println("Nou objecte Base");
		this.nom = nom;
	}
	
	public void saluda() {
		System.out.println("Hello "+nom);
	}
}

