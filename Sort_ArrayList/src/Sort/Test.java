package Sort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Test 
{
  public static void main(String[] args) 
  {
	
	  Student s=new Student();
	  s.setRollno(1);
	  s.setName("siya");
	  s.setMarks(80);
	  
	  Student s1=new Student();
	  s1.setRollno(2);
	  s1.setName("nitya");
	  s1.setMarks(50);
	  
	  Student s2=new Student();
	  s2.setRollno(3);
	  s2.setName("Shreeja");
	  s2.setMarks(90);
	  
	  
	  List<Student> al=new ArrayList<>();
	  al.add(s);
	  al.add(s1);
	  al.add(s2);
	  
	  al.stream().Collectors((a1,a2)=>a2.getRollno-a1.getRollno());
	  al.stream().sorted().forEach(x->System.out.println(x));
	  al.stream().sorted((a1,a2)=>a2.getRollno()-a1.getRollno());
	
	  
}
}
