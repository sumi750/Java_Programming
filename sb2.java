import java.util.*;
public class sb2 {
    public static String toUpper(String name){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(name.charAt(0));
        sb.append(ch);

        for(int i=1; i<name.length(); i++){
            if(name.charAt(i) == ' ' && i<name.length()-1){
                sb.append(name.charAt(i));
                i++;
                sb.append(Character.toUpperCase(name.charAt(i)));
            }
            else{
                sb.append(name.charAt(i));
            }
        }
        String ss = sb.toString();
        ss = ss.trim();
        return ss;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(toUpper(name));
        sc.close();
    }
}
