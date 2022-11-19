//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

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

class Driverclass
{
    
    public static void main (String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            while(n-- > 1){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		   
		      head = new Solution().mergeSort(head);
		     printList(head);
		    System.out.println();
        }
    }
    public static void printList(Node head)
    {
        if(head == null)
           return;
           
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}



// } Driver Code Ends


//User function Template for Java
/*
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        this.data = key;
        next = null;
    }
} */

class Solution
{
    
    static Node getAndcutMid(Node curr){
        Node slow = curr, fast = curr;
        Node prev = null;
        while(fast!=null && fast.next!=null){
            prev = slow;
            slow=slow.next;
            fast = fast.next.next;
            
        }
        prev.next = null;  // cut
        return slow;
    }
    //Function to sort the given linked list using Merge Sort.
    static Node mergeSort(Node head)
    {
        if(head==null || head.next==null) return head;
        Node mid = getAndcutMid(head);   // dividing into two
        Node left = mergeSort(head);
        Node right = mergeSort(mid);
        return sort(left,right);
        
    }
    
    static Node sort(Node left, Node right){
        Node dummy = new Node(0);
        Node curr = dummy;
        while(left!=null && right!=null ){
            if(left.data<right.data){
                curr.next = left;
                left = left.next;
            }else{
                curr.next = right;
                right = right.next;
            }
            curr = curr.next;
        }
        
        curr.next = (left!=null) ? left:right;
        return dummy.next;
    }
}


