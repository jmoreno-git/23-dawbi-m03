
package stringexerc;

import java.util.Scanner;

/**
 * Prints vertically a text splitting in tokens using a delimiter
 * @author Jose
 */
public class SplitText {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\n");  //read until new line
        //input text
        System.out.print("Input a text: ");
        String text = scan.next();
        //remove leading and trailing whitespaces
        text = text.strip();
        //String text = scan.nextLine();
        System.out.println("Text: "+ text);
        //input character to use as a delimiter to split text
        System.out.print("Input a character: ");
        char c = scan.next().charAt(0);
        //char c = ' ';  //delimiter to search
        //iterative solution
        System.out.println("Iterative solution");
        printSplittedTextIterative(text, c);
        //recursive solution
        System.out.println("Recursive solution");
        printFirstToken(text, c);
        //solution using Scanner
        System.out.println("Solution using Scanner");
        printSplittedTextUsingScanner(text, c);
    }

    /**
     * Prints text vertically using a delimiter (iterative solucion) 
     * @param text the text to print
     * @param delimiter the delimiter to be used to split text
     */
    public static void printSplittedTextIterative(String text, char delimiter) {
        int index = 0;
        int previousIndex = -1;
        String token;
        while ((index != -1) && (index < text.length())) {
            index = text.indexOf(delimiter, previousIndex+1);
            if (index < 0) {  //delimiter not found
                token = text.substring(previousIndex+1);
            } else {  //delimiter found
                token = text.substring(previousIndex+1, index);
                previousIndex = index;
            }
            if (token.length() > 0) System.out.println(token);
        }        
    }
    
    /**
     * Prints text vertically using a delimiter (recursive solucion) 
     * @param text the text to print
     * @param delimiter the delimiter to be used to split text
     */    
    public static void printFirstToken(String text, char delimiter) {
        String token;
        int index = text.indexOf(delimiter);
        if (index < 0) {  //delimiter not found, base case
            //final case
            token = text.substring(0);
            if (token.length() > 0) System.out.println(token);
        } else {  //delimiter found, recursive case
            token = text.substring(0, index);
            if (token.length() > 0) System.out.println(token);
            printFirstToken(text.substring(index+1), delimiter);
        }
    }
    
    /**
     * Prints text vertically using a delimiter (using Scanner) 
     * @param text the text to print
     * @param delimiter the delimiter to be used to split text
     */
    public static void printSplittedTextUsingScanner(String text, char delimiter) {
        Scanner sc = new Scanner(text);
        sc.useDelimiter(String.valueOf(delimiter));
        while (sc.hasNext()) {
            String token = sc.next();
            if (token.length() > 0) System.out.println(token);
        }
    }
    
}
