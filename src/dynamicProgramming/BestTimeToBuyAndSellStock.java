package dynamicProgramming;

/**
 * Created by captain on 2018/9/29.
 */

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import static jdk.nashorn.internal.objects.Global.print;

/**
 * No.121 in leetcode
 *
 * Say you have an array for which the ith element is the price of a given stock on day i.

 If you were only permitted to complete at most one transaction
 (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.

 Note that you cannot sell a stock before you buy one.

 Example 1:
 Input: [7,1,5,3,6,4]
 Output: 5
 Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 Not 7-1 = 6, as selling price needs to be larger than buying price.


 Example 2:
 Input: [7,6,4,3,1]
 Output: 0
 Explanation: In this case, no transaction is done, i.e. max profit = 0.
 *
 */
public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        int[] p = new int[]{7,1,5,3,6,4};
        BestTimeToBuyAndSellStock b = new BestTimeToBuyAndSellStock();
        System.out.println(b.maxProfit(p));
    }

    public int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice) {
                minprice = prices[i];
            } else if (prices[i] - minprice > maxprofit) {
                maxprofit = prices[i] - minprice;
            }
        }

        return maxprofit;
    }

//    public int maxProfit(int[] prices) {
//        int min = Integer.MAX_VALUE, max = 0;
//        for (int i = 0; i < prices.length; i++) {
//            min = Math.min(min, prices[i]);
//            max = Math.max(max, prices[i] - min);
//        }
//        return max;
//    }

}
