
/**
 * Hello World Example for Git demonstration.
 *
 * @author Kristina Marasovic <kristina.marasovic@rit.edu>
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide your name as an argument!");
        } else {
            System.out.println("Hello, " + args[0] + "!");
        }
    }
}
