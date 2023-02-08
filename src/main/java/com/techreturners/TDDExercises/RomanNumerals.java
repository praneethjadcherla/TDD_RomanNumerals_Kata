package com.techreturners.TDDExercises;

public class RomanNumerals {
    public String convertNumberToRomanNumeral(int number) {

        if(number>3000){
            return "No need to convert number above 3000";
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

}
