Day 10 – Easy Problems
Problem 1: Best Time to Buy and Sell Stock (Leetcode 121)
Problem Statement:
You are given an array prices where prices[i] is the price of a given stock on the ith day. You want to maximize your profit by choosing a single day to buy one stock and a different day to sell that stock in the future.

Approach and Logic:
Iterate through the array and track the minimum price so far. For each price, calculate the profit by subtracting the minimum price from the current price. Keep updating the maximum profit found.

Code:

java
Copy
Edit
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }
}
Problem 2: Maximum Subarray (Leetcode 53)
Problem Statement:
Given an integer array nums, find the contiguous subarray with the largest sum and return its sum.

Approach and Logic:
This problem is solved using Kadane’s Algorithm. We iterate through the array, at each index we either add the current number to the existing subarray or start a new subarray. Track the maximum sum throughout the process.

Code:

java
Copy
Edit
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}
GitHub Code Day 10:
https://github.com/waffbeen/30Days-DSA-Java/tree/main/Day10

