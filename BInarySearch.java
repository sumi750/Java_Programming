import java.util.Scanner;
public class BInarySearch {

    //Binary Search
    public static int bSearch(int[] arr, int key){
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid = (start + end)/2;
            if(arr[mid] == key) return arr[mid];
            if(arr[mid] < key) {
                start = mid + 1;
            }
            else{
                end = mid-1;
            }
        }

        return -1;
    }

    //Insertion Sort
    public static void insertion(int[] arr){
        int n = arr.length;
        for(int i=1; i<n; i++){
            int curr = arr[i];
            int j = i-1;

            while(j >= 0 && arr[j] > curr){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = curr;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,5,7,8,9,10,12,19,20,22,25};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element you want to search ");
        int n = sc.nextInt();
        int result = bSearch(arr, n);

        if(result != -1) System.out.println("Element found " + result);
        else System.out.println("elemnt not found");

        int[] nums = {1,5,9,3,4,7,2,6,2};
        insertion(nums);
        for(int num : nums){
            System.out.print(num+ " ");
        }
        sc.close();
    }
}
