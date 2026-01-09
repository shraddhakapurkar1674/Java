import java.util.*;
 public class ArrayPosition
 {
  public static void main(String args[])
  {
    int a[]=new int[5];
	int i;
	System.out.println("Enter elements in array");
	 Scanner sc=new Scanner(System.in);
	 for(i=0;i<a.length;i++)
	 {
	  a[i]=sc.nextInt();
	  }

      System.out.println("Even position");
	   for(i=0;i<a.length;i++)
	   {
	      if(i%2==0)
		  {
		    System.out.println(a[i]);
			}
			}
	}
 }