package homeworkweek6;
/*Write a Java program to add two binary numbers.
Input Data:
Input first binary number: 10
Input second binary number: 11
Expected Output:
Sum of two binary numbers: 101*/


import java.util.Scanner;

public class Programme16 {
    public static void main(String[] args) {

        System.out.println("Sum of two binary numbers:  " + binary());
    }

    public static String binary() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first binary number:  ");
        String first = scanner.nextLine();
        System.out.println("Input second binary number: ");
        String second = scanner.nextLine();
        int number0 = Integer.parseInt(first, 2);
        int number1 = Integer.parseInt(second, 2);
        int sum = number0 + number1;
        return Integer.toBinaryString(sum);

    }
}
