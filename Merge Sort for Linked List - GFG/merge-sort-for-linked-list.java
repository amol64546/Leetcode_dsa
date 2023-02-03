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
    //Function to sort the given linked list using Merge Sort.
    static Node mergeSort(Node head)
    {
        // add your code here
        if(head==null || head.next==null) return head;
        Node mid = getMid(head);
        Node left = mergeSort(head);
        Node right = mergeSort(mid);
        return merge(left,right);
        
    }
    
    static Node merge(Node f, Node s){
        Node temp = new Node(0);
        Node head = temp;
        while(f!=null && s!=null){
            if(f.data<s.data){
                temp.next = f;
                f=f.next;
            }else{
                temp.next = s;
                s=s.next;
            }
            temp=temp.next;
        }
        if(f==null) temp.next = s;
        else temp.next = f;
        return head.next;
    }
    
    static Node getMid(Node head)
    {
         // Your code here.
         Node slow=head,fast=head, prev=null;
         while(fast!=null && fast.next!=null){
             prev = slow;
             slow = slow.next;
             fast = fast.next.next;
         }
         prev.next = null;
         return slow;
    }
}


