//{ Driver Code Starts
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
       int r1=0, c1=0, r2=r-1, c2=c-1;
       
       ArrayList<Integer> list = new ArrayList<Integer>();
       
       while(c1<= c2 && r1 <= r2){
           for(int i=c1; i<=c2; i++){
               list.add(matrix[r1][i]);
           }
           r1++;
           
           for(int i=r1; i<=r2; i++){
               list.add(matrix[i][c2]);
           }
           c2--;
           
           if(r1<=r2){
               for(int i=c2; i>=c1; i--){
                    list.add(matrix[r2][i]);
               }
               r2--;
           }
           
           
           if(c1<=c2){
               for(int i=r2; i>=r1; i--){
                    list.add(matrix[i][c1]);
                }
                c1++;
           }
           
           
       }
       return list;
    }
}
