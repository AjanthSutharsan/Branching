
import java.util.Scanner;
public class Question4
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many questions were there on the test?");
        int questionNumber = input.nextInt();
        System.out.println("How many did the student correctly answer?");
        int score = input.nextInt();
        int percentage = (score*100)/questionNumber;
        if (percentage<50) {
            System.out.println("The student has gotten below 50% - the student has failed.");
        }
        else {
            System.out.println("The student has gotten above 50% - the student has passed.");
        }
    }


}
