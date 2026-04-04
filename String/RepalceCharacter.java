import java.util.*;
public class RepalceCharacter
{
  public static void main(String args[])
  {
    String s;
   System.out.println("Enter String");
   Scanner sc=new Scanner(System.in);
   s=sc.nextLine();
   int i;
  String r="";
  char c;
  System.out.println("Enter character");
 
  c=sc.next().charAt(0);
  for(i=0;i<s.length();i++)
  {
   char c1=s.charAt(i);
   if(c1==c)
   {
     r=r+'o';
	 }
	 else{
		 r=r+c1;
	 }
	
	}
	System.out.println(r);
	}
	}