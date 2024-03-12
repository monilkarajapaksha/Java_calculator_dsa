package org.example;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*for(int num=1;num<=5;num+=1){
            System.out.println(num);
        }

        Scanner in=new Scanner(System.in);
        int n=in.nextInt();

        for (int num=1;num<=n;num++){
            System.out.println(num);

        }*/
        Scanner in=new Scanner(System.in);

        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();

        /*int max=a;

        if (b>a){
            if (b>c){
                max=b;
            }
            else
            {
                max=c;
            }
        }
        else {
            if (a > c) {
                max = a;
            } else {
                max = c;
            }
        }*/
        int max=Math.max(c,Math.max(a,b));
         System.out.println(max);

    }
}
//do while execute at least once
