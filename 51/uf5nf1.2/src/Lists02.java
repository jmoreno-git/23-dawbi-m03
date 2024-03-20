
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author ProvenSoft
 */
public class Lists02 {

    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        //names.add(new String("Peter"));
        names.add("Peter");
        names.add("Laura");
        names.add("John");
        names.add("Martha");
        names.add("Paul");
        //
        System.out.println("names: "+names);
        //
        names.add(2, "Andrew");
        System.out.println("names: "+names);
        //
        names.set(2, "Angela");
        System.out.println("names: "+names);
        //
        String n = "John";
        int index = names.indexOf(n);
        if (index >= 0) {  //found
            String oldName = names.set(index, "Louis");
            System.out.printf("%s replaced by %s%n", oldName, "Louis");
        } else {
            System.out.printf("%s no trobat%n", n);
        }
        System.out.println("names: "+names);
        //sort
        names.sort(String::compareTo);
        System.out.println("names: "+names);
        //
        addSorted(names, "Joseph");
        System.out.println("names: "+names);
        addSorted(names, "Zoe");
        System.out.println("names: "+names);
        addSorted(names, "Aaron");
        System.out.println("names: "+names);
        
    }
    
    /**
     * adds 'name' to 'data' keeping order
     * @param data the list to add to
     * @param name the new element to be added to list
     */
    public static void addSorted(List<String> data, String name) {
        int index = -1;
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).compareTo(name)>0) {
                index = i;
                break;
            }
        }
        if (index >= 0) {
            data.add(index, name);
        } else {
            data.add(name);
        }
    }
    
}
