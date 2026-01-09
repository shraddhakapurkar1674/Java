import java.util.*;
public class ArrayEos
{
 public static void main(String args[])
 {
  int a[]=new int[5];
  int i,sum=0;
  System.out.println("Enter elments");
  Scanner sc=new Scanner(System.in);
  
   for(i=0;i<a.length;i++)
   {
    a[i]=sc.nextInt();
	}
	System.out.println("Sum of the even number present in array");
	for(i=0;i<a.length;i++)
	{
	  if(a[i]%2==0)
	  {
	    sum=sum+a[i];
		}
		}
		System.out.println(sum);
		System.out.println("Sum of odd number present in array");
		int sum1=0;
		for(i=0;i<a.length;i++)
		{
		  if(a[i]%2!=0)
		  {
		   sum1=sum1+a[i];
		   }
		   }
		   System.out.println(sum1);
		 }
	}