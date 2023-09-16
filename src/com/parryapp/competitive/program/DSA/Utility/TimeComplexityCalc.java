package com.parryapp.competitive.program.DSA.Utility;

public class TimeComplexityCalc {

    public static String timeComplexity(long startTime, long endTime) {
        long differenceTime = endTime - startTime;
//        int finalTimeTakenInSeconds = (int) (differenceTime / 1000);
//        return finalTimeTakenInSeconds+" Seconds";

        return differenceTime + " Milliseconds";
    }
}
