package lab2;

import java.util.Scanner;

public class ExercisLab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your weoght: ");
        double w = sc.nextDouble();
        System.out.println("Enter your height (Meter): ");
        double h = sc.nextDouble();

        double bmi = w / (h * h);
        System.out.println("Your BMI is: " + bmi);

    }

}