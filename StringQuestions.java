import java.util.*;

public class StringQuestions {

    public static boolean palin(String str){
        int n = str.length();
        for(int i=0; i<n/2; i++){
            if(str.charAt(i) == str.charAt(n-1-i)) // order is very important
            {
                    return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the String You want");
        String str = sc.nextLine();
        String rever = "";
        char ch;
        for(int i=0; i<str.length(); i++){
            ch = str.charAt(i);
            rever = ch+rever;
        }
        System.out.println("Reverse string is " + rever);



        if(str.equals(rever)){
            System.out.println("Strings are Palindrome");
        }
        else{
            System.out.println("String are not a palindrome");
        }

        // boolean pal = palin(str);
        // if(pal){
        //     System.out.println("Strings are palindrome");
        // }
        // else{
        //     System.out.println("Strings are not palindorme");
        // }
        sc.close();

    }
    
}