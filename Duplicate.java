package array;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[]={1,1,2,2,3,4,5,5,6};
		 
		for (int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				if (num[i]==num[j])
				{
					System.out.println("The duplicate numbers are :" + +num[i]);
				}
			}
		}
	}

}
