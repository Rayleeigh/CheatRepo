package m319.Tag2;
import java.util.Scanner;
import java.util.Random;

public class AssignmentJava2 {

    public static void main(String[] args) {

        int min =  -1000000000;
        int max  = 1000000000;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a number: ");
        int a = scanner.nextInt();

            Random rand = new Random();
            int b = rand.nextInt(max - min + 1) + min;
            int c = rand.nextInt(max - min + 1) + min;  
            int d = rand.nextInt(max - min + 1) + min;
            int e = rand.nextInt(max - min + 1) + min;
        
            System.out.println("The previous number were: " + b + " " + c + " " + a + " " + d + " " + e);
    }
}