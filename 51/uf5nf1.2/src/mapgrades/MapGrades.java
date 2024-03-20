package mapgrades;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ProvenSoft
 */
public class MapGrades {

    private final Map<String, Integer> grades;
    
    public MapGrades() {
        this.grades = new HashMap<>();
    } 
    
    public static void main(String[] args) {
        MapGrades ap = new MapGrades();
        ap.init();
    }
    private void init() {
        generateData();
        
    }
    
    private void generateData() {
        grades.put("Andrew", 6);
        grades.put("Mary", 8);
        //..
    }


    
}
