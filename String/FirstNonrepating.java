import java.util.*;
public class FirstNonrepating
{
 public static void main(String args[])
 {
   String s;
   System.out.println("Enter String");
   Scanner sc=new Scanner(System.in);
   s=sc.nextLine();
   int count;
    
   int i,j;
   
   for(i=0;i<s.length();i++)
   {
   count=0;
    char c=s.charAt(i);
   for(j=0;j<s.length();j++)
   {
      if(s.charAt(j)==c)
	  {
	    count++;
		}
  }
   if(count==1)
   {
     System.out.println("First Non repating character is " +c);
	 break;
   }
		}
		}
		}