package m319.Tag2;

import java.util.Scanner;

public class AssignmentJava1 {
    static int a;
    static int b;
    static int c;
    static int d;
    static int y;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("define the first value: ");
        a = scanner.nextInt();
        System.out.print("define the second value: ");
        b = scanner.nextInt();
        System.out.print("define the third value: ");
        c = scanner.nextInt();
        System.out.print("define the fourth value: ");
        d = scanner.nextInt();

        y = a + b + c + d;
        System.out.println("The sum of the four values is " + y);
    }
}