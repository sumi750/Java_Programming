import java.util.*;
public class Java3 {
    public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)){
        // if -else statement
        System.out.print("Enter the age: ");
        int Age = sc.nextInt();
        if(Age>=18){
            System.out.println("Adult");
        }
        else{
            System.out.println("not Adult");
        }

        // else if statment
        System.out.print("enter again age: ");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("adult");
        }
        else if(age>=13 && age<18){
            System.out.println("teenager");
        }
        else{
            System.out.println("child");
        }
    
    //ternary opertor -----> 3 oprends
    // variable = condition ? statement1 : statement2
    // statment 1 indicate true , and statemnt 2 indicates false
    int number;
    System.out.print("enter value of number: ");
    number = sc.nextInt();
    String type = (number % 2 == 0)? "even " : "odd";
    System.out.println("the value is " + type);

    // 2nd question
    int marks;
    System.out.print("enter marks: ");
    marks = sc.nextInt();
    String RC = (marks>=33)? "pass" : "fail";
    System.out.println(RC);

    // SWITCH STATMENT
    
    int no = 0;
    switch (no) {
        case 1: System.out.print("samosa");
        break;
        case 2: System.out.print("burger");
        break;
        case 3: System.out.print("cokde");
        default:
        System.out.println("are sapna tha");
            break;
    }
    // weekdays
    int days;
    System.out.print("enter Day Number:  ");
    days = sc.nextInt();
    switch(days){
        case 1: System.out.println("Monday");
        break;
        case 2: System.out.println("Tuesday");
        break;
        case 3: System.out.println("Wednesday");
        break;
        case 4: System.out.println("Thursday");
        break;
        case 5: System.out.println("Friday");
        break;
        case 6: System.out.println("Saturday");
        break;
        case 7: System.out.println("Sunday");
        break;
        default: System.out.println("Wrong number");
        break;
    }

    // Calculator
    System.out.print("enter value of a : ");
    int a = sc.nextInt();
    System.out.print("enter value of b : ");
    int b = sc.nextInt();
    System.out.print("Enter Operator : ");
    char op = sc.next().charAt(0);

    switch(op){
        case '+' : 
        System.out.print("the sum is : ");
        System.out.println(a+b);
        break;
        case '-' : 
        System.out.print("The diffrence is : ");
        System.out.println(a-b);
        break;
        case '*' :
        System.out.print("The product is : "); 
        System.out.println(a*b); 
        break;
        case '/' : 
        System.out.print("The division is :  ");
        System.out.println(a/b); 
        break;
        case '%' : 
        System.out.print("The reminder is : ");
        System.out.println(a%b); 
        break;
        default: System.out.println("wrong calculation ");
        break;
    }
       }
    }
}
