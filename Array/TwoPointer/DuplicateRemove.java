import java.util.*;
public class DuplicateRemove
{
  public static void main(String args[])
  {
    int a[]=new int [5];
	int i,k,j;
	 j=0;
	System.out.println("Enter array");
	Scanner sc=new Scanner(System.in);
	for(i=0;i<a.length;i++)
	{
	 a[i]=sc.nextInt();
	 }
	 Arrays.sort(a);
	 
	 for(k=1;k<a.length;k++)
	 {
	  if(a[k]!=a[j])
	  {
		  j++;
	    a[j]=a[k];
		
		}
		}
		System.out.println("After remove");
		for(i=0;i<=j;i++)
		{
		  System.out.println(a[i]);
		  }
		  }
		  }
	 