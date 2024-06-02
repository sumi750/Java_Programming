public class oper {
    public static void main(String[] args) {
        int a = 10;
        int x = ++a;  // increse than use 
        System.out.println("value of x is " + x);
        System.out.println(a);

        int b = 10;
        int c = b++;  // first use than increse
        b+=10;   // b = b+10;
        System.out.println("value of c is " + c);
        System.out.println(b);
    }
    
}
