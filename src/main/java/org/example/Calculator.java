package org.example;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int ans=0;
        //Take input from use until user does not press X or x
        while (true){
            System.out.println("Enter the Operator");
           char op=in.next().charAt(0);
           System.out.println();
           if(op=='+' || op=='-' || op=='*'|| op=='/' || op=='%'){
            //input numbers
               System.out.println("Enter two numbers : ");
            int num1=in.nextInt();
            int num2= in.nextInt();
            System.out.println();

               if (op=='+'){
                   ans=num1+num2;
                }
               if (op=='-'){
                   ans=num1-num2;
               }if (op=='*'){
                   ans=num1*num2;
               }if (op=='/'){
                   if(num2!=0){
                       ans =num1/num2;
                   }
               }
               if (op=='%'){
                   ans=num1%num2;
               }
            } else if (op=='x'||op=='X') {
               break;
           }
           else {
               System.out.println("Invalid Operation");
           }
            System.out.println(ans);
        }

    }
}
