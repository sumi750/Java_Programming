import java.util.*;
public class func {

    public static int reverse(int n){

        int rev = 0;
        while( n !=0){
            rev = rev*10 + n%10;
            n/=10;
        }

        return  rev;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of number ");
    int number = sc.nextInt();
    
    int rev = reverse(number);
    
    System.out.println(("reverse number is " + rev));

    if(rev == number){
        System.out.println("Number is pallindrome");
    }
    else{
        System.out.println("Number is not a pallindrome");
    }
     sc.close();
    }
}
