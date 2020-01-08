package lab4;

import java.util.Scanner;

public class Method_Exercise {
    //1. เขียนโปรแกรมเพื่อรับค่าจำนวนจริง 2 จำนวน จากนั้นสร้างเมธอดสำหรับ
    //บวก ลบ คูณ หาร แสดงผลทางจอดภาพ

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number 1: ");
        double x = sc.nextDouble();
        System.out.print("Enter a number 2: ");
        double y = sc.nextDouble();
        //display
        System.out.println("The summation of "+x+"and "+y+":"+sum(x,y));
        System.out.println("The summation of "+x+"and "+y+":"+sud(x,y));
        System.out.println("The summation of "+x+"and "+y+":"+mul(x,y));
        System.out.println("The summation of "+x+"and "+y+":"+div(x,y));
    }
    //บวก
    public static double sum (double x, double y){
        return x + y;
    }
    public static double sud (double x, double y){
        return x - y;
    }
    public static double mul (double x, double y){
        return x * y;
    }
    public static double div (double x, double y){
        return x / y;
    }
    //sud
    //mul
    //div

}
