import java.util.*;
public class ArrayRev{
    public static void reverse(int number[]){
        int first = 0, last = number.length-1;

        while(first<last){
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp;
            first++;
            last--;
        }

    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter N ");
       int n = sc.nextInt();
       int arr[] = new int[n];
       System.out.println("Enter the array ");
       for(int i=0; i<arr.length; i++){
        arr[i] = sc.nextInt();
       }

       System.out.print("Enterted array is ");
       for(int i=0; i<arr.length; i++){
        System.out.print(arr[i] +" ");
       }

       reverse(arr);
       System.out.print("Reversed array is ");
       for(int i=0; i<arr.length; i++){
        System.out.print(arr[i] +" ");
       }
       sc.close();
    }
}