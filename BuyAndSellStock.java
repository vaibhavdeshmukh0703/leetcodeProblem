public class BuyAndSellStock {
    public int maxProfit(int[] prices) {
        // loop trhue all array and find the min price buy on that day.

        int minPrice = prices[0];
        int indexOfMinvalueShare = 0;
        int maxPrice = 0;
        int MaxProfit = 0;

        if (prices.length == 1) {
            return 0;
        }
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
                indexOfMinvalueShare = i;
                maxPrice = minPrice;
            }
        }
        
        // loop though min price to remain array to find max price day to sell share.
        if (indexOfMinvalueShare != prices.length - 1) {
            for (int j = indexOfMinvalueShare; j < prices.length; j++) {
                if (prices[j] > maxPrice) {
                    maxPrice = prices[j];
                }
            }
        } else {
            return MaxProfit = 0;
        }
        
        MaxProfit = maxPrice - minPrice;

        return MaxProfit;
    }

    public static void main(String[] args) {
        BuyAndSellStock bc = new BuyAndSellStock();
        int[] prices = { 7, 3, 5, 1 };
        int result = bc.maxProfit(prices);
        System.out.println("Max profite is " + result);
    }
}
