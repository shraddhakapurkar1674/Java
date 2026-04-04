import java.util.*;
public class WordCount
{
  public static void main(String args[])
  {
    String s;
   System.out.println("Enter String");
   Scanner sc=new Scanner(System.in);
   s=sc.nextLine();
   int i,count;
   count=1;
   if(s.length()==0)
   {
	   System.out.println("Empty String");
	   count=0;
   }
   for(i=0;i<s.length();i++)
   {
     char ch=s.charAt(i);
	 
	 if(ch==' ')
	 {
	 count++;
	 }
	 }
	 System.out.println("Total word in string " +count);
	 }
	 }