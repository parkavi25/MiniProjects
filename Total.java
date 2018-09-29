package array;

public class Total {

	public static void main(String[] args) {
		int[] num={1,2,3,4,5};
		int total=0;
		for(int i=0;i<num.length;i++)
		{
			total=total+num[i];
			
		}
		System.out.print(" The total number is :" + total);
	}

}
