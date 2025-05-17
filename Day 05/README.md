Today, I solved the following problem as part of my 30 Days DSA Java Challenge:

 
 Problem: 134. Gas Station
Difficulty: Medium
Topic: Greedy, Array

Problem Summary:
You're given two arrays:

gas[i] — amount of gas at station i

cost[i] — amount of gas needed to go from station i to station i + 1

The goal is to return the starting index from where you can complete the full circuit in a circular route, or -1 if it's not possible.

Approach & Logic:
First, calculate the total gas and total cost.

If total gas < total cost, return -1, because you’ll never have enough gas to complete the loop.

Traverse through the array and simulate the journey:

Track how much gas is left in the tank (currTank).

If at any station, currTank becomes negative, reset the start index to i + 1 and set currTank = 0.

This approach ensures that we try only one valid starting point, making it efficient.

 Key Learning:
Understanding greedy algorithms for optimization.

How total gas vs. total cost determines feasibility.

Resetting logic when current path becomes invalid helps in finding the unique correct starting point.
