import java.util.*;
public class RemoveEven
{
 public static void main(String args[])
 {
  int i;
  int a[]=new int[5];
  System.out.println("Enter array");
  Scanner sc=new Scanner(System.in);
  for(i=0;i<a.length;i++)
  {
    a[i]=sc.nextInt();
  }
   ArrayList a1=new ArrayList();
   for(i=0;i<a.length;i++)
   {
    a1.add(a[i]);
	}
	Iterator it=a1.iterator();
	while(it.hasNext())
	{
	  Integer obj=(Integer)it.next();
	  if(obj%2==0)
	  {
	     it.remove();
		 }
	}
	System.out.println("After remove");
	System.out.println(a1);
	}
	}
   
	