import java.util.*;
public class AphabeticString
{
  public static void main(String args[])
  {
   String s="Banana,Apple,Mango,lemon";
   int i,j;
   String s1[]=s.split(",");
   for(i=0;i<s1.length;i++)
   {
    
       for(j=i+1;j<s1.length;j++)
	   {
	 
	    if((s1[i].compareToIgnoreCase(s1[j])>0))
		{
		   String temp=s1[i];
		   s1[i]=s1[j];
		   s1[j]=temp;
		   }
		   }
		}
		for(i=0;i<s1.length;i++)
		{
		 System.out.println(s1[i]);
		 }
		 }
		 }