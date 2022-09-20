// For a given singly linked list of integers, arrange the elements such that all the even numbers are placed after the odd numbers. The relative order of the odd and even terms should remain unchanged.
// Note :
// No need to print the list, it has already been taken care. Only return the new head to the list.
// Input format:
// The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

// The first line of each test case or query contains the elements of the singly linked list separated by a single space. 
//  Remember/Consider :
// While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element
// Output format:
// For each test case/query, print the elements of the updated singly linked list.

// Output for every test case will be printed in a seperate line.
// Constraints :
// 1 <= t <= 10^2
// 0 <= M <= 10^5
// Where M is the size of the singly linked list.

// Time Limit: 1sec
// Sample Input 1 :
// 1
// 1 4 5 2 -1
// Sample Output 1 :
// 1 5 4 2 

public class Solution {

	public static LinkedListNode<Integer> evenAfterOdd(LinkedListNode<Integer> head) {
		//Your code goes here
        
        if(head==null || head.next==null)
            return head;
        
        LinkedListNode<Integer> evenHead = null, evenTail = null;
        LinkedListNode<Integer> oddHead = null, oddTail = null;
        
        
        while(head != null) {
            
            if(head.data % 2 == 0) {
                
                if(evenHead == null) {
                    
                    evenHead = head;
                    evenTail = head;
                }
                
                else {
                    evenTail.next = head;
                	evenTail = head;
            	}
            }
            
            else {
                
               if(oddHead == null) {
                    
                    oddHead = head;
                    oddTail = head;
                }
                
                else {
                    oddTail.next = head;
                	oddTail = head;
            	}
            }
            
            head = head.next;
        }
        
        if(oddHead == null) {
            
            evenTail.next = null;
            return evenHead;
        }
        
        else {
            
            if(evenHead == null)
                return oddHead;
            
            else {
                
                oddTail.next = evenHead;
                evenTail.next = null;
                return oddHead;
            }
        }
	}
}
