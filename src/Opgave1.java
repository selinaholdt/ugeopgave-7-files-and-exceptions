import java.util.InputMismatchException;
import java.util.Scanner;

public class Opgave1 {
    private Scanner scan = new Scanner(System.in);


    public int promptNumber(String msg) {
        System.out.println(msg);
        int input = 0;
        try {
            input = Integer.parseInt(scan.nextLine());
        } catch (NumberFormatException e){
            System.out.println("Du skal indtaste et tal");
            input = promptNumber("Fejl. Prøv igen");
        }
        return input;
    }
}
