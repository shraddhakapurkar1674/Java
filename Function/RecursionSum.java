import java.util.*;
public class RecursionSum
{
 public static void main(String args[])
 {
  int a,r;
   System.out.println("Enter value");
   Scanner sc=new Scanner(System.in);
   a=sc.nextInt();
   r=clacSum(a,0);
   System.out.println("Sum "+r);
   }
   public static int clacSum(int b,int s)
   { 
   if(b!=0)
   {
	    s=s+b;
		return clacSum(b-1,s);
   }
   else
   {
	    return s;
   }
   }
}