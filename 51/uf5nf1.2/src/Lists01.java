
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author ProvenSoft
 */
public class Lists01 {

    public static void main(String[] args) {
        //Collection<Integer> data = new ArrayList<>(); 
        List<Integer> data = new ArrayList<>(); 
        //add data to collection
        //data.add(Integer.valueOf(23));
        data.add(23);
        data.add(12);
        data.add(10);
        data.add(45);
        //
        System.out.println("Number of elements: "+data.size());
        // iterate with for-each loop
        System.out.println("iterate with for-each loop");
        for (Integer elem : data) {
            System.out.println(elem);
        }
        //iterate with iterator
        System.out.println("iterate with iterator");
        Iterator<Integer> iter = data.iterator();
        while (iter.hasNext()) {
            Integer elem = iter.next();
            System.out.println(elem);
        }
        //toString
        System.out.println("data: "+data.toString());
        //contains?
        System.out.println("Collection contains value 12: "+data.contains(12));
        System.out.println("Collection contains value 66: "+data.contains(66));
        //=======LIST========
        System.out.println("Index of value 10: "+data.indexOf(10));
        System.out.println("Index of value 66: "+data.indexOf(66));
        System.out.println("Element at index 1: "+data.get(1));
        //modify element
        data.set(1, 40);
        System.out.println("data: "+data);
        //iterate with for loop
        System.out.println("iterate with for loop");
        for (int i = 0; i < data.size(); i++) {
            System.out.printf("data[%d]: %d%n", i, data.get(i));
        }
        //remove elements
        System.out.println("Remove value 40");
        data.remove(Integer.valueOf(40));
        System.out.println("data: "+data);
        System.out.println("Remove element at index 1");
        System.out.println("Element removed: "+data.remove(1));
        
    }
    
}
