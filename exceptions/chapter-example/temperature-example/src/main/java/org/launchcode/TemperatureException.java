package org.launchcode;

public class TemperatureException extends Exception  {
    // Write code here!
    private double aFahrenheit;
    private double absoluteZeroFahrenheit;
    public TemperatureException(String message) {
        super(message);


        if (aFahrenheit < absoluteZeroFahrenheit) {
            try {
                throw new TemperatureException("That temperature is too low!");
            } catch (TemperatureException e) {
                e.printStackTrace();
            }
        }
    }
}
