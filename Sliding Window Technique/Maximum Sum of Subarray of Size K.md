# Sliding Window Technique - Maximum Sum of Subarray of Size K

## Problem Statement

Given an integer array and an integer `k`, find the maximum sum of any contiguous subarray of size `k` using the **Sliding Window Technique**.

## Example

### **Input:**

```java
int arr[] = {8,3,-2,4,5,-1,0,5,3,9,-6};
int k = 5;
```

### **Values Computed During Execution:**

```java
18 9 6 13 12 16 11
```

### **Output:**

```java
18
```

## Approach 1: Brute Force (Nested Loops)

### **Code:**

```java
public class Demo {
    public static void main(String[] args) {
        int arr[] = {8,3,-2,4,5,-1,0,5,3,9,-6};
        int k = 5;
        System.out.println(checkGreatest(arr, k));
    }

    private static int checkGreatest(int[] arr, int k) {
        int finalVal = 0;
        int start = 0;
        int end = k;

        while (end <= arr.length) {
            int sum = 0;
            int i = start;
            while (i < end) {
                sum += arr[i];
                i++;
            }
            start++;
            end++;

            if (sum > finalVal) {
                finalVal = sum;
            }
        }
        return finalVal;
    }
}
```

### **Time Complexity:**

- **O(n \* k)** due to nested loops (for each subarray, we sum `k` elements repeatedly).
- **Inefficient** for large inputs.

## Approach 2: Optimized Sliding Window

### **Optimized Code 1:**

```java
public class Demo {
    public static void main(String[] args) {
        int arr[] = {8,3,-2,4,5,-1,0,5,3,9,-6};
        int k = 5;
        System.out.println(checkGreatestOptimize(arr, k));
    }
    private static int checkGreatestOptimize(int[] arr, int k) {
        int currentSum = 0;

        // Compute sum of first k elements
        for (int i = 0; i < k; i++) {
            currentSum += arr[i];
        }
        int maxSum = currentSum;

        // Sliding window approach
       	start=1;
		end=k;

		while(end<arr.length)
		{
			currentSum =currentSum +arr[end]-arr[start-1];
			start++;
			end++;
			if(currentSum>maxSum)
			{
				maxSum=currentSum;
			}
		}
		return maxSum;
    }
}
```

### **Optimized Code ChatGPT:**

```java
public class Demo {
    public static void main(String[] args) {
        int arr[] = {8,3,-2,4,5,-1,0,5,3,9,-6};
        int k = 5;
        System.out.println(checkGreatestOptimize(arr, k));
    }

    private static int checkGreatestOptimize(int[] arr, int k) {
        int currentSum = 0;

        // Compute sum of first k elements
        for (int i = 0; i < k; i++) {
            currentSum += arr[i];
        }
        int maxSum = currentSum;

        // Sliding window approach
        for (int i = k; i < arr.length; i++) {
            currentSum = currentSum + arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
```

### **Time Complexity:**

- **O(n)** because each element is added and removed exactly once.
- **Efficient** and optimal for large inputs.
