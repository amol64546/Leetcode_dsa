//{ Driver Code Starts
import java.util.*;
class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.palinArray(a , n));
		}
	}
}
// } Driver Code Ends


/*Complete the Function below*/
class GfG
{
	public static int palinArray(int[] arr, int n)
           {
                  //add code here.
                 for(int val: arr){
                     if(!isPalindrome(val)) return 0;
                 }
                 return 1;
           }
           
           public static boolean isPalindrome(int val){
               int ele = val;
               int rev=0;
               while(val>0){
                   rev = rev*10 + (val%10);
                   val = val/10;
               }
               return ele==rev;
           }
}