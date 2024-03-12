package org.example;

public class ReverseNumber {
    public static void main(String[] args) {
        int num=23579;

        int reverse=0;
        while (num>0){
            int res=num%10;
            num=num/10;

             reverse=reverse*10+res;
        }
        System.out.println(reverse);
    }
}
