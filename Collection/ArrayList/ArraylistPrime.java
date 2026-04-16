import java.util.*;
public class ArraylistPrime
{
  public static void main(String args[])
  {
    ArrayList<Integer> a=new ArrayList<>();
	int i,b,count;
	count=0;
	System.out.println("Enter values");
	Scanner sc=new Scanner(System.in);
	for(i=1;i<=5;i++)
	{
	  b=sc.nextInt();
	  a.add(b);
	 }
	 ArrayList<Integer> a2=new ArrayList<>();
	 Iterator <Integer>it=a.iterator();
	 while(it.hasNext())
	 {
		 int val=it.next();
		 boolean flag=true;
	 if(val<2)
	 {
	  flag=false;
	  
	  }
	  else
	  {
	    for(i=2;i<val-1;i++)
		{
		   if(val%i==0)
		   {
			 flag=false;
			 break;
			 }
	    }
		if(flag)
		{
			a2.add(val);
			count++;
		}
	   }
	}
	System.out.println(a2);
	System.out.println("Count "+count);
  }
}
	  