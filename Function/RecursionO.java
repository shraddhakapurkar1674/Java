import java.util.*;
public class RecursionO
{
public static void main(String args[])
{
 int a;
 System.out.println("Enter value");
 Scanner sc=new Scanner(System.in);
 a=sc.nextInt();
 printNumber(a);
 }
 public static void printNumber(int x)
 {
   if(x>0)
   {
     
	  printNumber(x-1);
	  System.out.println(x);
	  }
	  }
	  }
	  