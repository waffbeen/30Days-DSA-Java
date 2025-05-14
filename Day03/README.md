Problem 1
Leetcode pn 28. "Find the Index of the First Occurrence in a String"
Given two strings haystack and needle, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Logic Idea
Use Java's built-in method indexOf().

It directly returns the index of the first occurrence.

If not found, it returns -1.


Problem 2 - 
leetcode pn - 35. "Search Insert Position"

Given a sorted array of distinct integers and a target value, return the index if the target is found.
If not, return the index where it would be if it were inserted in order.

Logic Idea
Use Binary Search to efficiently find the target or the position where it should be inserted.

Adjust the low and high pointers based on comparison.

After the loop, low will point to the correct insert position.
