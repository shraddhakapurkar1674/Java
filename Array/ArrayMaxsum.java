import java.util.*;
 public class ArrayMaxsum
 {
  public static void main(String args[])
  {
   int a[]=new int[9];
   int i;
    System.out.println("Enter array");
	Scanner sc=new Scanner(System.in);
	for(i=0;i<a.length;i++)
	{
	 a[i]=sc.nextInt();
	 }
	 int k,sum,max;
	 max=Integer.MIN_VALUE;
	 k=4;
	 sum=0;
	 for(i=0;i<=k;i++)
	 {
	  sum=sum+a[i];
	  }
	  for(i=k;i<a.length;i++)
	  {
	    sum=sum+a[i]-a[i-k];
		if(sum>max)
		{
		max=sum;
		}
		
		}
		System.out.println("sum"+max);
	}
}	