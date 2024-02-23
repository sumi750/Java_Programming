import java.util.*;
public class Functi {
    public static void printHello(){
        for(int i =1; i<=5; i++){
            System.out.println("hello World");
        }

    }

    public static int check(int a, int b) // parameter or formal parameters in defination
    {
        int sum = a+b;
        int product = a*b;
        System.out.println("product is : " + product);
        return sum;

    }
    // swap code
    public static void swap(int x, int y){
        int temp = x;
        x = y;
        y = temp;
        
        System.out.println(" x  : " +x);
        System.out.println(" y : " +y);
        
    }
    // facrorail code
    public static int fact(int l){
        int f = 1;
        for(int i = 1; i<=l; i++){
            f = f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Hello  i Am Sumit");
            // printHello();
            System.out.print("enter the value of a : ");
            int a = sc.nextInt();
            System.out.print("enter the value of b : ");
            int b = sc.nextInt();
            int sum = check(a,b); // arguments or actual parameters in calling statement
            System.out.println("the sum is : " + sum);

            // swap -->
            System.out.print("Enter the value of X : ");
            int x = sc.nextInt();
            System.out.print("enter the value of Y : ");
            int y = sc.nextInt();

            swap(x,y);

            // factorial of a number , n!
            System.out.print("enter the value of N : ");
            int n = sc.nextInt();
            int facto = fact(n);
            System.out.println("the value of factorail is : " +  facto);
            System.out.print("enter the value of r: ");
            int r = sc.nextInt();
            int fac_r = fact(r);
            System.out.println("the value of r factoraul : " + fac_r);

            int rem = (n-r);
            int remm = fact(rem);
            System.out.println(remm);

            int bio = facto/(remm*fac_r);
            System.out.println("the value of binomial cofficent : " + bio);
            

        }
    }
}
