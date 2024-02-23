import java.util.*;
public class BTD {
    public static void binTodec(int BinDec){
        int myNum = BinDec;
        int pow = 0;
        int decNum = 0;
        while(BinDec>0){
            int Ld = BinDec%10; // for last degit
            decNum = decNum + (Ld*(int)Math.pow(2, pow)); // type casting bcoz pow return double value but we need int 
            pow++;
            BinDec = BinDec/10;
        }
        System.out.println("decimal of binray number " + myNum + " is equal to " + decNum);
    }

    public static void DectoBin(int n){
        int myDec = n;
        int poww = 0;
        int Binform = 0;
        while(n>0){
            int LastD = n % 2;
            Binform = Binform + (LastD*(int)Math.pow(10, poww));
            poww++;
            n = n/2;
        }
        System.out.println("the Binary value of Decimal Number " + myDec + " is equal to " + Binform);
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
        System.out.print("Enter the Binary number : ");
        int MyBinary = sc.nextInt();
        binTodec(MyBinary);

        System.out.print("enter the decimal number : ");
        int Decn = sc.nextInt();
        DectoBin(Decn);
        }

    }
}
