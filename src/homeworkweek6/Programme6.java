package homeworkweek6;
//Write a program to enter any radius value of the circle and find out the
//area.(Formula of Area A=PI*r*r).

import java.util.Scanner;

public class Programme6 {
    public static void main(String[] args) {
        int r;
        float area;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any radius value:");
        r=scanner.nextInt();
        float pi= 3.14f;
        area=pi*r*r;
        System.out.println(area);
        scanner.close();
    }

}
