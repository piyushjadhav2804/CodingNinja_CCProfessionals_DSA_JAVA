// You have been given a head to a singly linked list of integers. Write a function check to whether the list given is a 'Palindrome' or not.
//  Input format :
// The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

// First and the only line of each test case or query contains the the elements of the singly linked list separated by a single space.
//  Remember/Consider :
// While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element.
//  Output format :
// For each test case, the only line of output that print 'true' if the list is Palindrome or 'false' otherwise.
//  Constraints :
// 1 <= t <= 10^2
// 0 <= M <= 10^5
// Time Limit: 1sec

// Where 'M' is the size of the singly linked list.
// Sample Input 1 :
// 1
// 9 2 3 3 2 9 -1
// Sample Output 1 :
// true

public class Solution {
    
    public static LinkedListNode<Integer> mid(LinkedListNode<Integer> head) {
        
        LinkedListNode<Integer> slow = head, fast = head;
        
        while(fast.next != null && fast.next.next != null) {
            
            slow = slow.next;
            
            fast = fast.next.next;
        }
        
        return slow;
    }
    
    static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head) {

        LinkedListNode<Integer> curr = head;
        LinkedListNode<Integer> prev = null;
        LinkedListNode<Integer> next = null;

        while(curr != null) {

            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next; 
        }

        head = prev;

        return head;
    }
    
	public static boolean isPalindrome(LinkedListNode<Integer> head) {
		//Your code goes here
        
        if(head==null || head.next==null)
            return true;
        
        LinkedListNode<Integer> mid = mid(head);
        LinkedListNode<Integer> right = mid.next;
        
        mid.next = null;
        
        right = reverse(right);
        
        while(right != null) {
            
            if(!right.data.equals(head.data)) {
                
                return false;
            }
            
            head = head.next;
            right = right.next;
        }
            
        return true;
    }
}
