package ArrayProgramsWithoutBubbleSort;

public class PrintFirstAndSecondMaximumNumberWOBBSort {

	public static void main(String[] args) {


	     int [] a= {5,1,4,9};
	     int fmax=a[0];
	     int smax=a[0];
	     for(int i=1;i<a.length;i++)
	     {
	    	 if(a[i]>fmax)
	    	 {
	    		 smax=fmax;
	    		fmax=a[i];
	    	 }
	    	 else if(a[i]>smax)
	    	 {
	    		 smax=a[i];
	    	 }
	     }
	     System.out.println("First Maximum Number is--> "+fmax);
	     System.out.println("Secons Maximum Number is -->"+smax);
	}

}
