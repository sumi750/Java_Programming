import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Valye of a");
        int a = sc.nextInt();
        System.out.println("Enter the Valye of b");
        int b = sc.nextInt();

        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
            System.out.println("The sum is "+ (a+b)); 
                break;
            case '-':
            System.out.println("The diffence is "+ (a-b)); 
                break;
            case '*':
            System.out.println("The prodecut  is " + a*b); 
                break;
            case '/':
            System.out.println("The divion is is " + (int)a/b); 
                break;
        
            default:
            System.out.println("Enter valid opeartor");
                break;
        }

        sc.close();
    }
}
