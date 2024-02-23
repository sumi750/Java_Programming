import java.util.*;
public class JavaPattern {
    public static void main(String[] args) {
        try (Scanner me = new Scanner(System.in)){
            // Print Sqaure Pattern
            System.out.println("Enter the value of N");
            for (int i = 1; i<=4; i++){
                System.out.println("****");
            }
        
        // print reverse of the number
         int n = 10899;
         System.out.println("Given Number is " + n);
         System.out.print("Reverse of number is ");
         while(n>0){
            int lastdigit = n%10;
            System.out.print( lastdigit + "" );
            n = n/10;
         }
         System.out.println();

            // reverse the given number  by user
        System.out.print("enter the value of Num : ");
         int num = me.nextInt();
        //  System.out.println(num);
        System.out.print("Reverse of the number is : ");
        int rev = 0;
        while(num>0){
            int lastd = num%10;
            rev = (rev*10) + lastd;
            num = num/10;
        }
        System.out.println(rev);
         
        }
    }
}
