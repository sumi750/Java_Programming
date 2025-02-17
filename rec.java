import java.util.*;
public class rec {

    //print dec
    public static void fun(int n){
        if(n == 0){
            return;
        }
        System.out.print(n+ " ");
        fun(n-1);
    }
    
    // print ASC
    public static void funIn(int n){
        if(n == 0) return;
        funIn(n-1);
        System.out.print(n+ " ");
    }

    //Factorial
    public static int fact(int n){
        if(n == 0 || n == 1){
            return n;
        }

        return n * fact(n-1);
    }

    //sum of N natural number
    public static int sumN(int n){
        if(n == 1) return n;
        return n + sumN(n-1);
    }

    //Sum of Digit using recursion
    public static int sod(int n){
        if(n == 0) return n;
        int rem = n%10;
        int ld = sod(n/10);
        return rem + ld;
    }

    public static void main(String[] args) {
        //print n to 1
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fun(n);
        System.out.println();
        funIn(n);
        System.out.println();
        int m = 5;
        System.out.println("Factoral of m is "+ fact(m));
        System.out.println("Sum of first N natrural number is "+ sumN(m));
        int x = sc.nextInt();
        System.out.println("Sum of Digit of Number x is "+ sod(x));
        sc.close();
    }
}
