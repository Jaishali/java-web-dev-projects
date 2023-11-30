package org.launchcode;
import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of Rectangle:");
        double length = input.nextDouble();
        System.out.println("Enter the width of Rectangle:");
        double width = input.nextDouble();
        double area = length*width;
        System.out.println("Area of Rectangle is:"+area);
    }
}
