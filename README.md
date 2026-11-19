# Java Sorting Lab

## About the Project

Java Sorting Lab is a console application that implements three sorting algorithms: Selection Sort, Insertion Sort, and Merge Sort.

The goal of this project is to practice Java programming, understand sorting algorithms, and improve problem-solving skills.

## Features

- Create custom integer arrays through console input.
- Choose between three sorting algorithms.
- Sort numbers in ascending order.
- Display the original and sorted arrays.
- Reject zero or negative array sizes.

## Algorithms

### Selection Sort
Finds the smallest element in the unsorted portion of the array and places it in its correct position.

### Insertion Sort
Builds a sorted portion of the array by moving elements into their correct positions.

### Merge Sort
Uses recursion and the divide-and-conquer approach to split an array into smaller parts and merge them in sorted order.

## How to Run

1. Clone or download this repository.
2. Open the project in IntelliJ IDEA.
3. Make sure Java JDK 15 or newer is installed and configured.
4. Run `Main.java`.
5. Enter the number of elements and their values.
6. Select a sorting algorithm (1, 2, or 3).
7. View the sorted array in the console.

## Example Output

```text
Enter the size of your array:
5
Enter your number 1 element of array: 8
Enter your number 2 element of array: 3
Enter your number 3 element of array: 6
Enter your number 4 element of array: 1
Enter your number 5 element of array: 9

Your array:
8 3 6 1 9

Choose a sorting algorithm that you'd like to do:
1. Selection Sort
2. Insertion Sort
3. Merge Sort
Enter your choice:
3

Merge Sort selected
Sorted array:
1 3 6 8 9
```

## Complexity Comparison

| Algorithm | Best Time | Average Time | Worst Time | Extra Space |
|---|---|---|---|---|
| Selection Sort | O(n²) | O(n²) | O(n²) | O(1) |
| Insertion Sort | O(n) | O(n²) | O(n²) | O(1) |
| Merge Sort | O(n log n) | O(n log n) | O(n log n) | O(n) |

## What I Learned

- Working with arrays and loops in Java.
- Implementing sorting algorithms from scratch.
- Understanding recursion and divide-and-conquer.
- Using methods to organize code.
- Handling console input with Scanner.
- Comparing algorithm time and space complexity.
- Using Git and GitHub for version control.