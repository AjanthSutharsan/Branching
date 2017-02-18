
import java.util.Scanner;
public class Question6
{
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the message you wish to encrypt");
        String Message = input.nextLine();
       
        int Shift;
        do {
            System.out.println("By how many places do you wish to shift your letters in the message, making sure the number of letters you wish to shift by is between 1 and 25 inclusive?");
            Shift = input.nextInt();
        } while(Shift<1 || Shift >25);
        
        for(int i=0;i<Message.length();i++) {
            char j=Message.charAt(i);
            if(((int)j<123&&(int)j>96)||((int)j<91&&(int)j>64)) {
                if((Shift+(int)j)>122) {
                    System.out.print((char)(Shift+(int)j-26));
                }
                else if((Shift+(int)j)<=122) {
                    System.out.print((char)(Shift+(int)j));
                }
            }
            else {
                System.out.print(j);
            }
        }
        System.out.println();

    }
}
