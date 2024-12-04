// 12S24047 - Davina Olivia Yosefanny Hutabarat
// 12S24050 - Ester Hasianna Nainggolan
import java.util.*;
import java.lang.Math;

public class X02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] name = new String[4];

        function1(name);
        function2(name);
    }
    
    public static void function1(String[] name) {
        int d;

        for (d = 0; d <= 3; d++) {
            name[d] = "";
        }
    }
    
    public static void function2(String[] name) {
        int x, a;

        for (x = 0; x <= 3; x++) {
            name[x] = input.nextLine();
            if (name[x].equals("---")) {
                name[x] = "";
                a = x;
                x = 4;
            } else {
                a = x;
            }
        }
        function3(name);
    }
    
    public static void function3(String[] name) {
        int c;

        for (c = 0; c <= 3; c++) {
            System.out.println(name[c]);
        }
    }
}
