// Given an integer n, using phone keypad find out all the possible strings that can be made using digits of input n.
// Return empty string for numbers 0 and 1.
// Note : 1. The order of strings are not important.
// 2. Input and output has already been managed for you. You just have to populate the output array and return the count of elements populated in the output array.
// Input Format :
// Integer n
// Output Format :
// All possible strings in different lines
// Constraints :
// 1 <= n <= 10^6
// Sample Input:
// 23
// Sample Output:
// ad
// ae
// af
// bd
// be
// bf
// cd
// ce
// cf

public class solution {

    public static String getOptions(int num) {

        if(num == 2)
            return "abc";
        
        if(num == 3)
            return "def";
            
        if(num == 4)
            return "ghi";
        
        if(num == 5)	
            return "jkl";
         	
        if(num == 6)
            return "mno";
         	
        if(num == 7)
            return "pqrs";
         	
        if(num == 8)
            return "tuv";
			
        if(num == 9)
            return "wxyz";
        
        return "";
    }
    
	// Return a string array that contains all the possible strings
	public static String[] keypad(int input){
		// Write your code here

        if(input == 0) {
            
            String[] output = new String[1];
            output[0] = "";
            return output;
        }
        
        String smallOutput[] = keypad(input/10);
        int lastDigit = input%10;
        
        String lastDigitOptions = getOptions(lastDigit);
        
        String[] output = new String [smallOutput.length * lastDigitOptions.length()];
        
        int K=0;
        
        for(int i=0; i<smallOutput.length;i++) {
            
            for(int j=0; j<lastDigitOptions.length();j++) {
                output[K] = smallOutput[i] + lastDigitOptions.charAt(j);
                K++;
            }
        }
        return output;
        }
	}
	

