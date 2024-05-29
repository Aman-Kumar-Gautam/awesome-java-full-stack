
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        System.out.println("\n Taking Input using Scanner Class");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name:  ");
        String name = sc.nextLine();
        System.out.println("Hi "+name);
        sc.close(); // Closing of Scanner Class


    }
}
