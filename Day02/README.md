30 Days DSA Java Challenge - Day 02
Problems Solved
1. Total Characters in String After Transformations I (LeetCode 3335)
Problem Link: Total Characters in String After Transformations I

Language: Java

Approach:
Initially, the approach was to simulate the transformation directly using StringBuilder. However, this caused Time Limit Exceeded (TLE) errors for large inputs due to exponential growth when 'z' becomes "ab".
To handle this efficiently, the solution was optimized by shifting to a mathematical counting approach using dynamic programming. For each character, the number of resulting characters after t transformations was precomputed without constructing the actual string. This reduced the time and space complexity from exponential to linear, making the solution scalable for large constraints.

2. Rotate Array (LeetCode 189)
Problem Link: Rotate Array

Language: Java

Approach:
Initially, the naive approach was to shift each element step by step, which was inefficient and resulted in higher time complexity.
Optimized using the reverse method:

Reverse the entire array.

Reverse the first k elements.

Reverse the remaining n - k elements.
This approach allows rotating the array in-place with O(n) time complexity and O(1) space complexity.

What I Learned Today
Learned the importance of optimizing brute-force string manipulation by using mathematical and dynamic programming approaches.

Applied the reverse method to efficiently rotate an array.

Reinforced the habit of thinking about time and space trade-offs, especially for problems with large constraints.

Submission Screenshots
Added in the repository under screenshots/day02/.

Repository Structure
markdown
Copy
Edit
- Day01/
- Day02/
    - TotalCharactersInStringAfterTransformationsI.java
    - RotateArray.java
    - screenshots/
My Journey
Continuing the 30 Days DSA Java Challenge by solving problems daily and focusing on writing optimized and scalable solutions.
