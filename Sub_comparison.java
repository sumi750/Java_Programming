import java.util.*;

public class Sub_comparison{
        public static void main(String[] args) {
            // substing comparison
            Scanner sc = new Scanner(System.in);
            String name[] = {"apple", "mango", "banana"};

            String larget = name[0];
            for(int i=0; i<name.length;  i++){
                if(larget.compareToIgnoreCase(name[i]) <0){
                    larget = name[i];
                }
            }
            System.out.println(larget);
            sc.close();
        }
}