
public class solution {

    static int i=1;
	public static int multiplyTwoIntegers(int m, int n){
		// Write your code here
        
        if(n <= 1)
            return m;
        
        return m * multiplyTwoIntegers(m, n-1);
	
	}
}
