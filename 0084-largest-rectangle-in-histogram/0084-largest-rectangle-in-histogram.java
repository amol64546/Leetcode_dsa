class Solution {
    public int largestRectangleArea(int[] arr) {
        int n = arr.length;
        
        Stack<Integer> st1 = new Stack<>();
        
        
        int[] ns = new int[n];
        for(int i=n-1; i>=0; i--){       
            while(!st1.empty() && arr[st1.peek()]>=arr[i])
                st1.pop();
            ns[i] = (st1.empty())? n: st1.peek();
            st1.push(i);
        }
        System.out.println(Arrays.toString(ns));
        st1.clear();
        
        int[] ps = new int[n];
         for(int i=0; i<n; i++){
            while(!st1.empty() && arr[st1.peek()]>=arr[i])
                st1.pop();
            ps[i] = (st1.empty())? -1: st1.peek();
            st1.push(i);
        }
        System.out.println(Arrays.toString(ps));
       
        int maxArea=0;
        for(int i=0; i<n; i++){
            int area = (ns[i]-ps[i]-1) * arr[i];
            System.out.print(area+" ");
            maxArea = Math.max(area, maxArea);
        }
        return maxArea;
    }
}