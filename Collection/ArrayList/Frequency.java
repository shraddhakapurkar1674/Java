import java.util.*;
public class Frequency
{
 public static void main(String args[])
 {
   ArrayList a1=new ArrayList();
   a1.add(10);
   a1.add(20);
   a1.add(10);
   a1.add(20);
   a1.add(30);
   a1.add(40);
   int i,j;
   System.out.println("Traversing ArrayList");
   for(i=0;i<a1.size();i++)
   {
     System.out.println(a1.get(i));
	 }
	 System.out.println("Counting");
	 ArrayList a2=new ArrayList();
	 for(i=0;i<a1.size();i++)
	 {
	   int n=(int)a1.get(i);
	   if(a2.contains(n))
	   {
	     continue;
		 }
		 int c=0;
		 for(j=0;j<a1.size();j++)
		 {
		  if((int)a1.get(j)==n)
		  {
		  c++;
		  }
		 }
		  a2.add(n);
		  System.out.println(n+" "+"occurs "+c);
		}
	 }
	 }
	   