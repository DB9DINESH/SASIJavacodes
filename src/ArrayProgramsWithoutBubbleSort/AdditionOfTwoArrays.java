package ArrayProgramsWithoutBubbleSort;

public class AdditionOfTwoArrays {

	public static void main(String[] args) {

		int[] a= {5,3,4,3,6};
		int[] b= {2,1,3,4,9,8};
		int length=a.length;
		if(a.length<b.length)
		{
			length=b.length;
		}
		for(int i=0;i<length;i++)
		{
			try {
				System.out.println(a[i]+b[i]);
			} catch (Exception e) {
				if(a.length<b.length)
				{
					System.out.println(b[i]);
				}
				else
				{
					System.out.println(a[i]);
				}
			}
		}
	}

}
