package m319.Tag2.JavaAssignments1;
import java.util.Scanner;

public class AssignmentJava5 {
        public static void main(String[] args) {
            double angleInDegrees;
            double angleInRadians;
             Scanner sc = new Scanner(System.in);
            System.out.print("Enter an angle in degrees: ");
            angleInDegrees = sc.nextDouble();
            
            angleInRadians = angleInDegrees * (Math.PI / 180);
            System.out.println("The angle in Radians is " + angleInRadians);
        }
        
}
