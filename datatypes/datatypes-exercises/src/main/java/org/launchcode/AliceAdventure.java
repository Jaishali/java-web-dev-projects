package org.launchcode;
import java.util.Scanner;
public class AliceAdventure {
    public static void main(String[] args){
        String str = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do:";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the text to be search:");
        String text = input.nextLine();
        String input1 = text.toLowerCase();
        String str1 = str.toLowerCase();
        if(str1.contains(input1)) {
            System.out.println("text found");
            System.out.println(str.indexOf(input1));
            System.out.println(input1.length());
            System.out.println(str);
        }

        else {
            System.out.println("text not found");
        }
    }
}
