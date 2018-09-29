package array;

public class Count_of_max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]={1,2,3,4,3,4};
		int max=0;
		int count=0;
		for(int i=0;i<num.length;i++)
		{
			if(max<num[i])
			{
				max=num[i];
				
			}
		}
System.out.println("maximum num is:" + max);

for(int i=0;i<num.length;i++)
{
	if(max==num[i])
	{
		count++;
		
	}
	
}
System.out.println("The count is :" + count);

	}

}
