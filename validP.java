import java.util.*;
public class validP {
    public static boolean vaildOrNot(String s){
        String regex = "[^A-Za-z0-9]";
        s = s.toLowerCase().replaceAll(regex, "");
        System.out.println(s);
        int i = 0;
        int l = s.length()-1;
        while(i<l){
            if(s.charAt(i) != s.charAt(l)){
                return false;
            }
            i++;
            l--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean palindrome = vaildOrNot(s);
        if(palindrome){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
        sc.close();
    }
}
