import java.util.*;
public class RecursionFibonacci
{
 public static void main(String args[])
 {
  int a,r,i;
  System.out.println("Enter number");
  Scanner sc=new Scanner(System.in);
  a=sc.nextInt();
  for(i=0;i<a;i++)
  {
   System.out.println(clacFibonacci(i));
  }
  }
  public static int clacFibonacci(int x)
  {
    if(x<=1)
	{
		return x;
	}
	return clacFibonacci(x-	1)+clacFibonacci(x-2);
	
	}
}