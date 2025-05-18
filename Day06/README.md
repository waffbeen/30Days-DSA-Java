Day 06 — 30 Days DSA Java Challenge

## Problem Solved:  
**209. Minimum Size Subarray Sum**  
[LeetCode Problem Link](https://leetcode.com/problems/minimum-size-subarray-sum/)

## Problem Statement:
Given an array of positive integers `nums` and a positive integer `target`, return the minimal length of a subarray whose sum is greater than or equal to `target`. If there is no such subarray, return 0 instead.

### Example:
Input: target = 7, nums = [2,3,1,2,4,3]  
Output: 2  
Explanation: The subarray [4,3] has the minimal length under the problem constraint.



## Approach & Learning:
- I used the **Sliding Window** technique to maintain a window with a sum ≥ target.
- Every time we find a valid subarray, we try to minimize its size by shrinking the window from the left.
- This approach ensures a **linear O(n)** time complexity.

