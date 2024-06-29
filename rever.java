import java.util.*;
public class rever {
    public static boolean palin(String name){
        int n = name.length();
        for(int i=0; i<n/2; i++){
            if(name.charAt(i) == name.charAt(n-i-1)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String ");
        String name = sc.next();
        String re = " ";
        char ch;
        for(int i=0; i<name.length(); i++){
            ch = name.charAt(i);
            re = ch+re;
        }
        System.out.println("Revser of String namer is "+ re);

        //Palindrome
        boolean pal = palin(name);

        if(pal){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not A palindrome");
        }
        sc.close();
    }
}
