import java.util.*;
public class SubarrayAvrage
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
	int sum=0;
	System.out.println("Enter value of K");
	k=sc.nextInt();
	for(i=0;i<k;i++)
	{
	  sum=sum+a[i];
	  }
	  System.out.println((float)sum/k);
	  for(i=k;i<a.length;i++)
	  {
	     sum=sum+a[i]-a[i-k];
		 System.out.println((float)sum/k);
		 }
    }
	}

	  