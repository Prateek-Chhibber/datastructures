package ArrayQuestions;

public class MaxProfit {

    public static int maxProfit(int[] prices){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            // If current price is lower than minPrice, update minPrice.
            minPrice = Math.min(minPrice, price);
            // Calculate potential profit for current price.
            int profit = price - minPrice;
            // If current profit is more than maxProfit, update maxProfit.
            maxProfit = Math.max(maxProfit, profit);
        }
        // After checking all prices, return the maximum profit.
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int profit1 = maxProfit(prices1);
        System.out.println("Test case 1: Maximum profit: " + profit1); // prints "Maximum profit: 5"

        int[] prices2 = {7, 6, 5, 4, 3, 2, 1};
        int profit2 = maxProfit(prices2);
        System.out.println("Test case 2: Maximum profit: " + profit2); // prints "Maximum profit: 0"

        int[] prices3 = {1, 2, 3, 4, 5, 6, 7};
        int profit3 = maxProfit(prices3);
        System.out.println("Test case 3: Maximum profit: " + profit3); // prints "Maximum profit: 6"

        int[] prices4 = {3, 2, 6, 5, 0, 3};
        int profit4 = maxProfit(prices4);
        System.out.println("Test case 4: Maximum profit: " + profit4); // prints "Maximum profit: 4"

        int[] prices5 = {2, 4, 1};
        int profit5 = maxProfit(prices5);
        System.out.println("Test case 5: Maximum profit: " + profit5); // prints "Maximum profit: 2"

        /*
            EXPECTED OUTPUT:
            ----------------
            Test case 1: Maximum profit: 5
            Test case 2: Maximum profit: 0
            Test case 3: Maximum profit: 6
            Test case 4: Maximum profit: 4
            Test case 5: Maximum profit: 2
        */
    }
}

//    public static int maxProfit(int[] prices) {
//        int profit = 0;
//        int lowestPrice = prices[0];
//        int day = 0;
//        int higherPrice = 0;
//        if(prices.length == 0) {
//            return 0;
//        }
//        for (int i = 0; i < prices.length; i++) {
//            if(lowestPrice>prices[i]){
//                lowestPrice = prices[i];
//                day = i;
//            }
//        }
//        if(day == prices.length) {
//            profit = 0;
//        } else if (day < prices.length) {
//            for (int i = day; i < prices.length; i++) {
//                if (higherPrice < prices[i]) {
//                    higherPrice = prices[i];
//                }
//            }
//            profit = higherPrice - lowestPrice;
//        }
//        return profit;
//    }