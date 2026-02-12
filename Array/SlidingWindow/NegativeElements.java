import java.util.*;
public class NegativeElements
{
  public static void main(String args[])
  {
    int a[]=new int[8];
	System.out.println("Ente Array");
	Scanner sc=new Scanner(System.in);
	int i,j,k;
	for(i=0;i<a.length;i++)
	{
	  a[i]=sc.nextInt();
	}
	System.out.println("Enter value od K");
	k=sc.nextInt();
	for(i=0;i<=a.length-k;i++)
	{
		boolean found=false;
	  for(j=i;j<k+i;j++)
	  {
	    if(a[j]<0)
		{
		  System.out.println(a[j]);
		  found=true;
		  break;
		  }

			  
		 }
		 if(!found)
		  {
			  System.out.println(0);
		  }		
		 
	}
	  
	}
	}