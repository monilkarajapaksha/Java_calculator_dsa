package org.example;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();

        for (int i=2;i<=n;i++){
            int num=a+b;
            System.out.println(num);

            a=b;
            b=num;
        }


    }
}
