package com.dziekan30;

public class FactorPrinter {
    public static void printFactors(int number){
        if(number<1) System.out.print("Invalid Value");
        for(int i=1; i<=number; i++){
            if(number%i==0) System.out.print(i + " ");
        }
    }
}
