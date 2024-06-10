import java.util.*;
public class SubArray_sum {


    // Basic Solution
    // Time Complexity = O(n^3)
    public static void maxSub(int arr1[]){
        int currSUm = 0;
        int count = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<arr1.length; i++){
            int start =i;
            for(int j=i; j<arr1.length; j++){
                int end=j;
                currSUm =0;
                for(int k=start; k<=end; k++){
                    // sub array sum;
                    currSUm +=arr1[k];
                }

                // System.out.println(currSUm);

                if(maxSum < currSUm){
                    maxSum=currSUm;
                }
                if(currSUm < 0){
                    count++;
                }
            }
        }
        System.out.println(count);

        // System.out.println("max sum is " + maxSum);
    }


    // Kadane's Algorithm : efficent way for subarray sum 
    /* if currcum has negative value considered as 0*/
    public static void kadn(int arr2[]){

        int currSum =0;
        int ms = Integer.MIN_VALUE;

        for(int i=0; i<arr2.length; i++){
            currSum = currSum + arr2[i];
            if(currSum < 0){
                currSum = 0;

            }

            ms = Math.max(currSum, ms);
        }
        System.out.println("our max subarray is : " + ms);

    }


    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int arr[] = {2,4,6,8,10};
        System.out.println("enter the size of array");
        int arr = sc.nextInt();
        int arr1[] = new int[arr];

        for(int i=0; i<arr1.length; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("given array is ");
        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        maxSub(arr1);

        int arr2[] = {2,4,6,8,10};
        kadn(arr2);
        sc.close();
     }
}
