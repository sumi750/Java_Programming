import java.util.*;
public class fib {
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
        sc.close();
    }
    
}
