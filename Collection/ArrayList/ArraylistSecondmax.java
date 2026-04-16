import java.util.*;
public class ArraylistSecondmax
{
 public static void main(String args[])
 {
  ArrayList<Integer> a=new ArrayList<>();
   a.add(10);
   a.add(20);
   a.add(30);
	a.add(50);
	a.add(50);
	int max=Integer.MIN_VALUE;
	int smax=0;
	Iterator<Integer> it=a.iterator();
	while(it.hasNext())
	{
	  int val=it.next();
	  if(max<val)
	  {
	   smax=max;
	   max=val;
	   }
	 }
	 System.out.println("Second max"+smax);
	 System.out.println("Max "+max);
	 }
	 }
	
  