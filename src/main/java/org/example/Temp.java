


package org.example;

public class Temp{

    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public boolean isExtremeTemperature(double celsius) {
        return celsius < -40 || celsius > 50;
    }

    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();

        double f = 98.6;
        double c = converter.fahrenheitToCelsius(f);
        System.out.println(f + "°F = " + String.format("%.2f", c) + "°C");

        double c2 = 37.0;
        double f2 = converter.celsiusToFahrenheit(c2);
        System.out.println(c2 + "°C = " + String.format("%.2f", f2) + "°F");

        double testTemp = -45.0;
        boolean isExtreme = converter.isExtremeTemperature(testTemp);
        System.out.println(testTemp + "°C is extreme? " + isExtreme);
    }
}
