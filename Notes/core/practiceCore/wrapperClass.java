

import java.util.ArrayList;

public class wrapperClass {
    public static void main(String[] args) {
        char ch = 'a';
        //System.out.println("C = "+ch);


        Character a = ch;
        ArrayList<Integer>arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        System.out.println("\nExample of Inboxing");
        System.out.print("\nans: "+arrayList.get(0));
        System.out.println(a);


        Character bh = 'b';
        char b = bh;
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();

        arrayList2.add(2);
        int num = arrayList2.get(0);
        System.out.println("Example of Unboxing");
        System.out.print("\nans: "+num);
        System.out.println(b);
    }
}
