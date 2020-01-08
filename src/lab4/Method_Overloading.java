package lab4;

import java.util.Scanner;

public class Method_Overloading {

    public static void main(String[] args) {
        System.out.println(sum(10,10));
        System.out.println(sum(10.5, 20.5));
        System.out.println(sum(10,50.50));
    }

    private static int sum(int x, int y){
        return x + y;
    }
    private static double sum(double x, double y){
        return  x + y;
    }
}
