import java.util.*;
public class loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        //Print N Numbers
        System.out.println("Enter the value of X");
        int x = sc.nextInt();
        for(int i=0; i<=x; i++){
            System.out.print(i + " ");
        }

        // Sum of first N Numers
        int n = 1;
        while(n<x){
            sum = sum +n;
            n++;
        }
        System.out.println("The sum is till X "+ sum);

        // Fibonachi series 
        int a = 0;
        int b = 1;
        int summ;
        for(int i=0; i<=x; i++){
            summ = a+b;
            System.out.print(a + " ");
            a=b;
            b=summ;
        }

        System.out.println();
        // Reverse of Number 
        System.out.print("Enter the value of Number ");
        int number = sc.nextInt();
        int reverse = 0;
        while(number!=0){
            int ld = number % 10;
            number/=10;
            reverse = reverse*10 + ld;
        }
        System.out.println("The reverse string is "+ reverse);
        
        // Sum of digit and count of digit
        System.out.print("ENter the value of no. ");
        int no = sc.nextInt();
        int s = 0;
        int cnt = 0;
        while(no != 0){
            int lsd = no % 10;
            s = s + lsd;
            no/=10;
            cnt++;
        }
        System.out.println("Sum of the digits are "+ s);
        System.out.println("number of   digits are "+ cnt);

        // Factorial of Number
        System.out.print("Enter M");
        int m = sc.nextInt();
        int fact = 1;
        for(int i=1; i<=m; i++){
            fact = fact*i;
        }
        System.out.println("Factorial of "+ m + "is " + fact);
        sc.close();
    }
    
}
