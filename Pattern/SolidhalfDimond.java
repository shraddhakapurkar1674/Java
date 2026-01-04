import java.util.*;
public class SolidhalfDimond
{
  public static void main(String args[])
  {
    int i,j;
	for(i=1;i<=9;i++)
	{
	  for(j=1;j<=5;j++)
	  {
	     if((i>=j&&i<=5))
		 {
		  System.out.print("*");
		  }
		  else if(j>=i-4&&i>5){
			  System.out.print("*");
		  }
		  
	  }
		  System.out.println(" ");
		  }
		  }
		  }