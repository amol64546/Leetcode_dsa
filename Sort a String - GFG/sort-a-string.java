//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());
        while(t-- > 0){
            String s = sc.nextLine().trim();
            Solution obj = new Solution();
            System.out.println(obj.sort(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String sort(String s) 
    {
        int[] count = new int[26];
        
        for(char c: s.toCharArray())
            count[c-'a']++;
            
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<26; i++){
            if(count[i]==0) continue;
            int n = count[i];
            while(n-->0){
              sb.append((char)(i+'a'));
            }
            
        }
        return sb.toString();
    }
} 