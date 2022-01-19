package com.hackerrank.onemonth.week1.flippingbits;

public class FlippingBits {
    public static void main(String[] args) {
        FlippingBits b = new FlippingBits();
//

        System.out.println(flippingBits(9));
    }

    public static long flippingBits(long n) {
        // Write your code here
        int[] binaryBits = new int[32];
        int last = 31;
        while(true){
            if(n == 0)
                break;
            else{
                long temp = n%2;
                int a = (int)temp;
                binaryBits[last--] = a == 0?1:0;

                n /=2;
            }
        }

        for(int i = 0;i<last+1;i++){
            binaryBits[i] = 1;
        }

        long decimal = 0;
        int c = 0;
        for(int i = binaryBits.length-1;i>=0;i--){
            decimal +=binaryBits[i] * Math.pow(2,c);
            c++;
        }

        return decimal;

    }

    int getDecimal(long binary){

        int decimal = 0;
        int n = 0;

        while(true){
            if(binary == 0)
            {
                break;
            }
            else{

                long temp = binary%10;

                decimal +=temp*Math.pow(2,n);

                binary /=10;

                n++;

            }

        }

        return decimal;
    }
}
