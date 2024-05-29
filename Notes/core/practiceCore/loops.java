

public class loops {
    public static void main(String[] args) {
        int i=0;
        while (i<=10) {
            System.out.println();
            i+=1;
            if (i == 7) {
                continue; 
            }
            if (i ==9 ) {
                break;
            }
            System.out.println("i = "+i);
        }
    }
}
