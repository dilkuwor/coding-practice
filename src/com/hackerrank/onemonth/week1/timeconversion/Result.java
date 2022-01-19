package com.hackerrank.onemonth.week1.timeconversion;

class Result {
    public static void main(String[] args) {
        String s = "04:09:59AM";
        System.out.print(timeConversion(s));
    }

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        if(s.isEmpty())
            return "";
        // Write your code here
        boolean isAm = false;
        String[] splitTime = s.substring(0,8).split(":");
        isAm = s.indexOf("AM")>0?true:false;
        int hour = Integer.parseInt(splitTime[0]);
        String returnStr = "";
        if(hour == 12){
            if(isAm)
                returnStr = "00";
            else
                returnStr = "12";
        }
        else{
            if(isAm){
                returnStr = splitTime[0];
            }
            else{
                returnStr = 12+hour+"";
            }
        }

        return returnStr+":"+splitTime[1]+":"+splitTime[2];
    }

}
