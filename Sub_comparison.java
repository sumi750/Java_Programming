import java.util.*;

public class Sub_comparison{
        public static void main(String[] args) {
            // substing comparison
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            int k = sc.nextInt();

            // divides the substrings
            s = s.substring(k);
            System.out.println(s);
            sc.close();
        }
}