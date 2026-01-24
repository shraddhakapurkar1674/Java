import java.util.*;
public class ZeroRemove
{
 public static void main(String args[])
 {
   int a[]=new int[5];
   int i,j;
   j=0;
   System.out.println("Enter array");
   Scanner sc=new Scanner(System.in);
   for(i=0;i<a.length;i++)
   {
   a[i]=sc.nextInt();
   }
   for(i=0;i<a.length;i++)
   {
      if(a[i]!=0)
	  {
	   a[j]=a[i];
	   j++;
	   }		   
	 }
	 for(i=j;i<a.length;i++)
	 {
	   a[j]=0;
	   j++;
	   }
	   System.out.println("After shifting zero at last");
	   for(i=0;i<a.length;i++)
	   {
	     System.out.println(a[i]);
		 }
		 }
		 }
	 