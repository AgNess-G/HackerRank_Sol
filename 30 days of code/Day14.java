class Difference {
  	private int[] elements;
  	public int maximumDifference;

	// Add your code here
    Difference(int elements[]){
        this.elements=elements;
    }
    void computeDifference(){
        int l=101,h=0;
        for(int i=0;i<elements.length;i++){
            if(l>elements[i]) l=elements[i];
            if(h<elements[i]) h=elements[i];
        }
        if(h-l > 0) maximumDifference= h-l;
        else maximumDifference = l-h;
    }

} // End of Difference class
