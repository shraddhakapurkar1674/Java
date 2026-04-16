import java.util.*;
public class ArraylistSearch
{
  public static void main(String args[])
  {
     ArrayList<Integer> a=new ArrayList<>();
	 int i,b,key;
	 System.out.println("Enter elements in array");
	 Scanner sc=new Scanner(System.in);
	 for(i=1;i<=5;i++)
	 {
		 b=sc.nextInt();
	   a.add(b);
	  }
	  
	  boolean flag=false;
	  System.out.println("Enter search key");
	  key=sc.nextInt();
		    if(a.contains(key))
			{
			   flag=true;
			 }
	   
	   if(flag)
	   {
	     System.out.println(key +" exists in the ArrayList");
		 }
		 else
		 {
		    System.out.println(key +" does not exits in ArrayList");
		  }
	}
  }		 
	  