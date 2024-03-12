package org.example;

import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        int num=77777923;
        int count=0;
        while (num>0){
            int temp=num%10;
            if(temp==7){
                count++;

            }
            num=num/10;
        }
        System.out.println(count);
    }
}
