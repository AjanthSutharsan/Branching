import java.io.*;
import java.util.Scanner;
public class Question5
{
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        FileReader fr = new FileReader("palindrome.txt");
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter("palindrome.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);

        System.out.println("Please enter the word which you wish to check if it is a palindrome or not.");
        String palindrome = input.nextLine();
        String palindrome1=palindrome.toUpperCase();
        int a=palindrome1.length()/2;
        int total=0;

        for(int i=0;i<=a-1;i++) {
            if(palindrome1.charAt(i)==palindrome1.charAt(palindrome1.length()-1-i)) {
                total+=1;
            }
        }
        if(total==a) {
            System.out.println("The word you have entered is a palindrome word.");
            bw.write(palindrome);
            bw.newLine();
            bw.close();
        }
        else {
            System.out.println("The word you have entered isn't a palindrome word.");
        }

        System.out.println("Do you wish to see all the palindome words entered so far?");
        String viewWish = input.nextLine();
        String viewWish1 = viewWish.toUpperCase();
        if (viewWish1.equals("YES")) {
            String line = br.readLine();
            do {
                System.out.println(line);
            } while((line = br.readLine()) != null);
            br.close();
        }

    }
}
