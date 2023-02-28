package m319.Tag2.JavaAssignments1;
import java.util.Scanner;
import java.lang.Math;

public class AssignmentJava6 {

    public static void main(String[] args) {

    double base = 0;
    double expo = 0;
    double result = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("input your desired base number: ");
        base = scanner.nextDouble(); // input of base number
        System.out.println("input your desired exponent: ");
        expo = scanner.nextDouble(); // input of exponent
        result = Math.pow(base,expo); // calculating result of base and exponent
        System.out.println("the result of your numbers is: " + result); //printing result
    }
}
