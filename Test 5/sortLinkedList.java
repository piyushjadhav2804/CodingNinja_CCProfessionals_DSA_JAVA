// Given a Linked List, which has nodes in alternating ascending and descending orders. Sort the list efficiently and space complexity should be O(1).
// You just need to return the head of sorted linked list, don't print the elements.
// Input format :
// Line 1 : Linked list elements of length L (separated by space and terminated by -1)
// Line 2 : Integer n
// Output format :
// Updated list elements (separated by space)
// Sample Input 1 :
// 10 40 53 30 67 12 89 -1
// Sample Output 1 :
// 10 12 30 40 53 67 89

public class Solution {
    
    public static LinkedListNode<Integer> mergeLinkedLists(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
        
        if(head1 == null)
            return head2;
        
        if(head2 == null)
            return head1;
        
     	LinkedListNode<Integer> temp1 = head1, temp2 = head2;
        
        LinkedListNode<Integer> head = null, tail = null;
        
        if(temp1.data <= temp2.data) {
            
            head = temp1;
            tail = temp1;
            temp1 = temp1.next;
        } 
        
        else {
            
            head = temp2;
            tail = temp2;
            temp2 = temp2.next;
        }
        
        while(temp1 != null && temp2 != null) {
            
         	if(temp1.data <= temp2.data) {
            
                tail.next = temp1;
				tail = temp1;
                temp1 = temp1.next;
            } 

            else {

                tail.next = temp2;
				tail = temp2;
                temp2 = temp2.next;
            }   
        }
        
        if(temp1 == null) {
            
            tail.next = temp2;
        }
        
        if(temp2 == null) {
            
			tail.next = temp1;
        }
        
        return head;
    }

    public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head) {
        
        if(head == null)
            return head;
        
        LinkedListNode<Integer> slow = head;
        LinkedListNode<Integer> fast = head;
        
        while(fast.next != null && fast.next.next != null ) {
            
            slow = slow.next;
            
            fast = fast.next.next;
        }
        
        return slow;
    }
    
	public static LinkedListNode<Integer> sort(LinkedListNode<Integer> head) {
		//Your code goes here
        
        if(head == null || head.next == null)
            return head;
        
        LinkedListNode<Integer> mid = midPoint(head);
        LinkedListNode<Integer> h2 = mid.next;
        mid.next = null;
        
        LinkedListNode<Integer> list1 = sort(head);
        LinkedListNode<Integer> list2 = sort(h2);
        
        LinkedListNode<Integer> res = mergeLinkedLists(list1, list2);
        
        return res;
	}

}
