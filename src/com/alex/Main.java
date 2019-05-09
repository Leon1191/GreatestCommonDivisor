package com.alex;

public class Main {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(12,30));
    }
//    public static int getGreatestCommonDivisor(int first, int second){
//     if (first < 10 || second < 10) { return -1;}
//
//     int min = 0;
//     int max = 0;
//     int ansver = 0;
//
//     if (first < second) {min = first; max = second;}
//     else {min = second; max = first;}
//         for (int i = 1;i <= min; i++) {
//
//             if ((min % i == 0) && (max % i ==0 )){ansver = i;}
//     }
//     return ansver;
//    }
public static int getGreatestCommonDivisor(int first, int second){
    if (first < 10 || second < 10) { return -1;}


    int ansver = 0;


    for (int i = 1;i <= first; i++) {

        if ((first % i == 0) && (second % i ==0 )){ansver = i;}
    }
    return ansver;
}
}
