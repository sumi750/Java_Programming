import java.util.*;
public class prime {
    public static boolean isprime(int n){
            boolean is = true;
            if(n==2){
                return true;
            }
            else{
                for(int i=2; i<=Math.sqrt(n); i++){
                    if(n%i == 0){
                        return false;
                    }
                }
            }
            return is;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isprime(n));
        sc.close();
    }
    
}
