package src.main.java.org.launchcode;
import java.util.ArrayList;
import java.util.Scanner;
public class Sum {

    public static int sumEven(ArrayList<Integer> arr) {
        int numChars = 0;
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }

   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.println("Enter a word length: ");
       int numChars = input.nextInt();
   }
}
