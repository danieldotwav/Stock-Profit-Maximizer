import java.util.stream.Collectors;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Increasing stock prices
        Integer[] prices1 = new Integer[] { 1, 2, 3, 4, 5 };
        getResults(prices1, maxProfit(prices1));

        // Test Case 2: Decreasing stock prices
        Integer[] prices2 = new Integer[] { 5, 4, 3, 2, 1 };
        getResults(prices2, maxProfit(prices2));

        // Test Case 3: Mixed stock prices
        Integer[] prices3 = new Integer[] { 1, 3, 2, 5, 4 };
        getResults(prices3, maxProfit(prices3));

        // Test Case 4: Constant stock prices
        Integer[] prices4 = new Integer[] { 2, 2, 2, 2, 2 };
        getResults(prices4, maxProfit(prices4));

        // Test Case 5: Empty array
        Integer[] prices5 = new Integer[] { };
        getResults(prices5, maxProfit(prices5));

        // Test Case 6: Single price
        Integer[] prices6 = new Integer[] { 3 };
        getResults(prices6, maxProfit(prices6));

        // Test Case 7: Prices with larger variations
        Integer[] prices7 = new Integer[] { 10, 20, 15, 25, 30, 5, 10 };
        getResults(prices7, maxProfit(prices7));
    }

    static int maxProfit(Integer[] prices) {
        int maxProfit = 0;

        for (int i = 1; i < prices.length; ++i) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        return maxProfit;
    }

    static void getResults(Integer[] prices, int maxProfit) {
        String resultString = (prices != null)
            ? Arrays.stream(prices).map(String::valueOf).collect(Collectors.joining(", ", "[ ", " ]"))
            : "Null Container";
        
        System.out.println("\nPrice Array: " + resultString + "\nMax Profit: " + maxProfit);
    }
}
