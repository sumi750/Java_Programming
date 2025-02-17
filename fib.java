import java.util.*;
public class fib {
    //Nth fib number using Recursion 
    public static int rFib(int n){

        //base condition 
        if(n == 0 || n ==1){
            return n;
        }
        return rFib(n-1) + rFib(n-2);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = 0;
        int n2 = 1;
        System.out.println("Enter the value of n");
        int n = sc.nextInt();

        for(int i =0; i<n; i++){
            System.out.print(n1 + " ");
            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
        int m = 9;
        // System.out.println("M fib number is " + fib(m));
        System.out.println(" M fib number is "+ rFib(m));

        sc.close();
    }
    
}
