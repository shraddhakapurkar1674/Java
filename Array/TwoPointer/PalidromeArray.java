import java.util.*;
public class PalidromeArray
{
  public static void main(String args[])
  {
    int a[]=new int[5];
	int i,l,r,mid;
	boolean flag=false;
	System.out.println("Enter array");
	Scanner sc=new Scanner(System.in);
	for(i=0;i<a.length;i++)
	{
	 a[i]=sc.nextInt();
	 }
	 l=0;
	 r=a.length-1;
	 mid=a.length/2;
	 for(i=0;i<mid;i++)
	 {
	 if(a[l]==a[r])
	 {
	   flag=true;
	   l++;
	   r--;
	   }
	   else
	   {
	   flag=false;
	   }
	   }
	   if(flag)
	   {
		   System.out.println("Array is palidrome");
	   }
	   else
	   {
		   System.out.println("Array is not palidrome");
	   }
	  }
}  