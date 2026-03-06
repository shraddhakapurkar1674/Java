import java.util.*;
public class RecursionGcd
{
public static void main(String args[])
{
 int a,b,r;
 System.out.println("Enter number");
 Scanner sc=new Scanner(System.in);
 a=sc.nextInt();
 b=sc.nextInt();
 r=findGcd(a,b);
 System.out.println(r);
 }
 public static int findGcd(int x,int z)
 {
   if(z==0)
   {
   return x;
   }
   else
   {
   return findGcd(z,x%z);
   }
   }
   }
   