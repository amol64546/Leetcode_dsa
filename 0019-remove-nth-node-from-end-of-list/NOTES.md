prev of node
pos = size-n from last
edge case   ->  if size==n,return next head
​
one pass
create dummy node before head
traverse 2nd ptr until n from dummy node
then traverse 1st and 2nd both until 2nd reach at last node
then use 1st ptr to delete nth node from end