import java.util.*;

public class Arraypair{

    // Sub Array
    public static void subArray(int arr[]){

        int tsub=0;
        for(int i=0; i<arr.length; i++){
            int start = i;
            for(int j=i; j<arr.length; j++){
                int end = j;
                for(int k=start; k<=end; k++){
                    System.out.print(arr[k]+ " ");
                }
                System.out.println();
                tsub++;
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("total pair are " + tsub);
    }


    // Array Pair
    public static void pair(int arr[]){
        int tp =0;
        for(int i=0; i<arr.length; i++){
            int curr=arr[i];
            for(int j=i+1; j<arr.length; j++){
                System.out.print("("+curr+","+arr[j]+")" + " ");
                tp++;
            }
            System.out.println();
        }

        System.out.println("total pair are " + tp);
    }

    // MAx_SubArray Sum
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int num = sc.nextInt();
        int arr[] = new int[num];

        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        pair(arr);

        System.out.println();

        subArray(arr);

        // revers of array
        System.out.println("Reverse of Array is");

        int first = 0;
        int last = arr.length-1;
        while(first<last){
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
            last--;
            first++;
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}