
public class solution {

    static int count=0;
    
	public static int countZerosRec(int input){
		// Write your code here
        
        if(input == 0)
            return 1;
        
        if(input>0) {
            
            if(input%10 == 0)
                count++;
            
            input /= 10;
        }
        
        countZerosRec(input);
        return count; 
	}
}
