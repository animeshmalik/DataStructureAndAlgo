package org.algo.linkedList;

import java.io.*;


public class ReverseLinkedList {

	
	   public static void main(String[] args) throws IOException {
	
		   SinglyLinkedListNode head=new SinglyLinkedListNode(1);
		    head.next=new SinglyLinkedListNode(2);
		    head.next.next=new SinglyLinkedListNode(3);
		head.next.next.next=new SinglyLinkedListNode(4);
		   head.next.next.next.next=new SinglyLinkedListNode(5);
		   
		   SinglyLinkedListNode head1=deleteNode(head, 10);
		   printSinglyLinkedList(head1);
		  
		   insertNodeAtTail(head, 10);
		   printSinglyLinkedList(head);
		   
		  // SinglyLinkedListNode reverseHead=reverse(head);
		   System.out.println("---------------");
		  // printSinglyLinkedList(reverseHead);
		   printSinglyLinkedListReverse(head);
		   System.out.println("---------------");
		   printSinglyLinkedList(reverseRecursive(head,null));
		   
	        }
	   static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
	        int i=0;
	        SinglyLinkedListNode currentNode=head;
	        SinglyLinkedListNode previousNode=null;
	        while(i!=position && currentNode!=null){
	            i++;
	        previousNode=currentNode;
	        currentNode=currentNode.next;
	        }
	        if(currentNode!=null && currentNode.next!=null){
	        previousNode.next=currentNode.next;
	        }

	       return head;
	    }

	   static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
	       SinglyLinkedListNode lastNode=head;
	        while(lastNode.next!=null){
	            lastNode=lastNode.next;
	        }
	        SinglyLinkedListNode newNode=new SinglyLinkedListNode(data);
	        lastNode.next=newNode;
	        return head;
	    }

	    static class SinglyLinkedListNode {
	        public int data;
	        public SinglyLinkedListNode next;

	        public SinglyLinkedListNode(int nodeData) {
	            this.data = nodeData;
	            this.next = null;
	        }
	    }

	  

	    public static void printSinglyLinkedList(SinglyLinkedListNode node) throws IOException {
	        while (node != null) {
	           System.out.println(String.valueOf(node.data));

	            node = node.next;

	           
	        }
	    }
	    
	    public static void printSinglyLinkedListReverse(SinglyLinkedListNode node) throws IOException {
	    	//System.out.println("node :"+node.data);
	      if(node.next!=null) {
	    	
	    	  printSinglyLinkedListReverse(node.next);
	      }
	    	System.out.println("value :"+node.data);
	    }

	    static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
	            SinglyLinkedListNode currentNode=head;  // current node begin with head
	            SinglyLinkedListNode previousNode=null; // previous node. initially it would be null.
	            SinglyLinkedListNode nextNode=head.next; // next node
	            while(nextNode!=null){ // if next node is present.
	                currentNode.next=previousNode; // reverse the Links.
	                
	                //move the nodes
	                previousNode=currentNode;
	                currentNode=nextNode;
	                nextNode=nextNode.next;
	                

	            }
	            currentNode.next=previousNode;  // now currentNode is Last node. adding link of previousNode.
	            head=currentNode;
	            return head;

	    }

	    static SinglyLinkedListNode reverseRecursive(SinglyLinkedListNode currentNode,SinglyLinkedListNode previousNode) {
           
            SinglyLinkedListNode nextNode=currentNode.next;             
            currentNode.next=previousNode; 

            if(nextNode !=null) {
            	
            	currentNode=reverseRecursive(nextNode,currentNode);
            }
          
            return currentNode;

    }
}
