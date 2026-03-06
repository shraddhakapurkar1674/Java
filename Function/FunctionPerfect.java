import java.util.*;
public class FunctionPerfect
{
  public static void main(String args[])
  {
   int a;
    System.out.println("Enter number");
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	checkPerfect(a);
	}
	public static void checkPerfect(int a)
	{
	   int i,sum,b;
	   b=a;
	   sum=0;
	   for(i=1;i<a;i++)
	   {
	     if(a%i==0)
		 {
		  sum=sum+i;
		  }
		  }
		  if(sum==b)
		  {
		   System.out.println("Number is Perfect");
		   }
		   else
		   {
		    System.out.println("Number is not perfect");
			}
			}
			}
			