package com.techreturners.TDDExercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsTest {

    @Test
    public void checkNumberToRomanNumeral(){
        RomanNumerals romanNumerals=new RomanNumerals();

        assertEquals("I",romanNumerals.convertNumberToRomanNumeral(1));
    }

    @Test
    public void checkDifferentNumberToRomanNumeral(){
        RomanNumerals romanNumerals=new RomanNumerals();

        assertEquals("III",romanNumerals.convertNumberToRomanNumeral(3));
    }

    @Test
    public void checkNumber4ToRomanNumeral(){
        RomanNumerals romanNumerals=new RomanNumerals();

        assertEquals("IV",romanNumerals.convertNumberToRomanNumeral(4));
    }

    @Test
    public void checkNumber10ToRomanNumeral(){
        RomanNumerals romanNumerals=new RomanNumerals();

        assertEquals("X",romanNumerals.convertNumberToRomanNumeral(10));
    }

    @Test
    public void checkNumber40ToRomanNumeral(){
        RomanNumerals romanNumerals=new RomanNumerals();

        assertEquals("XL",romanNumerals.convertNumberToRomanNumeral(40));
    }

    @Test
    public void checkHighNumberToRomanNumeral(){
        RomanNumerals romanNumerals=new RomanNumerals();

        assertEquals("CCLII",romanNumerals.convertNumberToRomanNumeral(252));
    }

    @Test
    public void checkHigherNumberToRomanNumeral(){
        RomanNumerals romanNumerals=new RomanNumerals();

        assertEquals("MXC",romanNumerals.convertNumberToRomanNumeral(1090));
    }

    @Test
    public void check3000NumberToRomanNumeral(){
        RomanNumerals romanNumerals=new RomanNumerals();

        assertEquals("MMM",romanNumerals.convertNumberToRomanNumeral(3000));
    }

    @Test
    public void checkInvalidNumberToRomanNumeral(){
        RomanNumerals romanNumerals=new RomanNumerals();

        assertEquals("No need to convert number above 3000",romanNumerals.convertNumberToRomanNumeral(3001));
    }

}