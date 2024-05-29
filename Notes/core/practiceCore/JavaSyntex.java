

public class JavaSyntex { // Name sould be match to the source file
    static int b = 20; // static variable
    int c = 30; // instance variable
    public static void main(String[] args) {
        System.out.println();
        System.out.println("1. Single Line comment");
        // This is Single Line Comments

        System.out.println("2. This is multi-line comment");
        /*This is the 
         example 
         of Multi 
         line 
         comment
         */

         System.out.println("3. This is the example of inline comment"); // Example of inline comments

         JavaSyntex y  = new JavaSyntex();
         System.out.println(JavaSyntex.b);
         System.out.println(y.c);
         variable(10); // Calling method using parameter
    }

    public static void variable(int i) {
        
        int a = 10; // local variable
        System.out.println(a);
    }


}
