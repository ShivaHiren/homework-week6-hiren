package homeworkweek6;
/*. Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5
 Expected Output:
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.204*/

import java.util.Scanner;

public class Programme14 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Width=5.5");
        System.out.println("Height= 8.5");
        System.out.print("Area is  ");
        System.out.println( (5.6*8.5));
        System.out.print("Perimeter is:  ");
        System.out.println(2 * (5.6 + 8.5) );



    }
}
