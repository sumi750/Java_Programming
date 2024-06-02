 import java.util.*;
public class Java4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
        
        // WHILE LOOP 
        int counter = 0;
        while(counter <= 10){
            System.out.println(counter);
            counter++;
        }

        // from 1 to n
        int no = 1;
        System.out.print("enter the value of N : ");
        int n = sc.nextInt();
        while(no <= n){
            System.out.println(no + " ");
            no++;
        }

        // print sum of first n natural number
        int sum = 0;
        int m;
        int i = 1;
        System.out.print("enter the value of M : ");
        m = sc.nextInt();

        while(i <= m){
            sum = sum + i;
            
            i++;
        }
         System.out.println(sum);


         /*  FOR LOOP
         for (initilization; condition; updation){
            // do something
        } 
        */
        System.out.print("enter the value of Z : ");
        int z = sc.nextInt();
        for(int j = 1; j <= z; j++){
            System.out.println(j);
        }
    
    /* do-while loop
     do{
        do something
     }
     while(condition)
    */

    // prime number

    int y = sc.nextInt();

    
    if(y == 2){
        System.out.println("Y is prime");
    }
    else{
        boolean isprime = true;
    for (int h = 2; h<=Math.sqrt(n); h++){
        if(y % h== 0){
            isprime = false;
        }
    }
    if(isprime == true){
        System.out.println("Y is prime number");
    }
    else{
        System.out.println("Y is not prime");
    }
}

        
}
}
    
}
