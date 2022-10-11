package homeworkweek6;
/* Write a Java program that takes a number as input and prints its
multiplication table up to 10.
Test Data: Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80*/

import java.util.Scanner;

public class Programme10 {
    public static void main(String[] args) { table();

    }
    private static void table() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        System.out.println(num + " X 1 = " + num  );
        System.out.println(num + " X 2 = " + num * 2 );
        System.out.println(num + " X 3 = " + num * 3 );
        System.out.println(num + " X 4 = " + num * 4 );
        System.out.println(num + " X 5 = " + num * 5 );
        System.out.println(num + " X 6 = " + num * 6 );
        System.out.println(num + " X 7 = " + num * 7 );
        System.out.println(num + " X 8 = " + num * 8 );
        System.out.println(num + " X 9 = " + num * 9 );
        System.out.println(num + " X 10 = " + num * 10 );
      scanner.close();

    }

}


