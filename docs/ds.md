**BubbleSort**
* Outer loop runs n−1 times
* Inner loop runs n−i−1 times to ensure comparisons are only made on the unsorted part of the array
* Arrays.sort() method or Collections.sort() for their optimized performance
* Time complexity estimates how many basic operations (like comparisons or swaps) the algorithm performs as n increases.
* Big-O Notation : Used to describe the growth rate of the algorithm O(n2)

**Selection Sort**
* Selection Sort is not efficient for large datasets.
* Since Selection Sort is an in-place algorithm and requires O(1) extra space, it is suitable for environments with very limited memory
* Selection Sort makes at most n−1 swaps, which is fewer than some other sorting algorithms like Bubble Sort
* Selection Sort is not stable. It may change the relative order of equal elements. For example, if stability is required, algorithms like Merge Sort or Insertion Sort are better options
* Selection Sort does not adapt to special characteristics of arrays (e.g., already sorted, reverse sorted, duplicates). It always performs the same number of comparisons regardless of input

**Insertion Sort**
* Time Complexity:O(n) (Array is already sorted; only one comparison per element is needed.Worst-Case O(n2).
* Space Complexity:O(1) (In-place sorting; no extra memory is used).
* Suitable for small datasets or when the input is nearly sorted (e.g., in real-time systems).
* Insertion Sort is a stable algorithm because it does not change the relative order of equal elements

**Why is Insertion Sort Stable?**
`if two elements are equal, the one that appears earlier in the original array will also appear earlier in the sorted array.`During the shifting process, elements with equal values are not swapped.