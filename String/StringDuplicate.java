import java.util.*;
public class StringDuplicate
{
 public static void main(String args[])
 {
   String s="aabbccdd";
   int count,i;
   ArrayList a=new ArrayList();
   count=0;
   for(i=0;i<s.length();i++)
   {
       char c=s.charAt(i);
	   System.out.println(c);
	   if(!a.contains(c))
	   {
		   a.add(c);
	   }
	   }
	   System.out.println("After remove");
	   System.out.println(a);
	 }
	}