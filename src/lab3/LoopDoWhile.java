package lab3;

import java.util.Scanner;

public class LoopDoWhile {
    public static void main(String[] args) {
        // do-while -> ทำงานเช่นเดียวกับ while แต่จะทำคำสั่งในลูปก่อน 1 ครั้งเสมอจึงทดสอบเงื่อนไข
        // ดังนั้นจะหมายความว่า ไม่ว่าเงื่อนไขจะเป็นจริงเป็นเท้จ คำสั่งในลูปจะถูกทำงานแล้วอย่างน้อง 1 ครั้ง

        // do{
        //      คำสั่งเมื่อเงื่อนไขเป็นจริง
        // }while(เงื่อนไข);

        Scanner sc = new Scanner(System.in);
        int x = 1;
        do {
            System.out.println("Enter an number: ");
             x = sc.nextInt();
        }while (x !=0);

        System.out.println("Good bye.");
        System.out.println("Good bye.");
    }
}
