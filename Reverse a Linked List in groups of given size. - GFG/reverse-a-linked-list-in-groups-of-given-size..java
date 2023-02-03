//{ Driver Code Starts
import java.util.*;
import java.lang.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class ReverseInSize
{
    static Node head;
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node tail = head;
            for(int i = 1; i < n; i++)
            {
                int a = sc.nextInt();
                // addToTheLast(new Node(a));
                tail.next = new Node(a);
                tail =tail.next;
            }
            
            int k = sc.nextInt();
            Solution ob = new Solution();
            Node res = ob.reverse(head, k);
            printList(res);
            System.out.println();
        }
    }
    
    public static void printList(Node node)
    {
        while(node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    
}


// } Driver Code Ends


/*node class of the linked list

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

class Solution
{
    public static Node reverse(Node head, int k)
    {
        //Your code here
        int n = 0;
        Node curr = head;
        while(curr!=null){
            n++;
            curr=curr.next;
        }
        
        Node dummy = new Node(0);
        dummy.next = head;
        
        Node prevPart = dummy;
        curr = prevPart.next;
        
        while(n>0){
            Node prev=null, temp=null;
            // reverse k part
            for(int i=0; curr!=null && i<k; i++){
                temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }
            prevPart.next.next = curr;
            temp = prevPart.next;
            prevPart.next = prev;
            prevPart = temp;
            n -= k;
        }
        
        return dummy.next;
        
    }
    
}
