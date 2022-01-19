package com.leetcode.amazon.arrays_n_string;

/**
 * 12. Integer to Roman
 * Medium
 */
public class IntegerToRomain {
    public static void main(String[] args) {
        int num = 1994;
        IntegerToRomain r = new IntegerToRomain();
        System.out.println(r.intToRomain(num));
    }
    public String intToRoman1(int num){
        if(num<1 || num>3999)
            return null;
        StringBuilder builder = new StringBuilder();
        while(num>0){
            if(num>=1 && num<5){
                if(num >= 4){
                    builder.append("IV");
                    num -=4;
                }
                else{
                    builder.append("I");
                    num--;
                }
            }
            else if (num>=5 && num<10){
                if(num >= 9){
                    builder.append("IX");
                    num -=9;
                }
                else{
                    builder.append("V");
                    num = num-5;
                }
            }
            else if (num>=10 && num<50){
                if(num >= 40){
                    builder.append("XL");
                    num -=40;
                }
                else{
                    builder.append("X");
                    num -= 10;
                }
            }
            else if (num>=50 && num<100){
                if(num >= 90){
                    builder.append("XC");
                    num -=90;
                }
                else{
                    builder.append("L");
                    num -= 50;
                }
            }
            else if (num>=100 && num<500){
                if(num >= 400){
                    builder.append("CD");
                    num -=400;
                }
                else{
                    builder.append("C");
                    num = num-100;
                }
            }
            else if (num>=500 && num<1000){
                if(num >= 900){
                    builder.append("CM");
                    num -=900;
                }
                else{
                    builder.append("D");
                    num = num-500;
                }
            }
            else if (num>=1000){
                builder.append("M");
                num = num-1000;
            }
        }
        return builder.toString();
    }

    public String intToRomain(int num){
        StringBuilder builder = new StringBuilder();
        String[] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int [] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        for(int i = 0;i<values.length;i++){
            while(num>=values[i]){
                num -=values[i];
                builder.append(roman[i]);
            }
        }

        return builder.toString();

    }
}
