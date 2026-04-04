import java.util.*;
public class StringPalidrome
{
 public static void main(String args[])
 {
  String s;
   System.out.println("Enter String");
   Scanner sc=new Scanner(System.in);
   s=sc.nextLine();
   s=s.toLowerCase();
   int start,end,mid,i;
   boolean flag=true;
   start=0;
   mid=s.length()/2;
   end=s.length()-1;
   for(i=0;i<mid;i++)
   {
     char c=s.charAt(start);
	 char c1=s.charAt(end);
	 if(c!=c1)
	 {
	   flag=false;
	   break;
	   }
	   start++;
	   end--;
	   }
	 if(flag)
{
  System.out.println("String is plidrome");
}
else{
  System.out.println("String is not plidrome");
}
}
}
  
   