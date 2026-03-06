import java.util.*;
public class FunctionNumbercount
{
public static void main(String args[])
{
 int a;
  System.out.println("Enter number");
  Scanner sc=new Scanner(System.in);
  a=sc.nextInt();
  findCount(a);
  }
  public static void findCount(int a)
  {
   int i,count,r;
   count=0;
   while(a!=0)
   {
    r=a%10;
	a=a/10;
	count++;
	}
	System.out.println(count);
	}
	}
