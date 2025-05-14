Problem 1
LeetCode Problem #28 "Find the Index of the First Occurrence in a String"
Given two strings haystack and needle, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Logic Idea
Use Java's built-in method indexOf().

It directly returns the index of the first occurrence.

If not found, it returns -1.


Problem 2 - 
LeetCode Problem #35 "Search Insert Position"

Given a sorted array of distinct integers and a target value, return the index if the target is found.
If not, return the index where it would be if it were inserted in order.

Logic Idea
Use Binary Search to efficiently find the target or the position where it should be inserted.

Adjust the low and high pointers based on comparison.

After the loop, low will point to the correct insert position.


Problem : 3
LeetCode Problem #66
Link to LeetCode Problem

Logic Behind Solution
Start iterating from the last digit of the array.

If the digit is less than 9, simply increment it by 1 and return the array (since no further carry is needed).

If the digit is 9, set it to 0 and move to the next digit (since it produces a carry).

If all digits are processed and were 9, create a new array of size n+1 where the first digit is 1 and the rest are 0 (e.g., [9, 9, 9] becomes [1, 0, 0, 0]).

This approach avoids converting the array to an integer and is efficient for large inputs.
