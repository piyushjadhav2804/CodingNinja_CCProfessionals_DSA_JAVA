/******************
 * Following is the main function we are using internally.
 * Refer this for completing the ComplexNumbers class
 * 
 
 public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int real1 = s.nextInt();
		int imaginary1 = s.nextInt();

		int real2 = s.nextInt();
		int imaginary2 = s.nextInt();

		ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
		ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);

		int choice = s.nextInt();
		 
		if(choice == 1) {
			// Add
			c1.plus(c2);
			c1.print();
		}
		else if(choice == 2) {
			// Multiply
			c1.multiply(c2);
			c1.print();
		}
		else {
			return;
		}
	}
 ******************/

public class ComplexNumbers {
	// Complete this class
	
    int real;
    int imaginary;
    
    ComplexNumbers(int real, int imaginary) {
        
        this.real = real;
        this.imaginary = imaginary;
    }
    
    void print() {

        System.out.println(real + " + i" + imaginary);
    }
    
    void plus(ComplexNumbers obj) {
        
        this.real = this.real + obj.real;
        this.imaginary = this.imaginary + obj.imaginary;
    }
    
    void multiply(ComplexNumbers obj) {
        
        int treal = this.real;
        int timaginary = this.imaginary;
        
        this.real = (treal * obj.real) - (timaginary * obj.imaginary);
        this.imaginary = + (treal * obj.imaginary) + (timaginary * obj.real);
    }
}
