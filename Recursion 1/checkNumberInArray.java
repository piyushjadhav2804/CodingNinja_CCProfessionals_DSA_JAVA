public class Solution {
	
	public static boolean checkNumber(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
	
        if(input.length == 0)
            return false;
        
        if(input[0] == x)
            return true;
        
        int temp[] = new int[input.length-1];
        for(int i=1; i<temp.length; i++)
            temp[i-1] = input[i];
        
        return checkNumber(temp, x);
	}
}
