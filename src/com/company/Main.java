package com.company;

import java.util.ArrayList;

public class Main {

    static int[] numbers = new int[]{1,2,4,5};

    public static void main(String[] args) {

//        System.out.println(missingN(min()));
    }

//    public static int missingN (int min){
//        int result = 0;
//        int next = min +1;
//        if(contains(next)){
//            result = missingN(next);
//        }
//        else{
//            result = min + 1;
//        }
//        return result;
//    }

//    public static boolean contains( int element){
//        boolean bln = false;
//        for (int i : numbers) {
//            if( i == element) {
//                bln = true;
//                break;
//            }
//        }
//        return bln;
//    }

    public static int min(){
        int min = numbers[0];
        for (int i : numbers) {
            if(i < min){
              min = i;
            }
        }
        return min;
    }
}
