package com.company;

public class Main {

    public static void main(String[] args) {
        // main method added for convenience and testing, not needed in that exercise
        System.out.println(isLeapYear(1981));
    }

    public static boolean isLeapYear(int year){
        if( year>0 && year<10000){
            if( (year % 400 == 0)||(year % 100 != 0 && year % 4 == 0))
                return true;
        }
        return false;
    }
}
