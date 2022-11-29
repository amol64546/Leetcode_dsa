//{ Driver Code Starts
import java.io.*;
import java.util.*;
class Node
{
    int data;
    Node next;
    
    Node(int x)
    {
        data = x;
        next = null;
    }
}
class GfG
{
    public static void printList(Node node) 
    { 
        while (node != null)
        { 
            System.out.print(node.data);
            node = node.next; 
        }  
        System.out.println();
    } 
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Node head = new Node( s.charAt(0) - '0' );
                    Node tail = head;
                    for(int i=1; i<s.length(); i++)
                    {
                        tail.next = new Node( s.charAt(i) - '0' );
                        tail = tail.next;
                    }
                    Solution obj = new Solution();
                    head = obj.addOne(head);
                    printList(head); 
                }
        }
}
// } Driver Code Ends


/*
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
} 
*/

class Solution
{
    public static Node addOne(Node head) 
    { 
        head = reverse(head);
        Node curr=head, prev=null;
        boolean flag = false;
        while(curr!=null){
            if(curr.data==9){
                
                curr.data = 0;
                prev = curr;
                curr=curr.next;
            }
            else{
                flag = true;
                curr.data +=1;
                break;
            }
            
            
        }
        if(!flag){
            prev.next = new Node(1);
        }
        return reverse(head);
        
    }
    
     public static Node reverse(Node head) {
        Node prev = null, curr = head, temp = null;
        while(curr != null){
            temp = curr.next;
            curr.next = prev;          
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}
