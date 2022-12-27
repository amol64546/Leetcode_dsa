//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            List<Integer> numbers= new ArrayList<Integer>();
            numbers = ob.minPartition(N);
            for(int i: numbers){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static List<Integer> minPartition(int n)
    {
       List<Integer> list = new ArrayList<Integer>();
       while(n>0){
           if(n>=2000){
               list.add(2000);
               n -= 2000;
           }
           else if(n>=500){
               list.add(500);
               n -= 500;
           }
           else if(n>=200){
               list.add(200);
               n -= 200;
           }
           else if(n>=100){
               list.add(100);
               n -= 100;
           }
           else if(n>=50){
               list.add(50);
               n -= 50;
           }
           else if(n>=20){
               list.add(20);
               n -= 20;
           }
           else if(n>=10){
               list.add(10);
               n -= 10;
           }
           else if(n>=5){
               list.add(5);
               n -= 5;
           }
           else if(n>=2){
               list.add(2);
               n -= 2;
           }
           else if(n>=1){
               list.add(1);
               n -= 1;
           }
           
       }
       return list;
        
    }
}