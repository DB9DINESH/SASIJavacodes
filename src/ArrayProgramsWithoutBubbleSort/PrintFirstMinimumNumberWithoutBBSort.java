package ArrayProgramsWithoutBubbleSort;

public class PrintFirstMinimumNumberWithoutBBSort {

	public static void main(String[] args) {
     int[] a= {5,1,4,9};
     int fmin=a[0];
     for(int i=0; i<a.length;i++)
     {
    		 if(fmin>a[i])
    		 {
    		  fmin=a[i];
    		 }
    	
     }
     System.out.println(fmin);
	}

}
