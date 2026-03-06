import java.util.*;
public class RecursionFact
{
 public static void main(String args[])
 {
 int a,r;
  System.out.println("Enter number");
   Scanner sc=new Scanner(System.in);
   a=sc.nextInt();
   r=findFact(a);
   System.out.println("Factorial "+r);
   }
   public static int findFact(int x)
   {
      if(x==0)
	  {
	    return 1;
		}
		return x*findFact(x-1);
		}
		}