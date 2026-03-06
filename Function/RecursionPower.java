import java.util.*;
public class RecursionPower
{
 public static void main(String args[])
 {
  int x,z,r;
  System.out.println("Enter base and index");
  Scanner sc=new Scanner(System.in);
  x=sc.nextInt();
  z=sc.nextInt();
  r=findPower(x,z,1);
  System.out.println("Power"+r);
  }
  public static int findPower(int a,int b,int p)
  {
    if(b!=0)
	{
	   p=p*a;
	   return findPower(a,--b,p);
	   }
	   else
	   {
	   return p;
	   }
	  } 
}