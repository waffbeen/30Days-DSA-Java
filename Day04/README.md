Problem 1
Leetcode 58. Length of Last Word
Input: "Hello World"
After trim: "Hello World"
Last space index: 5
Length of last word: 11 - 5 - 1 = 5
✅ Output: 5

Problem 2
Leetcode 67. Add Binary
Start from the end of both strings (like adding on paper, right to left).
Use a carry:

0 + 0 = 0 → carry 0

1 + 0 = 1 → carry 0

1 + 1 = 10 → result 0, carry 1

1 + 1 + 1 = 11 → result 1, carry 1

Loop while there are digits to add or a carry left:

Take digit from a if available

Take digit from b if available

Add them with the carry

Append (sum % 2) to result

Update carry = sum / 2

Reverse the result (since it's built from least to most significant bit)
