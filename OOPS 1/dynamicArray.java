class DynamicArray {
    
    private int arr[];
    private int nextEle = 0;

    DynamicArray() {
        arr = new int[5];
    }

    public int size() {
        return nextEle;
    }

    public boolean isEmpty() {
        return nextEle==0;
    }

    public int get(int i) {
        
        if(i>=nextEle) {    
            System.out.println("Invalid Index");
            return -1;
        }

        return arr[i];
    }

    public void set(int i, int val) {
        arr[i] = val;
    }

    public void add(int val) {

       if(nextEle == arr.length) {
           doubleCapacity();
       }
       
       arr[nextEle] = val;
       nextEle++;
    }

    private void doubleCapacity() {

        int temp[] = arr;
        arr = new int[2 * temp.length];

        for(int i=0; i<temp.length; i++) {
            arr[i] = temp[i];
        }
    }

    public int removeLast() {

        int temp = arr[nextEle-1];
        nextEle--;
        return temp;  
    }

    public void removeFirst() {

        for(int i=0; i<nextEle; i++) {
            arr[i] = arr[i+1];
        }
        nextEle--;
    }

    public void removeAny(int pos) {

        for(int i=pos; i<nextEle; i++) {
            arr[i] = arr[i+1];
        }

        nextEle--;
    }

    public void printArray() {

        for(int i=0; i<nextEle; i++) {
            System.out.print(arr[i] +" ");
        }

        System.out.println();
    }

    private void addBetween(int pos, int j, int val) {

        for(int i=j; i>pos; i--) {
            arr[i] = arr[i-1];
        }

        arr[pos] = val;
        nextEle++;
    }

    private void addstarting(int val) {

        System.out.println("inside");
        for(int i=nextEle; i>0; i--) {
            arr[i] = arr[i-1];
        }

        arr[0] = val;
        nextEle++;
    }

    public void addAnyPosition(int i, int val) {

        if(isEmpty() && i==0) {
            add(val);
        }        

        else if(nextEle < arr.length) {
                addBetween(i, nextEle, val);
        }

        else {
            doubleCapacity();
            addBetween(i, nextEle, val);
        }
    }

    public void addFront(int val) {
        
        if(nextEle < arr.length) {
            addstarting(val);
        }

        else {
            doubleCapacity();
            addstarting(val);
        }
    } 

}

class MainDynamic {

    public static void main(String[] args) {
        
        DynamicArray d = new DynamicArray();

        d.add(1);
        d.add(2);
        d.add(3);
        d.add(4);
        d.add(5);
        System.out.println("size = " + d.size());
        d.printArray(); 
        d.addAnyPosition(0,50);
        d.printArray();
        //d.addFront(20);
        System.out.println("size = " + d.size());
        d.removeFirst();
        d.printArray();
        d.removeAny(2);
        d.printArray();
    }
}
