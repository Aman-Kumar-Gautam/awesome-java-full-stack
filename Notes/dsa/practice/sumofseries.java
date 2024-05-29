import java.util.Scanner;

class sumofseries{
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        while (true) {
        System.out.print("Enter end of the series number: ");
        
        int num = sc.nextInt();
        int ans = num*(num+1)/2;
        System.out.println("Total sum of series is: "+ ans);
        
        }
    }
}

