package Exception;

import java.util.Scanner;

public class Test 
{
  public static void main(String[] args) {
	
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter age:");
	  int age=sc.nextInt();
	  System.out.println("Enter weight:");
	  int weight=sc.nextInt();
	  
	  if(age>21 && age<60)
	  {
		  if(weight>40 && weight<70)
		  {
			  System.out.println("valid age and weight");
		  }
		  else
		  {
			  System.out.println("Invalid weight");
		  }
	  }
	  else
	  {
		  throw new InvalidDonarException("Invalid donor exception");
	  }
}
}
