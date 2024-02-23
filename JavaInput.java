/**
 * JavaInput
 */
import java.util.*;
public class JavaInput {
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            // String name = s.nextLine();
            // System.out.println(name);
            System.out.print("Number 1 or value of a");
            int a = sc.nextInt();
            System.out.print("Number 2 or value of b");
            int b = sc.nextInt();
            int sum = a+b;
            System.out.println(sum);
            float number = sc.nextInt(); // implicit conversion or widning conversion
            System.out.println(number);

            float x = 253.15f;
            int y = (int)x;
            System.out.println(y);
        }
        System.out.println("hello");

    }

    
}