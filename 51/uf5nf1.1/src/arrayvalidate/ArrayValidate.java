package arrayvalidate;


import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Provensoft
 */
public class ArrayValidate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length;
        int[] data;
        final int MIN_VALUE = 10;
        final int MAX_VALUE = 100;
        //
        try {
            System.out.print("Input length: ");
            length = sc.nextInt();
            if (length <= 0) {
                throw new InvalidArrayLengthException("Invalid value for length: "+length);
            }
            //instantiate array
            data = new int[length];
            // read data
            int counter = 0;
            do {
                try {
                    //read one element
                    System.out.printf("Input element %d: ", counter);
                    int elem = sc.nextInt();
                    //validate value
                    if (elem < MIN_VALUE) {
                        throw new TooLowValueException(
                           String.format("Value %d is lower than minim value %d", elem, MIN_VALUE)
                        );
                    }
                    if (elem > MAX_VALUE) {
                        throw new TooHighValueException(
                           String.format("Value %d is higher than maxim value %d", elem, MAX_VALUE)
                        );
                    }
                    //store element in array
                    data[counter] = elem;
                    //increase counter
                    counter++;
                } catch (InputMismatchException ex) {
                    sc.next();
                    System.out.println(ex.getMessage());
                    System.out.println("Only digits allowed. Try again.");
                } catch (TooLowValueException ex) {
                    System.out.println(ex.getMessage());
                } catch (TooHighValueException ex) {
                    System.out.println(ex.getMessage());
                }
            } while (counter < length);
            //display data
            System.out.println("Data: "+Arrays.toString(data));
        } catch (InputMismatchException ex) {
            System.out.println("Error reading array length");
        } catch (InvalidArrayLengthException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
