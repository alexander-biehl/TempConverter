package com.example.temperatureconverter;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConvertUtilTest {

    @Test
    public void testConvertFahrenheitToCelsius() {
        float actual = ConverterUtil.convertCelsiusToFahrenheit(100);
        float expectedValue = 212;
        assertEquals("Conversion from celsius to fahrenheit failed",
                expectedValue,
                actual,
                0.001);
    }

    @Test
    public void testConvertCelsiusToFahrenheit() {
        float actual = ConverterUtil.convertFahrenheitToCelsius(212);
        float expectedValue = 100;
        assertEquals("Conversion from fahrenheit to celsius failed.",
                expectedValue,
                actual,
                0.001);
    }
}
