package lab3;

import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {

        //loop While: ใช้สำหรับการทำงานซ้ำในกรณีไม่ทราบจำนวนรอบที่แน่นอน
        //โครงสร้าง while

        //While(เงื่อนไข){
        //      คำสั่งเมื่อเงื่อนไขเป็นจริง;
        //}
        Scanner sc = new Scanner(System.in);
        int x = 1;

        while (x != 0) {
            System.out.println("Enter an number: ");
            x = sc.nextInt();
        }
        System.out.println("Good bye.");
        }
    }

