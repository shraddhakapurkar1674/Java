import java.util.*;
public class RemoveSpace
{
  public static void main(String args[])
  {
    String s;
	System.out.println("Enter any String ");
	Scanner sc=new Scanner(System.in);
	s=sc.nextLine();
	int i;
	for(i=0;i<s.length();i++)
	{
	  char c=s.charAt(i);
	  if(c!=' ')
	  {
	    System.out.print(c);
		}
	}
	}
	}