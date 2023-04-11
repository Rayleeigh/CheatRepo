import java.util.Scanner;

public class AssignmentJava3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start, end, sum;
        
        System.out.println("Please enter the starting number: ");
        start = input.nextInt();
        System.out.println("Please enter the ending number: ");
        end = input.nextInt();
        
        sum = 0;
        
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        
        System.out.println("The sum of all numbers in between is: " + sum);
    }
}