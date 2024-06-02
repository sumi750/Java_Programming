import java.util.*;

public class Basic1 {
    public static void main(String[] args) {
        System.out.println("hello World");
        // int a= 5;
        // int b= 10;
        // int sum = a+b;
        // System.out.println(sum);

        Scanner sc = new Scanner(System.in);
        // int x = sc.nextInt();
        // System.out.println("the value of x is " + x);

        // System.out.println("enter the value of a");
        // int a = sc.nextInt();
        // System.out.println("enter the value of b");
        // int b = sc.nextInt();

        // int sum = a+b;
        // System.out.println("the sum is " + sum);
        
        // int pro = a*b;
        // System.out.println("the product is " + pro);

        // // area of circle 
        
        // int r = sc.nextInt();

        // float area = 3.14f *r*r;
        // System.out.println(area);

        // System.out.println("Enter name");
        // String name = sc.nextLine();
        // System.out.println(name);
        float a = sc.nextFloat();
        int b = (int)(a);
        System.out.println(b);

        char ch = 'n';  // Assic code value
        char l = 'a';
        int x = ch - l;
        System.out.println(x);
        sc.close();

    }
}
