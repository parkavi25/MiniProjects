package array;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num={1,2,3,4,5};
		int total=0,avg=0;
		 for(int i=0;i<num.length;i++)
		 {
			 total=total+num[i];
			 
		 }
		 avg=total/num.length;
		 System.out.println("The total number is :" + total);
		 System.out.println("The average is :" + avg);
	}

}
