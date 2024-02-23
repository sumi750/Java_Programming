import java.util.*;

public class BioCofe {
    public static int facto(int m){
        int f = 1;
        for(int i=1; i<=m; i++){
            f = f*i;
        }
        return f;
    }

    public static int bioCoeff(int x , int y){
        int a = facto(x);
        int b = facto(y);
        int nmr = facto(x-y);

        int ncr = a/(b*nmr);
        return ncr;
    }

    public static void main(String args[]){

        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the value of N :  ");
            int n = sc.nextInt();
            int fact = facto(n);
            System.out.println("the value of n factorail is " + fact);

            System.out.print("enter the value of X : ");
            int x = sc.nextInt();
            System.out.print("enter the value of Y : ");
            int y = sc.nextInt();
            int BC = bioCoeff(x, y);
            System.out.println("the value of bio - coffiecent " + BC);
            
        }
    }
    
}
