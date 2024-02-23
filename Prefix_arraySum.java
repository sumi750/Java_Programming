import java.util.*;
// import java.lang.math.*;


public class Prefix_arraySum {

    public static void sumArray(int arr[]){
        int currSum;
        int maxSum = Integer.MIN_VALUE;
    int prefix[] = new int[arr.length];
    // calculation of prefix;

    prefix[0] = arr[0];

    for(int i=1; i<prefix.length; i++){
        prefix[i] = prefix[i-1] + arr[i];
    }

    // loop1
    for(int i=0; i<arr.length; i++){
        int start =i;
        for(int j=i; j<arr.length; j++){
        int end=j;
            currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

            if(maxSum < currSum){
                maxSum = currSum;
            }

        }
    }

    System.out.println("max sum =" + maxSum);

    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        sumArray(arr);
    }
    
}
