package ArraysPrograms;

public class PrintMultiplicationFirst3MaximumNumber {

	public static void main(String[] args) {
     int[] a= {5,4,2,3,1};
     for(int i=0;i<a.length;i++)
     {
    	 for(int j=i+1;j<a.length;j++)
    	 {
    		 if(a[i]<a[j])
    		 {
    			int temp=a[i];
    			a[i]=a[j];
    			a[j]=temp;
    		 }
    	 }
    	 System.out.println(a[i]);
     }
     int mul=1;
     for(int i=0;i<3;i++)
     {
    	 mul=mul*a[i];
    	 
     }
     System.out.println("product of first 3 Maximum Numbers-->"+mul);
	}

}
