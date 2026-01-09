import java.util.*;
public class InsertElement
{
 public static void main(String args[])
 {
  int a[]=new int[5];
  int i,index,value;
   System.out.println("Enter elements");
   Scanner sc=new Scanner(System.in);
   for(i=0;i<(a.length-1);i++)
   {
     a[i]=sc.nextInt();
    }
	 System.out.println("Enter array index and value");
	 index=sc.nextInt();
	 value=sc.nextInt();
	 for(i=(a.length-2);i>=index;i--)
	 {
	   a[i+1]=a[i];
	   }
	   a[index]=value;
	   System.out.println("After insert");
	   for(i=0;i<a.length;i++)
	   {
	    System.out.println(a[i]);
		}
		}
}