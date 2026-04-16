import java.util.*;
public class ArraylistPalindrome
{
  public static void main(String args[])
  {
    ArrayList a=new ArrayList();
	int i,b;
	System.out.println("Enter values");
    Scanner sc=new Scanner(System.in);
	for(i=1;i<=5;i++)
	{
	  b=sc.nextInt();
	 a.add(b);
	 }
	 int mid=a.size()/2;
	 int left=0;
	 int right=a.size()-1;
	 boolean flag= true;
	 for(i=0;i<mid;i++)
	 {
	   if(a.get(right)!=a.get(left))
	   {
	    flag=false;
		break;
		}
		right--;
		left++;
	  }
	  if(flag)
	  {
	  System.out.println("ArrayList is palidrome");
	  }
	  else
	  {
	   System.out.println("ArrayList is not palidrome");
	   }
	   }
	   }
		
		
	    