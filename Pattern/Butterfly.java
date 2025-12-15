import java.util.*;
public class Butterfly
{
public static void main(String args[])
{

 int i,j;
  for(i=1;i<=10;i++)
  {
   for(j=1;j<=10;j++)
   { 
    if((i>=j||j>=11-i)&&(i<=6||j>=i))
	{
	 System.out.print("*");
	 }
	 else if(i>6&&j<5&&j<=11-i)
	 {
		 System.out.print("*");
	 }
	 else{
		  System.out.print(" ");
	 }
		 
	 }
	 System.out.println(" ");
	 }
	 }
	 }
	 