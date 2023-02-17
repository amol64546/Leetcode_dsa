//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        // code here 
        String ans = "";
        
        int start = 0;
        for(int end=0; end<S.length(); end++){
            if(S.charAt(end)=='.'){
                ans += reverse(S.substring(start,end))+".";
                start = end+1;
            }
        }
        ans += reverse(S.substring(start,S.length()));
        return reverse(ans);
    }
    
    String reverse(String s){
        char[] arr = s.toCharArray();
        
        int i=0, j = arr.length-1;
        while(i<j){
            // swap
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; j--;
        }
        
        return String.valueOf(arr);
    }
}