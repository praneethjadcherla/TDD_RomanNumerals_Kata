package com.techreturners.TDDExercises;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsTest {

    @Test
    public void checkNumberToRomanNumeral() {
        RomanNumerals romanNumerals = new RomanNumerals();

        assertEquals("I", romanNumerals.convertNumberToRomanNumeral(1));
    }

    @Test
    public void checkDifferentNumberToRomanNumeral() {
        RomanNumerals romanNumerals = new RomanNumerals();

        assertEquals("III", romanNumerals.convertNumberToRomanNumeral(3));
    }

    @Test
    public void checkNumber4ToRomanNumeral() {
        RomanNumerals romanNumerals = new RomanNumerals();

        assertEquals("IV", romanNumerals.convertNumberToRomanNumeral(4));
    }

    @Test
    public void checkNumber40ToRomanNumeral() {
        RomanNumerals romanNumerals = new RomanNumerals();

        assertEquals("XL", romanNumerals.convertNumberToRomanNumeral(40));
    }

    @Test
    public void checkInvalidNumberToRomanNumeral() {
        RomanNumerals romanNumerals = new RomanNumerals();

        assertEquals("Number cannot be converted to Roman Numeral", romanNumerals.convertNumberToRomanNumeral(3001));
    }

    @Test
    public void checkInvalid0NumberToRomanNumeral() {
        RomanNumerals romanNumerals = new RomanNumerals();

        assertEquals("Number cannot be converted to Roman Numeral", romanNumerals.convertNumberToRomanNumeral(0));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
    public void checkForMultipleNumbersConvertToRomanNumerals(String romanNumeral, int number) {
        RomanNumerals romanNumerals = new RomanNumerals();

        assertEquals(romanNumeral, romanNumerals.convertNumberToRomanNumeral(number));
    }

    @Test
    public void checkRomanNumeralToNumberConversion() {
        RomanNumerals romanNumerals = new RomanNumerals();

        assertEquals(1, romanNumerals.convertRomanNumeralToNumber("I"));
    }

    @Test
    public void checkVToNumberConversion() {
        RomanNumerals romanNumerals = new RomanNumerals();

        assertEquals(5, romanNumerals.convertRomanNumeralToNumber("V"));
    }

    @Test
    public void checkNinetyNineToNumberConversion() {
        RomanNumerals romanNumerals = new RomanNumerals();

        assertEquals(99, romanNumerals.convertRomanNumeralToNumber("IC"));
    }

    @Test
    public void checkRoman490ToNumberConversion() {
        RomanNumerals romanNumerals = new RomanNumerals();

        assertEquals(490, romanNumerals.convertRomanNumeralToNumber("XD"));
    }

    @Test
    public void checkInvalidRomanToNumberConversion() {
        RomanNumerals romanNumerals = new RomanNumerals();

        assertEquals(0, romanNumerals.convertRomanNumeralToNumber(""));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
    public void checkMultipleRomanToNumberConversion(String romanNumeral, int number) {
        RomanNumerals romanNumerals = new RomanNumerals();

        assertEquals(number, romanNumerals.convertRomanNumeralToNumber(romanNumeral));
    }

}
