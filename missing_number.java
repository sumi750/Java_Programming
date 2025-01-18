public class missing_number {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1,5,3,4};
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }

        int asum = 0;
        for(int i = 1; i<=n; i++){
            asum += i;
        }

        int mis = asum - sum;
        System.out.println("missing number is "+mis);
    }
}
