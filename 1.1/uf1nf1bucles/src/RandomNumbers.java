
import java.util.Random;

/**
 * Random generation example
 * @author Jose
 */
public class RandomNumbers {

    public static void main(String[] args) {
        //generata a floating point random number using Math.random()
        double r1 = Math.random();
        System.out.println("Random float number in [0, 1) using Math.random(): " + r1);
        //generate integer random number in interval [MIN, MAX) using Math.random()
        final int MIN = 100;
        final int MAX = 200;
        int r2 = (int) (MIN + (MAX-MIN) * Math.random());
        System.out.format("Random integer number in [%d, %d) using Math.random(): %d\n", MIN, MAX, r2);
        //generate integer random number in interval [MIN, MAX) using class Random
        Random rnd = new Random();
        int r3 = rnd.nextInt(MIN, MAX);
        System.out.format("Random integer number in [%d, %d) using Random.nextInt(): %d\n", MIN, MAX, r3);
    }
    
}
