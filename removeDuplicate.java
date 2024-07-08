import java.util.*;
public class removeDuplicate {
    public static int duplicate(int arr[]){
        int m = arr.length;
        int count = 0;
        for(int i=0; i<m-1; i++) {
            if(arr[i] != arr[i+1]){
                arr[count] = arr[i];
                count++;
            }
        }
        arr[count] = arr[m-1];
        count++;
        return count;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Array is ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        System.out.println("Count is = " + duplicate(arr));

        sc.close();
    }
    
}
