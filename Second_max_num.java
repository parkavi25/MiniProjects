package array;

public class Second_max_num {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]={35,22,24,28,38,40,50,5,6};
		int max=0;
		int maxi=0;
		for(int i=0;i<num.length;i++)
		{
			if(max<num[i])
			{
				maxi=max;
				max=num[i];	
			}
			else if(maxi<num[i])
			{
				maxi=num[i];	
			}

		}
		System.out.println("maximum num is :" + max);
	
		
		System.out.println("second maximum is :" +maxi);
}

}



