package com.company;

public class Main {

    public static void main(String[] args) {
        byte byt = 1;
        short shor = 2;
        int in = 22;
        long lon = 555;
        float flo = 3;
        double doub = 3.14;
        char chr = 'g';
        boolean bool = true;

        System.out.println(Solution(5,3,4,2));
        System.out.println(check(4,6));
        digit(14);
        hello("mihailo");
        is_high_year(2018);
// write your code here
    }


    private static int Solution(int a, int b, int c, int d) {
    return a*(b+(c/d));
    }


    private static boolean check (int a, int b){
        if ((a+b)>=10 && (a+b)<=20)
            return true;
        else
            return false;
    }

    private static void digit (int a){
        if (a<0)
            System.out.println("Число " + a + " отрицательное");
            else
            System.out.println("Число " + a + " положительное");
    }

    private static void hello (String name){
        System.out.println("Привет, " + name + "!");
    }

    private static void is_high_year (int year){
        if (((year%4==0) && (year%100!=0))||(year%400==0))
           System.out.println(year + " високосный");
        else
                System.out.println(year + " нисокосный");
    }
}
