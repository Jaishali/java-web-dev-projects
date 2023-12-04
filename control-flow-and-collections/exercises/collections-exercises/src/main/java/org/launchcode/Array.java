package src.main.java.org.launchcode;
import java.util.Scanner;
import java.util.Arrays;
public class Array
{
    public static void main(String[] args) {
    int[] integerArray = {1, 1, 2, 3, 5, 8};

    for(int i =1; i < integerArray.length;i= i+2){

            System.out.println(integerArray[i]
            );

        }
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = phrase.split(" ");
       System.out.println(Arrays.toString(words));
        String[] arrayName = phrase.split(" ");
        System.out.println(Arrays.toString(arrayName));

       // String[] arrayName = phrase.split("\\. ");
        //System.out.println(Arrays.toString(arrayName));

        String[] sentences = phrase.split("\\.");
        System.out.println(Arrays.toString(sentences));
    }
}

