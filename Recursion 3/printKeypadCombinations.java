// Given an integer n, using phone keypad find out and print all the possible strings that can be made using digits of input n.
// Note : The order of strings are not important. Just print different strings in new lines.
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
    
	public static void printKeypad(int input){
		// Write your code here
		
        printKeypad(input, "");
	}
    
    public static void printKeypad(int input, String soFar) {
        
        if(input == 0) {
            
            System.out.println(soFar);
            return;
        }
        
        int lastDigit = input%10;
        String options = getOptions(lastDigit);
        
        for(int i=0; i<options.length(); i++) {
            
            printKeypad(input/10, options.charAt(i) + soFar);
        }
    }
}
