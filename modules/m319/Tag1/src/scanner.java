import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        System.out.println("enter your name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello " + name);
        System.out.println("enter your pin:");
        Integer pin = sc.nextInt();
        System.out.println(pin);
    }
}
