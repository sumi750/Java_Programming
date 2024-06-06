import java.util.*;

public class BioCofe {
    public static int facto(int m){
        int f = 1;
        for(int i=1; i<=m; i++){
            f = f*i;
        }
        return f;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N ");
        int n = sc.nextInt();
        int fact_n = facto(n);
        System.out.print("Enter the value of r ");
        int r = sc.nextInt();
        int facto_r = facto(r);
        int facto_n_r = facto(n-r);
        System.out.print("Binomial COffiecnt of N and R " + fact_n/(facto_n_r*facto_r));

        sc.close();

    }
    
}
