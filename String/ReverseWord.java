import java.util.*;
public class ReverseWord
{
 public static void main(String args[])
 {
   String s;
   System.out.println("Enter String");
   Scanner sc=new Scanner(System.in);
   s=sc.nextLine();
   String s1[]=s.split(" ");
   int i;
   for(i=s1.length-1;i>=0;i--)
   {
   System.out.print(s1[i]+" ");
   }
   }
  }
     