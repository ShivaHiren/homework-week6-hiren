package homeworkweek6;
/*Write a program to calculate the area of a triangle.*/
import java.util.Scanner;

public class Programme8 {
    public static void main(String[] args) {
        Programme8 programme8 = new Programme8();
        Programme8.myMethod();
    }
    public static void myMethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width of triangle:");
        double w = scanner.nextDouble();
        System.out.println("Enter side of traingle:");
        double s = scanner.nextDouble();
        System.out.println("Area of traingle = " + (w * s * 1 / 2));
        scanner.close();
    }
    }



