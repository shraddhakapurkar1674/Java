import java.util.*;
public class FunctionArmstrong
{
 public static void main(String args[])
 {
	 int a;
   System.out.println("Enter number");
   Scanner sc=new Scanner(System.in);
   a=sc.nextInt();
   checkArmstrong(a);
   }
   public static void checkArmstrong(int a)
   {
    int b,sum,r;
	sum=0;
	b=a;
	while(a!=0)
	{
	 r=a%10;
	 sum=sum+(r*r*r);
	 a=a/10;
	 }
	 if(sum==b)
	{
	  System.out.println("Number is Armstrong");
	  }
	  else
	  {
	   System.out.println("Number is not armstrong");
	   }
	   }
	   }
    