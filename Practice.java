import java.util.*;

public class Practice {
    public static void main(String[] args) {
        // int a = 45;
        // float b = a;
        // System.out.println(b);

        // float x =25.41f; // explicit conversion
        // int y = (int)x;
        // System.out.println(y);
        Scanner sc = new Scanner(System.in);
        String v = sc.nextLine();
        System.out.println("String" + v);
        // System.out.println("enter the chartcter");
        // char ch = sc.next().charAt(0);
        // System.out.println(ch);

        int num = sc.nextInt();
        if(num%2 == 0){
            System.out.println("even number");
        }
        else{
            System.out.println("Odd number");
        }


        // int a=45, b =10;
        // boolean x=(a>b) ? true : false;
        // System.out.println(x);

        // switch case
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Satruday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        
            default:
                System.out.println("wrong Number");
                break;
        }

        // incomee tax calculator
        int income = sc.nextInt();
        int tax;
        if(income<500000){
            // System.out.println("tax 0");
            tax = 0;
        }
        else if(income >=50000 && income <100000 ){
                // System.out.println("tax");
                tax = (int)(income * 0.2);

        }
        else{
            tax = (int)(income*0.3);
        }

        System.out.println("your tax is " + tax);

        // print the largest of three number

        // int m =12, n =10, l = 89;
        System.out.println("enter the value of m");
        int m = sc.nextInt();
        System.out.println("enter the value of n");
        int n = sc.nextInt();

        System.out.println("enter the value of l");
        int l = sc.nextInt();

        if(m>n && n>l) // a sabse bada hai 
        {
            System.out.println("m is greates number" + m);
        }
        else if(n>m && m>l)
        {
            System.out.println("n is greater" + n);
        }
        else{
            System.out.println("l is greater" + l);
        }

        System.out.println("====================");
        for(int i =1; i<=3; i++){
            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.printf("%-15s%03d",s1,x);
        }
        System.out.println("====================");

        sc.close();
        
    }
}
