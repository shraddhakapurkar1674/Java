import java.util.*;
 public class ArrayReverse
 {
  public static void main(String args[])
  {
   int a[]=new int[5];
   int i,t;
   System.out.println("Enter elments in array");
    Scanner sc=new Scanner(System.in);
	 for(i=0;i<a.length;i++)
	 {
	   a[i]=sc.nextInt();
	   }
	   System.out.println("Reverse Array");
	   int end,mid;
	   end=a.length-1;
	   mid=a.length/2;
	   for(i=0;i<mid;i++)
	   {
	     t=a[i];
		 a[i]=a[end];
		 a[end]=t;
		 end--;
		 }
		 for(i=0;i<a.length;i++)
		 {
		  System.out.println(a[i]);
		  }
		  }
		  }