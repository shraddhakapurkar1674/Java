import java.util.*;
public class ArrraylistEvenOdd
{
public static void main(String args[])
{
  ArrayList a=new ArrayList();
  a.add(10);
  a.add(21);
  a.add(30);
  a.add(41);
  ArrayList a1=new ArrayList();
  ArrayList a2=new ArrayList();
  Iterator i=a.iterator();
  while(i.hasNext())
  {
     Object ob=i.next();
	   if((int)ob%2==0)
	   {
	     a1.add(ob);
		 }
		 else
		 {
			 a2.add(ob);
		 }
	}
	System.out.println("Even Number");
	System.out.println(a1);
	System.out.println("Odd Number");
	System.out.println(a2);
	}
	}