import java.util.*;
public class FunctionFactors
{
 public static void main(String args[])
 {
  int a;
  System.out.println("Enter number");
  Scanner sc=new Scanner(System.in);
  a=sc.nextInt();
  checkFactors(a);
  }
  public static void checkFactors(int a)
  {
	  int i;
    for(i=1;i<=a;i++)
	{
	 if(a%i==0)
	 {
	  System.out.println(i);
	  }
	  }
	  }
	  }