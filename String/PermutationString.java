import java.util.*;
public class PermutationString
{
public static void main(String args[])
{
  String s="ABCD";
  show(s,"");
  }
  public static void show(String s1,String s2)
  {
	  int i;
   if(s1.length()==0)
   {
     System.out.println(s2);
	 return;
	 }
	 for(i=0;i<s1.length();i++)
	 {
      char c=s1.charAt(i);
	   String re=s1.substring(0,i)+s1.substring(i+1);
	     show(re,s2+c);
		 }
		 }
		 }