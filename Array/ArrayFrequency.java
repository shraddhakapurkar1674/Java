import java.util.*;
public class ArrayFrequency
{
 public static void main(String args[])
 {
  int a[]=new int[7];
  int i,j, count;
  System.out.println("Enter Array");
  Scanner sc=new Scanner(System.in);
  for(i=0;i<a.length;i++)
  {
  a[i]=sc.nextInt();
  }
  for(i=0;i<a.length;i++)
  {
     if(a[i]!=0)
	 {
	    count=1;
		for(j=i+1;j<a.length;j++)
		{
		  if(a[i]==a[j])
		  {
		   a[j]=0;
		   count++;
		   }
		   }
		   System.out.println(a[i]+" occurs "+count);
		   }
		   }
		   }
		   }
		