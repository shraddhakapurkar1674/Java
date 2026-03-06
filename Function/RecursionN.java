import java.util.*;
public class RecursionN
{
 public static void main(String args[])
 {
  int a;
  System.out.println("Enter  value");
  Scanner sc=new Scanner(System.in);
  a=sc.nextInt();
  printSeries(a);
  }
  public static void printSeries(int x)
  {
    if(x>0)
	{
	   System.out.println(x);
	   printSeries(--x);
	   }
	   }
	  }
	   