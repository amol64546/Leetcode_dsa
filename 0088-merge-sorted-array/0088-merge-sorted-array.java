class Solution {
    public void merge(int[] A, int m, int[] B, int n) { 
       
          //    if (n == 0) return;
    //     for (int i = m + n - 1; i >= 0; i--) {
    //         if (m == 0)                       
    //               A[i] = B[--n];         
    //         else if (A[m - 1] > B[n - 1])     
    //               A[i] = A[--m];
    //         else                              
    //               A[i] = B[--n];
    //     }

    while(n>0) 
            A[m+n-1] = (m==0||B[n-1] > A[m-1]) ? B[--n] : A[--m];
    }
}