
import java.util.Scanner;
public class Question2
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 50 and 60, 50 and 60 inclusive.");
        int Number = input.nextInt();
        if (Number<50) {
            System.out.println("Too Low");
        }
        else if (Number>60) {
            System.out.println("Too High");
        }
        else {
            System.out.println("Within Range");
        }
    }


}
