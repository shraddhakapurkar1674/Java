 import java.util.*;
 public class StringCountwithoutspace
 {
   public static void main(String args[])
   {
      String s="Java Programming";
	  int count=0;
	  int index=0;
     try
	 {	 
	 while(true)
	 {
	  char c=s.charAt(index);
	   if(c!=' ')
	   {
	   
	   count++;
	   }
	   index++;
	  }
	  }
	  catch(Exception e)
	  {
		  System.out.println(e);
	  }
	  System.out.println("Without space Count "+count);
	  System.out.println("withCount "+index);
	  
	  }
	}
	   
	 