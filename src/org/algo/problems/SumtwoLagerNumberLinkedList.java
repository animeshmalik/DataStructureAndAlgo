package org.algo.problems;

public class SumtwoLagerNumberLinkedList {
	
	public static void main(String[] args) {
		int[] x1={1234,5678,9012,3456};
		int[] x2={9234,8678,3012,7456};
		SinglyLinkedListNode n1=createList(x1);
		SinglyLinkedListNode n2=createList(x2);
		
		n1=reverseRecursive(n1, null);
		n2=reverseRecursive(n2, null);
		SinglyLinkedListNode result=new SinglyLinkedListNode(0);
		SinglyLinkedListNode temp=result;
		int carry=0;
		while(n1!=null && n2!=null) {
			int a1=n1.data;
			int b1=n2.data;
			int sum=carry+a1+b1;
			if(sum>=10000) {
				carry=sum/10000;
				
			}
			temp.next=new SinglyLinkedListNode(sum%10000);
			n1=n1.next;
			n2=n2.next;
			temp=temp.next;
			
			
		}
		if(carry>0)
			temp.next=new SinglyLinkedListNode(carry);
		
		printSinglyLinkedList(reverseRecursive(result.next,null));
		
		
	}
	
	public static SinglyLinkedListNode createList(int[] datas) {
		SinglyLinkedListNode head=new SinglyLinkedListNode(datas[0]);
		SinglyLinkedListNode temp=head;
		for(int i=1;i<datas.length;i++) {
			temp.next=new SinglyLinkedListNode(datas[i]);
			temp=temp.next;
		}
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
	 public static void printSinglyLinkedList(SinglyLinkedListNode node) {
		 boolean firstNode=true;
	        while (node != null) {
	        	if(firstNode) {
	        		System.out.println(node.data);
	        		firstNode=false;
	        	}else {
	        		String r=String.valueOf(node.data);	        		
	        		if(r.length()<4) {
	        			//adding 0s
	        			for(int i=r.length();i<4;i++) {
	        				r="0"+r;
	        			}
	        		}
	        		System.out.println(r);
	        	
	        	}
	            node = node.next;

	           
	        }
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

