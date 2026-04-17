import java.util.*;
public class DuplicateWord
{
 public static void main(String args[])
 {
   String s="java is easy and Java is powerful";
  s=s.toLowerCase();
   int i,j;
   String s1[]=s.split(" ");
   for(i=0;i<s1.length;i++)
   {
   for(j=i+1;j<s1.length;j++)
   {
   	if(s1[i].equals(s1[j]))
	{
	   System.out.println(s1[i]);
	   }
	   }
	   }
	   }
	   }
   