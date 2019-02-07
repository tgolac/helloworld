
import java.util.Scanner;


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
        Scanner scan = new Scanner(System.in);
        boolean isCorrect = false;
        String name = "";
        while(isCorrect == false)
        {
            System.out.print("Input name: ");
            name = scan.nextLine();
            if(name.length() <= 0)
                System.out.println("Please provide your name as an argument");            
            else{
                isCorrect = true;
            }
        }
        System.out.println("Hello, " + name + "!");
        
    }
}
