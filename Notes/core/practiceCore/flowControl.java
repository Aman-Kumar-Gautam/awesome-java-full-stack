
import java.util.Scanner;

public class flowControl {
    public static void main(String[] args) {
        System.out.println("\nif, if-else, switch, break, continue, jump");

        
        Scanner sc = new Scanner(System.in);
        int inp = sc.nextInt(); 
        
        if (inp <= 10) {
            System.out.println(inp);
            inp += 1;            
        }
        sc.close();
    }
    
}
