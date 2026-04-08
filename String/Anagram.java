import java.util.*;
public class Anagram 
{
  public static void main(String args[])
  {
   String s,s1;
    System.out.println("Enter two String");
   Scanner sc=new Scanner(System.in);
   s=sc.nextLine();
   s1=sc.nextLine();
   char c[]=s.toCharArray();
   char c1[]=s1.toCharArray();
   Arrays.sort(c);
   Arrays.sort(c1);
	if(Arrays.equals(c,c1))
	{
	  System.out.println("String is anagram");
	  }
	  else{
	  System.out.println("String is  not anagram");
  }
  }
  }