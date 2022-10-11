package homeworkweek6;
//. Write a Java program to swap two variables.

import java.util.Scanner;

public class Programme15 {
    public static void main(String[] args) {
        String Apple, banana, fruit;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert first name");
        Apple = scanner.nextLine();
        System.out.println("Insert second name");
        banana = scanner.nextLine();
        fruit = Apple;
        Apple = fruit;
        fruit = fruit;

        System.out.println("Swapped name:  " + Apple + "--->" + banana);
        scanner.close();


    }
}


