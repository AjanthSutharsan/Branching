
import java.util.Scanner;
public class Question3
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many goals did Team 1 score?");
        int score1 = input.nextInt();
        System.out.println("How many goals did Team 2 score?");
        int score2 = input.nextInt();
        if (score1>score2) {
            System.out.println("Points for Team 1 = 3; Points for Team 2 = 0");
        }
        else if (score1>score2) {
            System.out.println("Points for Team 1 = 1; Points for Team 2 = 1");
        }
        else {
            System.out.println("Points for Team 1 = 0; Points for Team 2 = 3");
        }
    }


}
