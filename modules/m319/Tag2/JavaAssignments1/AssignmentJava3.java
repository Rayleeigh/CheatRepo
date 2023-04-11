package m319.Tag2.JavaAssignments1;
import java.util.Scanner;

public class AssignmentJava3 {

    int a = 0;
    int b = 0;
    int c = 0;
    int d = 0;
    int rsc = 0;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many smarties: ");
        int a = scanner.nextInt();
        System.out.println("How many people: ");
        int b = scanner.nextInt();
        int c = a / b;
        int rsc = (int) Math.floor(c);
        int d = a % b;
        System.out.println("How many per people: " + rsc);
        System.out.println("How many whole pieces are left: " + d);
    }

}