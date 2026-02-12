import java.util.*;
public class SubArraymax
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
	int max=0;
	  for(i=0;i<=a.length-k;i++)
	  {
	    for(j=i;j<k+i;j++)
		{ 
		   if(a[j]>max)
		   {
		     max=a[j];
			 }
			 }
			 System.out.println(max);
	   }
	}
}