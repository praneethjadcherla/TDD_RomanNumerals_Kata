package com.techreturners.TDDExercises;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumerals {

    public Map romanNumeralsMap() {
        Map<String, Integer> romansAndNumbersMap = new LinkedHashMap<>();
        romansAndNumbersMap.put("M", 1000);
        romansAndNumbersMap.put("CM", 900);
        romansAndNumbersMap.put("D", 500);
        romansAndNumbersMap.put("CD", 400);
        romansAndNumbersMap.put("C", 100);
        romansAndNumbersMap.put("XC", 90);
        romansAndNumbersMap.put("L", 50);
        romansAndNumbersMap.put("XL", 40);
        romansAndNumbersMap.put("X", 10);
        romansAndNumbersMap.put("IX", 9);
        romansAndNumbersMap.put("V", 5);
        romansAndNumbersMap.put("IV", 4);
        romansAndNumbersMap.put("I", 1);
        return romansAndNumbersMap;
    }

    public String convertNumberToRomanNumeral(int number) {
        if (number <= 0 || number > 3000) {
            return "Number cannot be converted to Roman Numeral";
        }
        Map<String, Integer> map = romanNumeralsMap();
        StringBuilder romanNumeral = new StringBuilder();
        for (String roman : map.keySet()) {
            System.out.println(roman);
            while (number >= map.get(roman)) {
                romanNumeral.append(roman);
                number = number - map.get(roman);
            }
        }
        return romanNumeral.toString();
    }

    public int convertRomanNumeralToNumber(String romanNumeral) {
        Map<String, Integer> map = romanNumeralsMap();
        if (romanNumeral.equals(null)) {
            throw new IllegalStateException("Please enter valid Roman Numeral");
        }
        int number = 0;
        for (int i = 0; i < romanNumeral.length(); i++) {
            if (i + 1 == romanNumeral.length() || map.get(romanNumeral.substring(i, i + 1)) >= map.get(romanNumeral.substring(i + 1, i + 2))) {
                number = number + map.get(romanNumeral.substring(i, i + 1));
            } else {
                number = number - map.get(romanNumeral.substring(i, i + 1));
            }
        }
        return number;
    }
}
