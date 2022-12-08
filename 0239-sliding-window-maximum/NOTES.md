1) Array  (n*n)
2) Deque
3) Priority Queue (n*logk)
​
​
​
deque always have at most k elements
iterate window of size k
first element of deque will be max always
**push** at last after removing all smaller and equal elements from end deque
**pop** if element index in before window size
​