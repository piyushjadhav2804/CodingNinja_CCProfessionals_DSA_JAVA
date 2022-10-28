// Given a string, find and print all the possible permutations of the input string.
// Note : The order of permutations are not important. Just print them in different lines.
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

	public static void permutations(String input){
		// Write your code here

        permutations(input, "");
	}
    
    static void permutations(String input, String sofar) {
        
        if(input.length() == 0) {
            
            System.out.println(sofar);
            return;
        }
        
        for(int i=0; i<input.length(); i++){
            String str = input.substring(0,i) + input.substring(i+1,input.length());    
            permutations(str , sofar + input.charAt(i));
        }
    }
}
