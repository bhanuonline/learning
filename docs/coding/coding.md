**Two Pointer**
* The Two Pointer Technique is a common algorithmic approach used to solve problems efficiently by using two pointers (or indices) to traverse data structures like arrays or strings. It reduces the time complexity compared to traditional approaches by narrowing down the search space dynamically.
* The pointers can move in the same direction, opposite directions, or independently, depending on the problem.
* Optimize performance by avoiding nested loops or unnecessary computations
* 
Common Use Cases
    
    Sorted Arrays (Two Sum, Closest Pair):
    One pointer starts from the beginning (low) and the other from the end (high).
    Adjust pointers based on conditions (e.g., sum comparison).

    Finding Subarrays or Substrings:
    Maintain a sliding window with two pointers.
    Adjust the window size by moving pointers.

    Removing Duplicates:Use two pointers to compare elements and overwrite duplicates.
    Merging Two Arrays:Traverse two arrays simultaneously using two pointers.
    Palindrome Checking:Use two pointers starting from the two ends of a string.

Advantages
  Reduces time complexity by eliminating nested iterations. O(n)
  Space-efficient (usually works in-place without extra storage).O(1)
