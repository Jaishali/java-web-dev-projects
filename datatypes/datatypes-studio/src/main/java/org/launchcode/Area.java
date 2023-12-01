package org.launchcode;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
public class Area {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
       // System.out.println("Enter a radius: ");
        /*double radius = input.nextDouble();
        double area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius "+radius+" is:" +area);*/
       //Bonus Missions1
       /* if (input.hasNextDouble()){
           double radius = input.nextDouble();
           if(radius > 0){
               double area = Circle.getArea(radius);
               System.out.println("The area of a circle of radius "+radius+" is:" +area);
           }
           else  {
               System.out.println("sorry, the radius must be positive number");


           }
           {
                System.out.println("sorry,that was not a valid number.");
            }*/
//Bonus Missions2
double radius;
do{
    System.out.println("Please enter a positive number for the radius:");
    while(!input.hasNextDouble()){
        System.out.println("the radius must be a number! try again!");
        input.next();
    }
    radius = input.nextDouble();
}while(radius<0);
        double area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius "+radius+" is:" +area);
input.next();
        }

    }



