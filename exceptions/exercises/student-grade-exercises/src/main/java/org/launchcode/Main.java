package org.launchcode;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
    }

    public static void Divide()
    {
        // Write code here!
        int x = 1;
        int y = 0;
        try{
            int result = x / y;
            System.out.println("The result is" +result);
        }
        catch (ArithmeticException e) {
            System.out.println ("Can't be divided by Zero " + e);
        }
    }



    

    public static int CheckFileExtension(String fileName)
    {
        // Write code here!
        return 0;
    }
}