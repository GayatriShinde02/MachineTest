package evenodd;

public class Number 
{
   public static void main(String[] args) {
	
	   int [] number= {1,3,2,4,5};
	   int sum=0;
	   int odd=0;
	   for(int num:number)
	   {
		   if(num%2==0)
		   {
			   sum=num+sum;
			  
		   }
		  
		   else
		   {
			  odd=num+sum;
			  
		   }
	   }
	   System.out.println("Addition of even number:"+sum);
	   System.out.println("Addition of odd number:"+odd);
}
}
