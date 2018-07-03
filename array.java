import java.util.ArrayList;
 class dynamic<T> {

	    Object[] data = new Object[3];
	    int node = 0;
	    int currentSize = 3;
		
		
		
		public static void main(String[] sargs) {
		
	        dynamic<Integer> arr1 = new dynamic<Integer>();

	        arr1.add(new Integer(100));
	        arr1.add(new Integer(200));
	        arr1.add(new Integer(300));
	        arr1.add(new Integer(400));
	        arr1.add(new Integer(500));
	        arr1.add(new Integer(600));
			arr1.add(new Integer(1000));
			arr1.add(new Integer(9000));
			arr1.add(new Integer(500));
			arr1.add(new Integer(1900));
		}

	    public Object get(int index) {
	        return data[index];
	    }

	    public void add(Object value) {
	        if (this.currentSize == this.node) {
	            reinitializeArray();
	        }
	        this.data[node] = value;
	        node++;
	        System.out.println( value + " at position  " + (this.node - 1));
	    }

	    public void set(int index, Object value) {
	        this.data[index] = value;
	    }

	    public void reinitializeArray() {
	        System.out.println("\nReinitializing Array with size " + (currentSize * 2));
	        Object[] temp = new Object[currentSize * 2];
	        currentSize *= 2;
	        for (int i = 0; i < node; i++) {
	            temp[i] = this.data[i];
	        }
	        this.data = temp;
			
			
	    }

	    public Object getCurrentNode() {
	        return node;
	    }

	    public Object getCurrentSize() {
	        return currentSize;
	    }

	    

	}
