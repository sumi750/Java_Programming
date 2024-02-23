public class ArrayRev{
    public static void reverse(int number[]){

        int first = 0, last = number.length-1;
        while (first<last) {
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp;
            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int  number[] = {60,9,74,25,23,14,15};

        reverse(number);
        for(int i=0; i<number.length; i++){
            System.out.print(number[i] + " "); 
        }
        System.out.println();
    }
}