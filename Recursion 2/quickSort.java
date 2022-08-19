/*
	To apply the method explained in the hint video, we have to add two more parameters in the function call. This can be done by calling a helper function from given function. The helper function can have three parameters: array, start index, end index.  
	
	Skeleton code to achieve this:
	public class Solution {
		public static void quickSort(int[] input, int startIndex, int endInedx) {
			// your code goes here
		}
	
		public static void quickSort(int[] input) {
			quickSort(input, 0, input.length - 1);
		}
	
	}
	
*/


public class Solution {
	
    public static void quickSort(int[] input, int si, int ei) {
        
        if (si>=ei) 
            return;
        
        int pivotIndex = partition(input,si,ei);
        
        quickSort(input, si, pivotIndex-1);
        quickSort(input,pivotIndex+1,ei);
    }
    
    public static int partition(int[] a, int si, int ei) {
        
        int pivotElement=a[si];
        int smallerEleCount=0;
        
        for(int i=si+1;i<=ei;i++) {
            
            if (a[i]<pivotElement) {
                
                smallerEleCount++;
            }
        }
        
        int temp = a[si+smallerEleCount];
        a[si+smallerEleCount]=pivotElement;
        a[si]=temp;
        
        int i=si;
        int j=ei;
        
        while(i<j) {
            
            if (a[i]<pivotElement) {
                
                i++;
            }
            
            else if (a[j]>=pivotElement) {
                
                j--;
            }
            
            else {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
                j--;
            }
        }
        
        return si+smallerEleCount;
    }
    
	public static void quickSort(int[] input) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * No need to print or return the output.
		 * Taking input and printing output is handled automatically.
		 */
		
        quickSort(input,0,input.length-1);
	}
	
}
