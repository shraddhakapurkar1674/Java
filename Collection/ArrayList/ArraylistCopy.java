import java.util.*;
public class ArraylistCopy
{
  public static void main(String args[])
  {
    ArrayList <Integer> a=new ArrayList<>();
	int i,b;
	System.out.println("Enter values");
	Scanner sc=new Scanner(System.in);
	for(i=1;i<=5;i++)
	{
	  b=sc.nextInt();
	  a.add(b);
	  }
	// ArrayList a2=new ArrayList(a);
     //System.out.println("After copy"+a2);
	 ArrayList a2=new ArrayList();
	 for(i=0;i<a.size();i++)
	 {
		 a2.add(a.get(i));
	 }
	 System.out.println("After copy"+a2);
   }
}	 
	  
