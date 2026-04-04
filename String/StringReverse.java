import java.util.*;
public class StringReverse
{
  public static void main(String args[])
  {
   String s;
   System.out.println("Enter String");
   Scanner sc=new Scanner(System.in);
   s=sc.nextLine();
   String s1="";
   int i;
   for(i=s.length()-1;i>=0;i--)
   {
    s1=s1+s.charAt(i);
	}
	System.out.println(s1);
	}
	}
	 
	 
   