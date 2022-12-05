package ArraysPrograms;

public class BubbleSortDescendingOrder {

	public static void main(String[] args) {
		int[] a= {5,2,4,3,1};
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
		System.out.println("First Maximum Number in Array --> "+a[0]);
		System.out.println("Second Maximum Number in Array -->"+a[1]);
		
	}

}
