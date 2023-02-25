//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class PhoneDigit
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();//testcases
        
        
        while(t-- > 0)
        {
            int n = sc.nextInt(); // input size of array
            int arr[] = new int[n]; //input the elements of array that are keys to be pressed
            
            for(int i = 0; i < n; i++)
               arr[i] = sc.nextInt();//input the elements of array that are keys to be pressed
            ArrayList <String> res = new Solution().possibleWords(arr, n);
            for (String i : res) System.out.print (i + " ");
             System.out.println();
              
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find list of all words possible by pressing given numbers.
    static ArrayList <String> possibleWords(int a[], int N)
    {
        // your code here  
        Map<Integer,String> map = new HashMap<>();
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");
        ArrayList<String> list = new ArrayList<>();
        backtrack(a,0,list,new StringBuilder(),map);
        return list;
    }
    
    static void backtrack(int[] a,int i,ArrayList<String> list, StringBuilder sb,Map<Integer,String> map){
        if(sb.length()==a.length){
            list.add(sb.toString());
            return;
        }
        String curr = map.get(a[i]);
        for(int j=0;j<curr.length(); j++){
            sb.append(curr.charAt(j));
            backtrack(a,i+1,list,sb,map);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}


