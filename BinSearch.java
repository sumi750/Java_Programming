import java.util.*;
public class BinSearch {
    public static int Binary_Search(int number[], int key){
        int start = 0, end = number.length-1;
        while(start<=end){
            int mid = (start + end)/2;
            if(number[mid] == key){ return mid;}
            if(number[mid]<key) {
                start = mid+1;

            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        int number[] = {10,50,89,47,52,36,12,32,19,78};
        System.out.print("enter the value of key : ");
        int key = sc.nextInt();
        System.out.println("the index of key is " + Binary_Search(number, key));
    }
}
    
}



