import java.util.*;
public class SubSum
{
 public static void main(String args[])
 {
  int a[]=new int[9];
  int i,j,s,start,end,max;
  max=Integer.MIN_VALUE;
  s=0;
  start=0;
  end=0;
  System.out.println("enter array");
  Scanner sc=new Scanner(System.in);
  for(i=0;i<a.length;i++)
  {
  a[i]=sc.nextInt();
  }
  for(i=0;i<a.length;i++)
  {
  s=0;
   for(j=i;j<a.length;j++)
   {
    s=s+a[j];
	if(s>max)
	{
	 max=s;
	 start=i;
	 end=j;
	 }
	 }
	}
	System.out.println("max"+max);
	System.out.println("Max sum array is");
	for(i=start;i<=end;i++)
	{
	System.out.println(a[i]);
	}
	}
	}