import java.util.*;
public class ArrayDelete
{
 public static void main(String args[])
 {
   int a[]=new int[5];
   int i,index;
   System.out.println("Enter array");
   Scanner sc=new Scanner(System.in);
    for(i=0;i<a.length;i++)
	{
	 a[i]=sc.nextInt();
	 }
	System.out.println("Enter elements you want to delete");
	index=sc.nextInt();
	 System.out.println("After removing");
	for(i=index;i<a.length-1;i++)
	{
     a[i]=a[i+1];
	 }
for(i=0;i<(a.length-1);i++)
{
System.out.println(a[i]);
}
	   }
	   }