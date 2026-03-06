
import java.util.*;
public class FunctionPrime
{
 public static void main(String args[])
 {
   int a,r;
   System.out.println("Enter number");
   Scanner sc=new Scanner(System.in);
   a=sc.nextInt();
   r=checkPrime(a);
   if(r==1)
   {
   System.out.println("number is prime");
   }
   else
   {
   System.out.println("Number is not prime");
   }
   
   }
   public static int checkPrime(int a)
   {
	   int i;
     if(a<2)
	 {
	   return 0;
	   }
	   for(i=2;i<=a/2;i++)
	   {
	    return 0;
		}
		return 1;
		}
		
		}