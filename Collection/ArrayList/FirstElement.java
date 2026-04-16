import java.util.*;
 public class FirstElement
 {
   public static void main(String args[])
   {
     ArrayList a=new ArrayList();
	int i,b,count,j;
	System.out.println("Enter values");
    Scanner sc=new Scanner(System.in);
	for(i=1;i<=6;i++)
	{
	  b=sc.nextInt();
	 a.add(b);
	 }
     for(i=0;i<a.size();i++)
	 {
		  count=1;
	   for(j=i+1;j<a.size();j++)
	   {
	      if(a.get(i)==a.get(j))
		  {
		     count++;
			 }
			 }
			if(count==1)
			 {
			 System.out.println("The first element with count 1  "+a.get(i));
			  break;
			 
			 }
	     }
		}
	}