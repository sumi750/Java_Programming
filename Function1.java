import java.util.*;

public class Function1 {

    public static void hello(){
        for(int i =1; i<5; i++){
            System.out.println("Hello world");
        }
    }

    public static void swap(int x, int y) // parameters or formal parameters
    {

        System.out.println("before swapinf : a is  " + x);
        System.out.println("before swapinf : b is  " + y);
        int temp = x;
        x=y;
        y=temp;

        System.out.println("after swapinf : a  is " + x);
        System.out.println("after swapinf : b  is " + y);

    }

    public static int facto(int l){
        int f = 1;
        for(int i = 1; i<=l; i++){
            f = f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a ");
        int a = sc.nextInt();
        System.out.println("enter the value of b ");
        int b = sc.nextInt();

        swap(a,b); // calling a function // actual parameters or arguments

        hello(); // calling a function

        // factorail 
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        int fact = facto(n);

        System.out.println("the factorial of n is : " + fact);
        
        System.out.println("Enter the value of r: ");
        int r = sc.nextInt();
        int fact_r = facto(r);
        System.out.println("the factorial of r is : " + fact_r);

        int rem = facto(n-r);
        System.out.println("the factorail of n-r is :" + rem);

        System.out.println("Binomal cofficient is " + fact/((fact_r)*rem));

    }
}
