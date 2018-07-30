package programs;

public class Star1 {
	
        public static void main(String[] args) {
		
		for(int row=1;row<=3;row++)
		{
			for(int space=3;space>row;space--)
			{
				System.out.print(" ");
			}
			for(int col=1;col<=row;col++)
			{
				System.out.print("*");
				
			}
			for(int col1=1;col1<row;col1++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		}}



