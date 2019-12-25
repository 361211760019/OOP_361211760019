package lab3;

import java.util.Scanner;

public class Control1 {
    public static void main (String []args) {

        //if -> เป็นคำสั่งเลือกเงื่อนไขเป็นจริงเท่านั้น
        //โครงสร้างคำสั่ง if-else
        // if (เงื่อนไข){
        //      คำสั่งของ if เมื่อเงื่อนไขเป็นจริง;
        // }

        int x = 10;
        if (x>= 50){
            System.out.println("Yes");
        }
        System.out.println("Good Bye");

        Scanner sc = new Scanner((System.in));
        System.out.println("How old are you? : ");
        int age = sc.nextInt();
        if (age > 60){
            System.out.println("You are old (คุณแก่แล้ว).");
        }

    }
}
