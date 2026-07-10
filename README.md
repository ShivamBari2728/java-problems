## A. Pattern / Loop Questions
1. Print a pyramid pattern of stars/numbers for a given `n`.
2. Print an inverted pyramid.
3. Print a diamond pattern.
4. Print a Pascal's triangle for `n` rows.
5. Print a palindrome number pyramid (e.g., `1 / 121 / 12321`).
6. Print a palindrome star-and-number pyramid (mixed `*` and digits).
7. Trapezium pattern — e.g. for n=4:
   ```
   1*2*3*4*17*18*19*20
   -5*6*7*14*15*16
   - - 8*9*12*13
   - - - 10*11
   ```
8. Given `n=5`, print:
   ```
   1
   3*2
   4*5*6
   10*9*8*7
   11*12*13*14*15
   ```
9. Given `n`, print concentric/expanding number rows:
   ```
   1
   22
   333
   4444
   55555
   4444
   333
   22
   1
   ```
10. For `n=3`, print:
    ```
    1
    1 1
    2 3 2
    2 3 3 3
    4
    ```
11. Given `n` (number of lines), print a pattern like:
    ```
    1111112
    3222222
    3333334
    5444444
    5555556
    7666666
    ```
12. Given `n=4`, `s=3`, print:
    ```
    3
    44
    555
    555
    44
    3
    ```
