# Sliding Window Technique

Sliding Window problems involve moving a fixed or variable-size window through a data structure,

typically an array or string,

to solve problems efficiently based on continuous subsets of elements.

This technique is used when we need to find **subarrays** or **substrings** according to a given set of conditions.
![Sliding Window](<images/Sliding-Window-Technique-copy-(1).webp>)

![example](images/sliding-window-technique-2.webp)

## **Why Sliding Window?**

- The brute-force approach recomputes sums, leading to unnecessary operations.
- The sliding window method **reuses the previous sum** by subtracting the outgoing element and adding the incoming one.
- This reduces redundant computations and improves efficiency from **O(n \* k) → O(n)**.

## **Final Thoughts**

- The optimized approach using the **Sliding Window Technique** is the best way to solve this problem.
- It efficiently finds the maximum sum of any subarray of size `k` in **O(n) time**.
- This concept is widely used in array problems, including **longest subarrays, frequency counts, and dynamic window problems**.

## **Additional Practice**

Try applying the **Sliding Window Technique** to:

1. **Maximum Sum of Subarray of Size K**
2. **Longest Substring Without Repeating Characters**
3. **Minimum Window Substring**
4. **Smallest Subarray with Sum Greater Than `x`**

Happy Coding! 🚀
