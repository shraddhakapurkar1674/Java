import java.util.*;
public class RecursionPalidrome
{
public static void main(String args[])
{
int a,r;
System.out.println("Enter number");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
r=clacPalidrome(a,0);
 if(r==a)
  {
    System.out.println("Number is palidrome");
	}
	else
	{
	System.out.println("Number is not palidrome");
	}
	
}
public static int clacPalidrome(int x,int re)
{
int c;
c=x;
 if(x!=0)
{
  int r;
  r=x%10;
  re=re*10+r;
  x=x/10;
  return clacPalidrome(x,re);
  
  }
  else{
	  return re;
  }
}
 }
  