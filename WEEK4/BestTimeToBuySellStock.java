public class BestTimeToBuySellStock {

    public static int maxProfit(int[] prices) {

        if (prices == null || prices.length == 0) {
            return 0;
        }

        int minPrice = prices[0];
        int maxProfit = 0;


        for (int i = 0; i < prices.length; i++) {

            if (prices[i] < minPrice) {

                minPrice = prices[i];

            } else {

                int currentProfit =
                        prices[i] - minPrice;

                if (currentProfit > maxProfit) {

                    maxProfit = currentProfit;
                }
            }
        }

        return maxProfit;
    }


    public static void main(String[] args) {

        int[] prices1 =
                {7, 1, 5, 3, 6, 4};

        System.out.println(
                maxProfit(prices1)
        );


        int[] prices2 =
                {7, 6, 4, 3, 1};

        System.out.println(
                maxProfit(prices2)
        );
    }
}