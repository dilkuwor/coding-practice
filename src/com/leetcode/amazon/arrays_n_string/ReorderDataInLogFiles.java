package com.leetcode.amazon.arrays_n_string;

import java.util.Arrays;
import java.util.Comparator;

public class ReorderDataInLogFiles {
    public static void main(String[] args) {
        ReorderDataInLogFiles ds = new ReorderDataInLogFiles();
        String[] logs = {"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"};
        //output = ["let1 art can","let3 art zero","let2 own kit dig","dig1 8 1 5 1","dig2 3 6"]

        String log1 = "dig1 8 1 5 1";
        String[] split1 = log1.split(" ",2);

        System.out.println(Arrays.toString(ds.reorderLogFiles(logs)));

String[] arr = {"abc","bca","dca","apple"};

//        Comparator<String> myComparator = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        };
//        System.out.println("Arrays before sorting");
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arr));
//        Arrays.sort(arr,reorderLogFiles);
//
//        System.out.println(Arrays.toString(arr));
    }

    public String[] reorderLogFiles(String[] logs){

        Comparator<String> myComparator = new Comparator<String>(){

            @Override
            public int compare(String log1, String log2){

                String[] split1 = log1.split(" ",2);
                String[] split2 = log2.split(" ",2);

                Boolean isDigit1 = Character.isDigit(split1[1].charAt(0));
                Boolean isDigit2 = Character.isDigit(split2[1].charAt(0));

                if(!isDigit1 && !isDigit2){
                    //compare content first
                    int c = split1[1].compareTo(split2[1]);
                    if(c!=0)
                        return c;
                    return split1[0].compareTo(split2[0]);
                }
                else if(!isDigit1 && isDigit2)
                {
                    //digit is larger than letter->letter comes before digit
                    return -1;
                }
                else if (isDigit1 && !isDigit2)
                {
                    return 1;
                }
                else
                    return 0;

            }

        };

        Arrays.sort(logs,myComparator);

        return logs;


    }
}
