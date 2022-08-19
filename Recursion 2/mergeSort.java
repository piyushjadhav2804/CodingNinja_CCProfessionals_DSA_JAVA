public class solution {

    public static void merge(int arr[], int arr1[], int arr2[]) {
        
        int i=0, j=0, k=0;
        
        while(i<arr1.length && j<arr2.length) {
            
            if(arr1[i] < arr2[j]) {
                
                arr[k++] = arr1[i++];
            }
            
            else {
                
                arr[k++] = arr2[j++];
            }
        }
        
        while(i < arr1.length) {
            
            arr[k++] = arr1[i++];
        }
        
        while(j < arr2.length) {
            
            arr[k++] = arr2[j++];
        }
    }
    
	public static void mergeSort(int[] input){
		// Write your code here
		
        if(input.length <= 1)
            return;
        
		int n = input.length;
        
        int mid = n/2;
        int i=0;
        
        int arr1[] = new int[mid];
        int arr2[] = new int[n-mid];
        
        for(i=0; i<arr1.length; i++) {
            
            arr1[i] = input[i];
        }
        
        for(i=arr1.length; i<input.length; i++) {
            
            arr2[i - arr1.length] = input[i];
        }
        
        mergeSort(arr1);
        mergeSort(arr2);
        
        merge(input, arr1, arr2);
	}
}
