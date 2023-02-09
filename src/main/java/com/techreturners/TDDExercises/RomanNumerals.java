package com.techreturners.TDDExercises;

import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {
    public String convertNumberToRomanNumeral(int number) {

        if(number<=0 || number>3000){
            return "Number cannot be converted to Roman Numeral";
        }
        String[] romanNumbers={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] integers={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        StringBuilder romanNumeral=new StringBuilder();

        for(int roman=0;roman< integers.length;roman++){
              while(number>=integers[roman]) {
                  romanNumeral.append(romanNumbers[roman]);
                  number=number-integers[roman];
              }
        }
        return romanNumeral.toString();
    }

    public int convertRomanNumeralToNumber(String romanNumeral){


        Map<Character, Integer> romansAndNumbers = new HashMap<>();
        romansAndNumbers.put('M', 1000);
        romansAndNumbers.put('D', 500);
        romansAndNumbers.put('C', 100);
        romansAndNumbers.put('L', 50);
        romansAndNumbers.put('X', 10);
        romansAndNumbers.put('V', 5);
        romansAndNumbers.put('I', 1);

        if(romanNumeral==null){
          throw new IllegalStateException("Please enter valid Roman Numeral");
        }

        int number = 0;
        for (int i = 0; i < romanNumeral.length(); i++) {
            if (i+1 == romanNumeral.length() || romansAndNumbers.get(romanNumeral.charAt(i)) >= romansAndNumbers.get(romanNumeral.charAt(i + 1))) {
                number = number + romansAndNumbers.get(romanNumeral.charAt(i));
            } else {
                number = number - romansAndNumbers.get(romanNumeral.charAt(i));
            }
        }
        return number;
    }

}
