import java.util.*;
public class ArrayMaxmin
{
  public static void main(String args[])
  {
    int a[]=new int[5];
	int i,min,max;
	System.out.println("Enter elements in array");
	 Scanner sc=new Scanner(System.in);
	 for(i=0;i<a.length;i++)
	 {
	 a[i]=sc.nextInt();
	 }
	 max=a[0];
	 for(i=0;i<a.length;i++)
	 {
	   if(a[i]>max)
	   {
	     max=a[i];
		 
		 }
		 }
		 System.out.println("Maximum "+max);
		 min=a[0];
		 for(i=0;i<a.length;i++)
		 {
		   if(a[i]<min)
		   {
		    min=a[i];
			}
			}
			System.out.println("Minimum "+min);
	}
	}
	 
	