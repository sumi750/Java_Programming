import java.util.*;

public class BasicPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Square pattern
    for(int i = 1; i<=4; i++){
        System.out.println("* * * *");
    }
    
    // Right half Pyramid;

    System.out.println("Right Half Pyarmid");
    int rows = sc.nextInt();
    for(int i=1; i<=rows; i++){
        for(int j=1; j<=i; j++){
            System.out.print(" * ");
        }
        System.out.println();
    }

    // Rihgt Revers Half Pyramid;
    System.out.println("Right Reverse Half Pyramid");
    int r = sc.nextInt();

    for(int i=r; i>=1; --i ){
        for(int j=1; j<=i; j++){
            System.out.print(" * ");
        }
        System.out.println();
    }

    // half pyarmid for number;
    System.out.println("Half pyramid for number");
    int n = sc.nextInt();
    for(int i = 1; i<=n; i++){
        for(int j = 1; j<=i; j++){
            System.out.print(j);
        }
        System.out.println();
    }

    // half pyramid for invers number;
    System.out.println("Half pyuramid for revers number");
    int rev = sc.nextInt();

    for(int i=rev; i>=1; --i){
        for(int j=1; j<=i; j++){
            System.out.print(j);
        }
        System.out.println();
    }
    // number changing Pyramid

    System.out.println("Number changing Pyarmid");
    int num = sc.nextInt();
    int numm = 1;
    for(int i=1; i<=num; i++){
        for(int j=1; j<=i; j++){
            System.out.print(numm + " ");
            numm++;
        }
        System.out.println();
    }
    

    }
}