13. Spiral-numbered pattern — for `n=4` print rows that spiral outward/inward with numbers 1-15 reused in a wrap pattern (variations of this are common — practice spiral matrix printing generally, see #20).
## B. Number Theory / Math
14. Find GCD of two numbers (with and without recursion).
15. Find LCM of two numbers (brute-force and via GCD).
16. Check if a number is prime.
17. Print all prime numbers below a given number, separated by commas.
18. Print Fibonacci series up to `n` terms / find nth Fibonacci number.
19. Check if a number is an Armstrong number; print all Armstrong numbers in an interval.
20. Check if a number is a Perfect number.
21. Check if a number is an Abundant number (sum of proper divisors > number).
22. Check if a number is Automorphic (its square ends with the number itself, e.g., 25² = 625).
23. Convert a decimal number to binary/octal/hexadecimal and vice versa.
24. Find the sum/mean of digits of a given integer.
25. Swap two integers without using a third/temp variable.
26. Given `num1` and `num2`, count occurrences of digit `num2` inside `num1`.
27. Format the product of all integers between A and B as `C = D * 10^E` (D's last digit non-zero).
## C. Arrays / Strings 
28. Given two arrays, print all distinct elements from both + total count.
29. Merge two sorted arrays into one sorted array.
30. Given an unsorted array, find equilibrium index (left-sum == right-sum).
31. Find all triplets in an array that can form a triangle (condition: a + b > c).
32. Find the contiguous subarray with the largest sum (Kadane's Algorithm).
33. Implement bubble sort / insertion sort on an array.
34. Given `5,1,4,7,9...`, do an "alternate sort" and print every other sorted element (e.g., `1,5,9`).
35. Eliminate repeated letters/elements from an array.
36. Reverse a string (in place, without built-in reverse functions).
37. Find a substring in a given string and replace it with another string.
38. Replace all vowels in a string with a given character.
39. Check if two given strings/arrays are anagrams.
40. Check if two matrices are identical (compare all elements).
41. Print a 2D array/matrix in spiral order.
42. Find the row in a matrix with the maximum number of 0s.
43. Find a target value in a 2D matrix (given rowCount, columnCount); return coordinates, else `(-1,-1)`.
44. Generate all Pythagorean triples smaller than a given limit.
45. Find GCD of two numbers using the "common factors" listing approach (as an alternate method).
## D. Data Structures / Algorithms
46. Insert a node into a **sorted circular linked list**.
47. Implement an **LRU Cache**: given `max_cache_size`, an array of `pages`, and its length, return the number of cache misses (or hits).
48. Implement **Round Robin CPU scheduling**: given arrival times, burst/run times, number of jobs `n`, and time quantum `q`, calculate average waiting time.
49. **Cell/Automaton simulation**: given an 8-element array of 0/1 (inactive/active cell) and an integer `days`, simulate cell states day-by-day based on neighbor states, return final state.
50. **Minimum fountains to cover a garden**: given `locations[]` array representing each fountain's coverage radius along a 1D garden of length `n`, find the minimum number of fountains to activate to cover the entire garden.
51. **Maze/Path finding**: given a 2D array where 0 = wall, 1 = path, 9 = destination — determine if a path exists from top-left corner to the destination cell (DFS/BFS).
52. **Minimum time to merge candy boxes**: given `n` boxes with candy counts, and each merge of two boxes (X, Y) costs `X+Y` seconds, find minimum total time to merge all into one box (min-heap / greedy, similar to Huffman coding).
53. Reverse a singly/doubly linked list.
54. Detect a cycle in a linked list.
55. Check if a Binary Search Tree is valid.
56. Find the height/depth of a binary tree.
57. Implement a stack using two queues (or vice versa).
58. Find the second-largest element in an array without sorting.
59. Check if a string has balanced parentheses.
60. Find the longest common prefix among an array of strings.
## A. Syntax Errors
61. Stray semicolon after a `for`/`while` loop header causing the loop body to execute only once.
62. `switch` statement using a `float` instead of `int`/`char` (switch expressions must be integral type).
63. Missing header includes (`#include <stdio.h>` etc.) causing compile failure.
64. Mismatched brackets/braces in nested loops.
65. Incorrect function signature (wrong return type or missing parameters) vs. how it's called.
## B. Logical Errors
66. Off-by-one errors in loop bounds: `i <= n` used where `i < n` was intended (or vice versa), causing array out-of-bounds or missing last element.
67. Fibonacci function with an uninitialized or wrongly-initialized `cur` variable:
68. Binary search with incorrect midpoint calculation or wrong boundary updates (`low`/`high` not updated correctly, infinite loop).
69. Merge function (like LeetCode's "merge sorted array") with incorrect loop bounds:
70. Equilibrium index function with incorrect sum ranges (left-sum/right-sum helper functions computing wrong index ranges).
71. Sorting algorithm (bubble/insertion sort) with incorrect swap condition or loop range, producing wrong order or missing the last comparison.
72. Recursive GCD/factorial function with wrong base case (e.g., `if(a==0) return 1;` instead of the correct terminating condition).
73. Array/loop iterating over wrong length variable (e.g., using a hardcoded `10` instead of the actual `n`).
74. Incorrect variable assignment in swapping logic (e.g., temp variable overwritten before use).
75. Wrong comparison operator (`=` instead of `==`) inside an `if` condition.
## C. "Complete the function by reusing existing code" type
76. Given a helper function already implemented (e.g., `isPrime()`), call it correctly inside a `main()` that currently has a placeholder/incomplete loop.
77. Given a partially written linked-list function, complete the missing pointer reassignment logic using already-defined helper functions (don't re-implement traversal from scratch).
78. Complete a partially-written recursive function by adding the missing recursive call and base case.
79. "Given solution for (n-1), can easily solve for n" → identifies **Recursion**.
80. Fixed part vs. variable part of algorithm memory — which concerns designers more → **Variable part**.
81. Time complexity of common algorithms (bubble sort, binary search, etc.) — brush up on Big-O basics.
82. Basic OOP concepts (if a "Computer Science" domain add-on module appears with Automata).

###
---

# E. Recursion

### Basic Recursion (Understand the mechanics)

1. Print numbers from `1` to `n` using recursion.
2. Print numbers from `n` to `1` using recursion.
3. Find the sum of the first `n` natural numbers recursively.
4. Find the factorial of a number using recursion.
5. Find the power `xⁿ` recursively (without using `Math.pow()`).
6. Find the nth Fibonacci number using recursion.
7. Find the GCD of two numbers using recursion.
8. Reverse a string recursively.
9. Check whether a string is a palindrome using recursion.
10. Find the sum of digits of a number recursively.

### Intermediate Recursion (Learn recursive decomposition)

11. Find the maximum element in an array recursively.
12. Find the minimum element in an array recursively.
13. Check whether an array is sorted recursively.
14. Count the occurrences of a target element recursively.
15. Perform binary search recursively.
16. Reverse an array recursively.
17. Replace all occurrences of a character in a string recursively.
18. Remove duplicate consecutive characters recursively.
19. Remove all occurrences of a given character recursively.
20. Generate all subsequences of a string.


### Backtracking Foundations

21. Generate all subsets (Power Set) of an array.
22. Generate all subsets of a string.
23. Generate all permutations of a string.
24. Generate all permutations of an integer array.
25. Generate all combinations of size `k` from `n` numbers.
26. Generate all valid parentheses for `n` pairs.
27. Generate all binary strings of length `n`.
28. Generate all strings of length `n` using given characters.
29. Print all paths from the root to leaf in a binary tree.
30. Print all paths in a triangle from top to bottom.


### Recursion on Trees

31. Find the height of a binary tree recursively.
32. Count the total number of nodes in a binary tree.
33. Count the leaf nodes.
34. Find the maximum value in a binary tree.
35. Check whether two binary trees are identical.
36. Mirror (invert) a binary tree.
37. Check whether a binary tree is balanced.
38. Find the diameter of a binary tree.
39. Find the lowest common ancestor of two nodes.
40. Validate whether a binary tree is a BST recursively.


### Backtracking / Search Problems

41. Solve the Rat in a Maze problem.
42. Solve the N-Queens problem.
43. Solve Sudoku using recursion.
44. Word Search (existence of a word in a character grid).
45. Generate all possible letter combinations of a phone number.
46. Restore all valid IP addresses from a string.
47. Palindrome Partitioning.
48. Combination Sum.
49. Combination Sum II.
50. Subsets II (array with duplicates).


### Divide and Conquer (Recursive Algorithms)

51. Merge Sort.
52. Quick Sort.
53. Find the kth smallest element using QuickSelect.
54. Count inversions in an array using Merge Sort.
55. Find the majority element using divide and conquer.
56. Find maximum subarray sum using divide and conquer.
57. Convert a sorted array into a height-balanced BST.
58. Construct a binary tree from preorder and inorder traversal.


### Dynamic Programming via Recursion (Memoization)

59. Climbing Stairs.
60. House Robber.
61. Minimum Path Sum in a Triangle.
62. Coin Change.
63. 0/1 Knapsack.
64. Longest Common Subsequence.
65. Edit Distance.
66. Decode Ways.
67. Unique Paths.
68. Word Break.


### Hard Recursive / Interview Classics

69. Tower of Hanoi.
70. Josephus Problem.
71. Expression Add Operators.
72. Different Ways to Add Parentheses.
73. Scramble String.
74. Regular Expression Matching (`.` and `*`).
75. Wildcard Matching (`?` and `*`).
76. Burst Balloons (recursive + memoization).
77. Cherry Pickup.
78. Remove Invalid Parentheses.



**25 recursion questions**:

* 1–10 (all basics)
* 11, 13, 15, 16
* 21, 23, 25, 26
* 30 (Triangle paths)
* 31, 32, 35, 36
* 41 (Rat in a Maze)
* 51 (Merge Sort)
* 52 (Quick Sort)
* 59 (Climbing Stairs)
* 61 (Triangle Minimum Path)
* 62 (Coin Change)
* 64 (Longest Common Subsequence)
* 69 (Tower of Hanoi)


###
---
## From leetcode
1. Longest Substring Without Repeating Characters.
```
Given a string s, find the length of the longest substring without duplicate characters.

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
```
2. Check if String is a palandrome?

3. Longest Palindromic Substring**

Given a string `s`, return the **longest substring** that is a **palindrome**.

A **palindrome** is a string that reads the same forwards and backwards.
Example 1

```text
Input:  s = "babad"
Output: "bab"
```


Example 2

```text
Input:  s = "cbbd"
Output: "bb"
```
4 . check if every word exist in the string form the arrey no word reused. 

5. All The Anagram in a string 
```
Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.

 

Example 1:

Input: s = "cbaebabacd", p = "abc"
Output: [0,6]
Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".
```
6. Search a 2D Matrix
```
You are given an m x n integer matrix matrix with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.
```
7. Spiral Matrix II
```
Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.

Example 1:
Input: n = 3
```
<img width="100" height="100" alt="image" src="https://github.com/user-attachments/assets/fb6a09d0-ab9e-491c-95e9-67f4739c53a5" />

```
Output: [[1,2,3],[8,9,4],[7,6,5]]

Example 2:
Input: n = 1
Output: [[1]]
```
