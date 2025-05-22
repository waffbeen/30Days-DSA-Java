Day 11 for README
Problem 1: Product of Array Except Self (Leetcode 238)
Problem Statement:
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
You must solve it without using division and in O(n) time.

Approach and Logic:

Create two arrays: prefix and suffix.

Traverse the array from left to right to fill prefix[i] with the product of all elements before i.

Traverse the array from right to left to fill suffix[i] with the product of all elements after i.

Multiply prefix[i] * suffix[i] to get the final result.

Optimized Approach (without extra space):

First pass: store prefix products directly in the result array.

Second pass: multiply result array with suffix products on the fly.

Code:

java
Copy
Edit
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }

        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] = res[i] * suffix;
            suffix *= nums[i];
        }

        return res;
    }
}
Problem 2: Longest Substring Without Repeating Characters (Leetcode 3)
Problem Statement:
Given a string s, find the length of the longest substring without repeating characters.

Approach and Logic:
Use the sliding window technique along with a HashSet to store characters. If a duplicate is found, shrink the window from the left until it's valid again. Keep track of the maximum length encountered.

Code:

java
Copy
Edit
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, right = 0, maxLength = 0;
        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxLength;
    }
}
GitHub Code Day 11:
https://github.com/waffbeen/30Days-DSA-Java/tree/main/Day11

