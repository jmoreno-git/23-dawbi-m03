/**
 *
 * @author Jose
 */
public class DobleBucleFor {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.format("(%d, %d)", i, j);
            }
            System.out.println("");
        }
    }
    
}
