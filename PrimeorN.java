import java.util.*;
public class PrimeorN {
    public static boolean isPrime(int n){
        boolean isPrime = true;
        if(n == 2){
            return true;
        }
        else{
            for(int i=2; i<=n-1; i++){
                if(n%i == 0){
                isPrime = false;
                }
            }
        }
        return isPrime;
    }
    public static void primeinRange(int n){
        for(int i =2; i<=n; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.print("enter the valle of N");
            int n = sc.nextInt();
            // isPrime(n);
            System.out.println(isPrime(n));

            primeinRange(20);
        }
    }
}

