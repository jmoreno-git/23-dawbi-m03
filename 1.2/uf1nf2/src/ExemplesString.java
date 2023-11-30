public class ExemplesString {

    public static void main(String[] args) {
        String nom1 = new String("Paco");
        String nom2 = nom1;
        String nom3 = new String(nom1);
        System.out.println("nom1: "+nom1);
        System.out.println("nom2: "+nom2);
        System.out.println("nom3: "+nom3);
        System.out.println("nom1==nom2: "+(nom1==nom2));
        System.out.println("nom1==nom3: "+(nom1==nom3));
        System.out.println("nom1.equals(nom2): "+nom1.equals(nom2));
        System.out.println("nom1.equals(nom3): "+nom1.equals(nom3));
        System.out.println("Longitud de nom1: "+nom1.length());
        //recórrer els caràcters i imprimir-los
        for (int i = 0; i < nom1.length(); i++) {
            char c = nom1.charAt(i);
            System.out.println(c);
        }
        //System.out.println("Caràcter en la posició 10: "+nom1.charAt(10));
        String nom4 = "Paco";
        int comp = nom1.compareToIgnoreCase(nom4);
        System.out.println("nom1.compareTo(nom4): "+comp);
        String salutacio = "Hola";
        String salutacioAmbNom = salutacio.concat(" ").concat(nom1);
        System.out.println(salutacioAmbNom);
        int edat = 18;
        String formatted = String.format("%s tens %d anys", nom1, edat);
        System.out.println(formatted);
        System.out.println("nom1 en majúscules: "+nom1.toUpperCase());
        System.out.println("nom1 en minúscules: "+nom1.toLowerCase());
        String frase = "En un lugar de la Mancha de cuyo nombre no quiero acordarme";
        System.out.println("Comença per En? "+ frase.startsWith("En"));
        System.out.println("Acaba per rme? "+ frase.endsWith("rme"));
        System.out.println(frase.indexOf("d"));
        System.out.println(frase.lastIndexOf("nom"));
        System.out.println(frase.substring(10, 20));
        System.out.println(frase.replace('e', '3'));
    }
    
}
