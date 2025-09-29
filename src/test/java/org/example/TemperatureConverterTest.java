package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {




    @Test
    public void testFahrenheitToCelsius() {
        TemperatureConverter converter = new TemperatureConverter();

        // Test normal case
        assertEquals(0.0, converter.fahrenheitToCelsius(32.0), 0.01);

        // Test negative Fahrenheit
        assertEquals(-40.0, converter.fahrenheitToCelsius(-40.0), 0.01);

        // Test very high Fahrenheit
        assertEquals(100.0, converter.fahrenheitToCelsius(212.0), 0.01);
    }
    @Test
    public void testCelsiusToFahrenheit() {
        TemperatureConverter converter = new TemperatureConverter();

        // Test normal case
        assertEquals(32.0, converter.celsiusToFahrenheit(0.0), 0.01);

        // Test negative Celsius
        assertEquals(-40.0, converter.celsiusToFahrenheit(-40.0), 0.01);

        // Test very high Celsius
        assertEquals(212.0, converter.celsiusToFahrenheit(100.0), 0.01);
    }

    @Test
    public void testIsExtremeTemperature() {
        TemperatureConverter converter = new TemperatureConverter();

        // Test extreme temperatures
        assertTrue(converter.isExtremeTemperature(-41.0));
        assertTrue(converter.isExtremeTemperature(51.0));

        // Test non-extreme temperatures
        assertFalse(converter.isExtremeTemperature(0.0));
        assertFalse(converter.isExtremeTemperature(30.0));
    }
    @Test
    public void testOverallConversionAccuracy() {
        TemperatureConverter converter = new TemperatureConverter();

        // Test a series of conversions to ensure accuracy
        double fahrenheit = 100.0;
        double celsius = converter.fahrenheitToCelsius(fahrenheit);
        assertEquals(fahrenheit, converter.celsiusToFahrenheit(celsius), 0.01);
    }
    @Test
    public void testExtremeTemperatureHandling() {
        TemperatureConverter converter = new TemperatureConverter();

        // Ensure extreme temperature checking is correct
        assertTrue(converter.isExtremeTemperature(-50.0));
        assertTrue(converter.isExtremeTemperature(60.0));
        assertFalse(converter.isExtremeTemperature(-30.0));
        assertFalse(converter.isExtremeTemperature(40.0));
    }










}