import java.util.*;
public class ArrayPalidrome
{
  public static void main(String args[] )
  {
     int a[]=new int[5];
	 int i;
	 System.out.println("Enter elements");
	 Scanner sc=new Scanner(System.in);
	 for(i=0;i<a.length;i++)
	 {
	  a[i]=sc.nextInt();
	  }
	  boolean flag=true;
	  int right=a.length-1;
	  for(i=0;i<right;i++)
	  {
	     if(a[i]!=a[right])
		 {
		   flag=false;
		   }
		   right--;
	    }
	  if(flag==true)
	   {
                System.out.println("Array is palidrome");
	   }
	  else
           {
               System.out.println("Array is not palidrome");
           }
  }
			
}
		   