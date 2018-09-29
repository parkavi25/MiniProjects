package array;

public class Common_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={1,2,3,4,5,6};
		int b[]={5,6,4,7};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.println( "The common numbers :" + a[i]);
				}
			}
		}
	}

}
