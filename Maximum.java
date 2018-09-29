package array;

public class Maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] num={1,2,3,4,5,6,7,8};
      int max=0;
      int count=0;
      
      for(int i=0;i<num.length;i++)
      {
    	  if(max<num[i])
    	  {
    		  max=num[i];
    		  count=i;
    	  }
      }
      
  	System.out.println("maximum number is :"  +max); 
	System.out.println("position is :"  +count);
	
	}
	
	

}
