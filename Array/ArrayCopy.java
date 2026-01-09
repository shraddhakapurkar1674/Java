import java.util.*;
public class ArrayCopy
{
 public static void main(String args[])
 {
  int a[]=new int[5];
  int b[]=new int[a.length];
  int i;
  System.out.println("Enter arrya");
  Scanner sc=new Scanner(System.in);
  for(i=0;i<a.length;i++)
  {
  a[i]=sc.nextInt();
  }
  System.out.println("copied array");
  for(i=0;i<b.length;i++)
  {
    b[i]=a[i];
	System.out.println(b[i]);
	}
	}
	}