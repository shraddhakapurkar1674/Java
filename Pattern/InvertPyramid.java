import java.util.*;
public class InvertPyramid
{  
 public static void main(String args[])
 {
   int i,j;
   boolean flag=true;
     for(i=1;i<=5;i++)
	 {
	   for(j=1;j<=5;j++)
	   {
	     if(j>=i)
		 {
		  System.out.print("*");
		 // flag=false;
		  }
		  else
		  {
		   System.out.print("");
		  // flag=true;
		   }
		   }
		   System.out.println(" ");
		   }
		   }
		   
		  }