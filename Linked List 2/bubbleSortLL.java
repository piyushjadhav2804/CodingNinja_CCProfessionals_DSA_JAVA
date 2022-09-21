// Given a singly linked list of integers, sort it using 'Bubble Sort.'
// Note :
// No need to print the list, it has already been taken care. Only return the new head to the list.
// Input format :
// The first and the only line of each test case or query contains the elements of the singly linked list separated by a single space.
// Remember/Consider :
// While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element
// Output format :
// For each test case/query, print the elements of the sorted singly linked list.

// Output for every test case will be printed in a seperate line.
// Constraints :
// 0 <= M <= 10^3
// Where M is the size of the singly linked list.

// Time Limit: 1sec
// Sample Input 1 :
// 10 9 8 7 6 5 4 3 -1
// Sample Output 1 :
//  3 4 5 6 7 8 9 10 

public class Solution {
    
    public static int length(LinkedListNode<Integer> head) {
        
        int count=0;
         
        while(head != null) {
            
            count++;
            
            head = head.next;
        }
        
        return count;
    }

	public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head) {
		//Your code goes here
        
        if(head == null || head.next == null)
            return head;
        
        for(int i=0; i<length(head)-1;i++) {
            
            LinkedListNode<Integer> prev = null;
            LinkedListNode<Integer> curr = head;
            LinkedListNode<Integer> next = curr.next;

            while(curr.next != null) {
                
                if(curr.data > curr.next.data) {
                    
                    if(prev == null) {
                        
                        curr.next = next.next;
                        next.next = curr;
                        prev = next;
                        head = prev;
                    }
                    
                    else {
                        next = curr.next;
                        curr.next = next.next;
                        prev.next = next;
                        next.next = curr;
                        prev = next;
                    }
                }
                
                else {
                    
                    prev = curr;
                    curr = curr.next;
                }
            }
        }
        
        return head;
	}
}
