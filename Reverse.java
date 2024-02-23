import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int number = sc.nextInt();
        int reverse = 0;
        int reminder;
        while(number!=0){
            // number = number%10;
            reminder = number % 10;
            reverse = reverse*10 + reminder;
            number/=10;
        }
        System.out.println("the reverse numberi is " + reverse);

    }
}