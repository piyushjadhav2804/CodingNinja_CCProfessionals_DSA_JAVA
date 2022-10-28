// Given a string, find and return all the possible permutations of the input string.
// Note : The order of permutations are not important.
// Sample Input :
// abc
// Sample Output :
// abc
// acb
// bac
// bca
// cab
// cba

public class solution {
	
	public static String[] permutationOfString(String input){
		// Write your code here
		
        if(input.length() == 0) {
            
            String output[] = {""};
            return output;
        }
        
        String smallOutput[] = permutationOfString(input.substring(1));
        
        String output[] = new String[smallOutput.length * input.length()];
        
        int k=0;
        
        for(int i=0; i<smallOutput.length; i++) {
            
            for(int j=0; j<=smallOutput[i].length(); j++) {
                
                output[k++] = smallOutput[i].substring(0,j) + input.charAt(0) + smallOutput[i].substring(j);
            }
        }
        
        return output;
	}
	
}
