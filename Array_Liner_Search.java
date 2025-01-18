import java.util.*;
public class Array_Liner_Search {
    public static int liner(int number[], int key){
        for(int i=0; i<number.length; i++){
            if(number[i] == key){
                return i;
            }

        }
        return -1;
    }
    public static int largestint( int number[]){
        int large = Integer.MIN_VALUE;
        for(int i=0; i<number.length; i++){
            if(large < number[i]){
                large = number[i];
            }
        }
        return large;
    }
    public static int minint( int number[]){
        int minimum = Integer.MAX_VALUE;
        for(int i=0; i<number.length; i++){
            if(minimum > number[i]){
                minimum = number[i];
            }
        }
        return minimum;
    }

    public static void largesSmall(int[] arr){
        int max = arr[0];
        int min = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }

            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Max value is " + max);
        System.out.println("Min value is "+ min);
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        int number[] = {89,45,25,3,6,78,14,58};
        int key = sc.nextInt();
        int index = liner(number, key);
        if(index == -1){
            System.out.println("not in class");
        }
        else{
            System.out.println("in Class index is "+ index );
        }

        // Largest In Array
        int numbers[] = {45,98,74,25,101,98,10};
        System.out.println("the largest number is array is : " + largestint(numbers));
        System.out.println("the smallest number is : " + minint(numbers));
        largesSmall(numbers);
    }
    }
}
