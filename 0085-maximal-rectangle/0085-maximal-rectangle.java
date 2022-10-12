class Solution {
    public int maximalRectangle(char[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int[] currRow = new int[c];      

        int currAns = 0;
        int maxAns = 0;
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(matrix[i][j]=='1')
                    currRow[j]++;
                else
                    currRow[j]=0;
            }
             currAns = largestRectangleArea(currRow);
             maxAns = Math.max(maxAns,currAns);
        }
        return maxAns;
    }
    
     public int largestRectangleArea(int[] arr) {
        int n = arr.length;
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        
        
        int[] ns = new int[n];
        for(int i=n-1; i>=0; i--){       
            while(!st1.empty() && arr[st1.peek()]>=arr[i])
                st1.pop();
            ns[i] = (st1.empty())? n: st1.peek();
            st1.push(i);
        }
        
        int[] ps = new int[n];
         for(int i=0; i<n; i++){
            while(!st2.empty() && arr[st2.peek()]>=arr[i])
                st2.pop();
            ps[i] = (st2.empty())? -1: st2.peek();
            st2.push(i);
        }
        int maxArea=0;
        for(int i=0; i<n; i++){
            int area = (ns[i]-ps[i]-1) * arr[i];
            maxArea = Math.max(area, maxArea);
        }
        return maxArea;
    }
}