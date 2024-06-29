import java.util.Scanner;

public class sb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("Tony"); 
        System.out.println(sb);

        System.out.println(sb.charAt(0));
        sb.setCharAt(0, 'p');
        System.out.println(sb);
        sb.insert(0, 'S');
        System.out.println(sb);
        sb.delete(0, 1);
        System.out.println(sb);
        sb.append("e");
        System.out.println(sb);
        System.out.println(sb.length());
        sc.close();
    }
}
