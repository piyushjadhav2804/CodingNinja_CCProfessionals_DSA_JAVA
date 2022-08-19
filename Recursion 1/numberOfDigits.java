public class Solution {

    static int digit=0;
    
	public static int count(int n){
		//Write your code here
        
        if(n>0) {
            
            digit++;
            count(n/10);
        }
        
        return digit;
    }
}
