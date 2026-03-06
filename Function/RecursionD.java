import java.util.*;
public class RecursionD
{
 public static void main(String args[])
 {
  int a,r;
  System.out.println("Enter number");
  Scanner sc=new Scanner(System.in);
  a=sc.nextInt();
  r=calcSum(a,0);
  System.out.println(r);
  }
  public static int calcSum(int x,int s)
  {
	 
   if(x!=0)
   {
   int r;
   r=x%10;
   //re=re*10+r;
   x=x/10;
   s=s+r;
   return calcSum(x,s);
   
   }
   else
   {
	   return s;
   
   }
  }
}
   
     