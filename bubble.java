import java.util.*;
public class bubble {
    // Bubble Sort  Time Compelxity: O(N^2)
    public static void bubble_sort(int arr[]){
        int temp;
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){

                    temp = arr[j];
                arr[j] = arr[j+1];
            arr[j+1] = temp;
        }
    }
    }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {4,2,9,4,3,1,8,};
        bubble_sort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
    
}
