//  Given a singly linked list of integers, sort it using 'Merge Sort.'
// Note :
// No need to print the list, it has already been taken care. Only return the new head to the list.
// Input format :
// The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

// The first and the only line of each test case or query contains the elements of the singly linked list separated by a single space.
// Remember/Consider :
// While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element
// Output format :
// For each test case/query, print the elements of the sorted singly linked list.

// Output for every test case will be printed in a seperate line.
// Constraints :
// 1 <= t <= 10^2
// 0 <= M <= 10^5
// Where M is the size of the singly linked list.

// Time Limit: 1sec
// Sample Input 1 :
// 1
// 10 9 8 7 6 5 4 3 -1
// Sample Output 1 :
//  3 4 5 6 7 8 9 10 

public class Solution {

    public static LinkedListNode<Integer> mergeLinkedLists(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
        //Your code goes here
        
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
        //Your code goes here4
        
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
    
	public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
		//Your code goes here
        
        if(head == null || head.next == null)
            return head;
        
        LinkedListNode<Integer> mid = midPoint(head);
        LinkedListNode<Integer> h2 = mid.next;
        mid.next = null;
        
        LinkedListNode<Integer> list1 = mergeSort(head);
        LinkedListNode<Integer> list2 = mergeSort(h2);
        
        LinkedListNode<Integer> res = mergeLinkedLists(list1, list2);
        
        return res;
	}

}
