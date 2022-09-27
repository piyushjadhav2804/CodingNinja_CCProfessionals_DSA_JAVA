// Given a large number represented in the form of a linked list. Write code to increment the number by 1 in-place(i.e. without using extra space).
// Note: You don't need to print the elements, just update the elements and return the head of updated LL.
// Input Constraints:
// 1 <= Length of Linked List <=10^6.
// Input format :
// Line 1 : Linked list elements (separated by space and terminated by -1)
// Output Format :
// Line 1: Updated linked list elements 
// Sample Input 1 :
// 3 9 2 5 -1
// Sample Output 1 :
// 3 9 2 6

/*************** 
 * Following is the Node class already written 
class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.data = data;
	}
}
 ***************/

public class Solution {

  
    public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head) {
        
        LinkedListNode<Integer> curr = head;
        LinkedListNode<Integer> prev = null;
        LinkedListNode<Integer> next = null;
        
        while(curr != null) {
            
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;
    }
    
	public static LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> head) {
           
        if(head == null)
            return head;
        
        LinkedListNode<Integer> temp = reverse(head);
        LinkedListNode<Integer> temp1 = temp, tem = temp;
        
		int carry=0, ans=0;
        int extra=0;
        LinkedListNode<Integer> a= new LinkedListNode<Integer>(1);
        
		while(tem != null) {
            
            if(tem.data==9){
                tem.data=0;
                extra=1;
                if(tem.next==null){
                    tem.next=a;
                }
            }else{
              if(extra==1){                
                int d=tem.data+1;
                if(d==10){
                  tem.data=0;
                   extra=1;  
                }else{
                   extra=0;
                }
              }else{                
                  tem.data=tem.data+1;
                  break;
            }}
            tem=tem.next;
            
        }
        
        if(carry == 1) {
            
            LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(1);
                        
            newNode.next = temp1;
            temp1 = newNode;
        }
        
        LinkedListNode<Integer> newHead =  reverse(temp1);
        
        
        return newHead;
	}


}
