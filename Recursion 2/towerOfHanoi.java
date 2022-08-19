
public class solution {

	public static void towerOfHanoi(int disks, char source, char auxiliary, char destination) {
		// Write your code here

        if (disks==1)
            System.out.println(source+" "+destination);
        
        else if (disks==0)
            System.out.println("");
        
        else {
            
            //Move (n-1) disks from source (s) to helper (h) through destination (d)
            towerOfHanoi(disks-1,source,destination,auxiliary);
            
            //Move the nth (largest) disk from source (s) to destination (d)
            System.out.println(source+" "+destination);
            
            //Move the (n-1) disks from helper (h) to destination (d) through source (s)
        	towerOfHanoi(disks-1,auxiliary,source,destination);
        }
	}
}
