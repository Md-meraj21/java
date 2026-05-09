public class K {
    public static int buyAndsell(int prices[]) {
        int buyprices = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i=0;i<prices.length;i++) {
            if(buyprices <prices[i] ) {
                int profit = prices[i] - buyprices;
                maxprofit = Math.max(maxprofit, profit);
            }
            else {
                buyprices = prices[i];
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int prices[] = {7,5,6,3,4,8};
        System.out.println("The maximum Prices Within Selling : "+ buyAndsell(prices));
    }
}