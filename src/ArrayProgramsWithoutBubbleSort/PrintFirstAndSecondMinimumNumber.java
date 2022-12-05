package ArrayProgramsWithoutBubbleSort;

public class PrintFirstAndSecondMinimumNumber {

	public static void main(String[] args) {
     int [] a= {5,1,4,9};
     int fmin=a[0];
     int smin=a[0];
     for(int i=1;i<a.length;i++)
     {
    	 if(fmin>a[i])
    	 {
    		 smin=fmin;
    		fmin=a[i];
    	 }
    	 else if(smin>a[i])
    	 {
    		 smin=a[i];
    	 }
     }
     System.out.println("First Minimum Number is--> "+fmin);
     System.out.println("Secons Minimum Number is -->"+smin);
	}

}
