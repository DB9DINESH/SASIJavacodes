package ArrayProgramsWithoutBubbleSort;

public class PrintFirstMaximumWOBBSort {

	public static void main(String[] args) {
     int [] a= {5,1,4,9};
     int fmax=a[0];
     for(int i=0;i<a.length;i++)
     {
    	 if(fmax<a[i])
    	 {
    		 fmax=a[i];
    	 }
     }
     System.out.println("First Maximum Number--> "+fmax);
	}

}
