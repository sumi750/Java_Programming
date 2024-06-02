import java.util.*;

public class JavaPrc {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int number = sc.nextInt();

    int sum = 0;
    int cnt = 0;

    while(number!=0){
        sum = sum + number%10; // last digit
        number = number/10; 
        cnt++;
        }

        System.out.println("Sum of the digit is "+ sum);
        System.out.println("cout of the digit is  "+ cnt);
        sc.close();
}
    
}
