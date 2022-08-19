
public class solution {

	public static int convertStringToInt(String input){
		// Write your code here
        
        if(input.length() <= 1)
            return input.charAt(0)-'0';
        
        int ans = (int)((input.charAt(0)-'0')*Math.pow(10,input.length()-1));
        
        return ans + convertStringToInt(input.substring(1));
	}
}
