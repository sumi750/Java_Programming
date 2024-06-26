public class buy_sell {

    public static int buysell(int arr[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<arr.length; i++){
            if(buyPrice < arr[i]){
                // profit
                int profit = arr[i] - buyPrice; // today's profit
                maxProfit = Math.max(maxProfit, profit);
            }
            else{
                buyPrice = arr[i]; // current price = arr[i]
            }
        }

        return maxProfit;
    } 

    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};

        System.out.println(buysell(arr));
        // profit = selling price - buy price(positive)

    }
    
}
