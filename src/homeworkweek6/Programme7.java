package homeworkweek6;
//Write a program to insert any temperature value in degree Fahrenheit and
//convert to degree Celsius ((F − 32) × 5/9 = 0°C).

import java.util.Scanner;

public class Programme7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature in fahrenheit:");
        double f = scanner.nextDouble();
        double c = 5.0/9.0 * (f-32);
        System.out.println("temperature="+c);
        scanner.close();
    }
}
