package m319.Tag2;

import java.util.Scanner;

public class ExampleConstants {
    
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter your first addend:");
        a = scanner.nextInt();
        System.out.print("please enter your second addend:");
        b = scanner.nextInt();
        c=a+b;
        System.out.print(a + " " + b + " " + "=" + c);
    }
}
