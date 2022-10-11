package homeworkweek6;
/*Write a program to convert the upper case to lower case.*/

import java.util.Scanner;

public class Programme9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text:");
        String upper = scanner.nextLine();
        System.out.println(upper.toLowerCase());
        scanner.close();
    }
}
