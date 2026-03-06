import java.util.*;
public class FunctionStrong
{
 public static void main(String args[])
 {
  int a;
  System.out.println("Enter number");
  Scanner sc=new Scanner(System.in);
  a=sc.nextInt();
  checkStrong(a);
  }
  public static void checkStrong(int a)
  {
  int r,b,sum,f;
  sum=0;
  b=a;
    while(a!=0)
	{
	 r=a%10;
	 a=a/10;
	 
	 f=1;
	 while(r!=0)
	 {
	  f=f*r;
	  r--;
	  }
	  sum=sum+f;
  }
	  if(sum==b)
	  {
	   System.out.println("Number is Strong ");
	   }
	   else
	   {
	   System.out.println("Number is not Strong");
	   }
}
	  }