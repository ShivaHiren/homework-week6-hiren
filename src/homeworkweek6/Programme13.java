package homeworkweek6;
/*Write a Java program that takes three numbers as input to calculate and
print the average of the numbers.*/

import java.util.Scanner;

public class Programme13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        double num1 = scanner.nextDouble();
        System.out.println("Enter Second number");
        double num2 = scanner.nextDouble();
        System.out.println("Enter third number");
        double num3 = scanner.nextDouble();
        System.out.println("Average = "+ (num1+num2+num3)/3);
        scanner.close();


    }
}
