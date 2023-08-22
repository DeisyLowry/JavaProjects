package com.dgl.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Math.max;

public class SlidingWindow {

    public static int getMaxProfit(List<Integer> prices) {
        int left = 0;
        int right = 1;
        int maxP = 0;

      for (int i = 1; i < prices.size(); i++) {
            if (prices.get(left) < prices.get(right)) {
                maxP = max(maxP, prices.get(right) - prices.get(left));

            } else {
                left = right;
            }
            right++;
        }
            return maxP;
        }



/*
      while (right < prices.size())
            if (prices.get(left) < prices.get(right)) {
                maxP = max(maxP, prices.get(right) - prices.get(left));

            } else {
                left = right;
            }
            right++;
        }
            return maxP;
        }

       */

    /*
        do{
            if (prices.get(left) < prices.get(right)) {
                maxP = max(maxP, prices.get(right) - prices.get(left));

            } else {
                left = right;
            }
            right++;
        }
        (while (right < prices.size()))
            return maxP;
        }

       */

    public  static int maxProfit(List<Integer> prices) {

            int l = 0;
            int r = 1;
            int maxP = 0;
            while (r < prices.size()) {
                if (prices.get(l) < prices.get(r)) {
                    maxP = Math.max(maxP, prices.get(r) - prices.get(l));
                } else {
                    l = r;
                }
                r++;
            }
            return maxP;
        }

    public static void main(String[] args) {
        ArrayList<Integer> prices = new ArrayList<>(Arrays.asList(7,1,5,3,6,4));
        System.out.println(getMaxProfit(prices));
        System.out.println(maxProfit(prices));
    }
}
