import java.util.*;
public class SubarraysizeK
{
  public static void main(String args[])
  {
    int a[]=new int[6];
	System.out.println("Ente Array");
	Scanner sc=new Scanner(System.in);
	int i;
	for(i=0;i<a.length;i++)
	{
	  a[i]=sc.nextInt();
	}
	int k,sum;
	sum=0;
	System.out.println("Enter value od K");
	k=sc.nextInt();
	for(i=0;i<k;i++)
	{
	  sum=sum+a[i];
	}
	int max=sum;
	for(i=k;i<a.length;i++)
	{
	  sum=sum+a[i]-a[i-k];
	  if(sum>max)
	  {
	  max=sum;
	  }
	 }
	 System.out.println("Maxmimun sum "+max);
	 }
	 }