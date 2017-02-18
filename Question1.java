
import java.util.Scanner;
public class Question1
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number.");
        int num1 = input.nextInt();
        System.out.println("Enter the second number.");
        int num2 = input.nextInt();
        System.out.println("Enter the third number.");
        int num3 = input.nextInt();
        if (num1==num2 && num2==num3) {
            System.out.println("All 3 equal");
        }
        else {
            System.out.println("Not all equal");
        }
    }


}
