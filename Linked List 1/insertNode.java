// You have been given a singly linked list of integers, an integer value called 'data' and a position with the name 'pos.'
//  Write a function to add a node to the list with the 'data' at the specified position, 'pos.'
// Note :
// Assume that the Indexing for the singly linked list always starts from 0.

// If the position is greater than the length of the singly linked list, you should return the same linked list without any change.
  
//   Input format :
// The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

// The first line of each test case or query contains the elements of the linked list separated by a single space. 

// The second line contains the two integer values of 'data' and 'pos' separated by a single space, respectively
// Reminder/Consider :
// While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element.
// Output format :
// For each test case, print the resulting singly linked list of integers in a row, separated by a single space.

// Output for every test case will be printed in a seperate line.
//  Constraints :
// 1 <= t <= 10^2
// 0 <= N <= 10^5
// pos >= 0
// Time Limit: 1sec
// Sample Input 1 :
// 1
// 3 4 5 2 6 1 9 -1
// 3 100
// Sample Output 1 :
// 3 4 5 100 2 6 1 9

public class Solution {

    public static int length(LinkedListNode<Integer> head){
	   
        int count=0;
        
        while(head != null) {
            
            count++;
            
            head = head.next;
        }
        
        return count;
	}
    
	public static LinkedListNode<Integer> insert(LinkedListNode<Integer> head, int pos, int data){
		//Your code goes here
        
        LinkedListNode<Integer> newNode = new LinkedListNode<>(data);
        
       	if(pos > length(head)) {
             
    		return head;
        }
        
        else if(pos == 0) {
            
            newNode.next = head;
            head = newNode;
        }
        
        else {
         
            LinkedListNode<Integer> temp = head;
            
            for(int i=0; i<pos-1; i++) {
                
                temp = temp.next;
            }
            
            newNode.next = temp.next;
            temp.next = newNode;
        }
        
        return head;
	}
}
