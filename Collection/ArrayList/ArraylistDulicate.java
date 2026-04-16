import java.util.*;
public class ArraylistDulicate
{
  public static void main(String args[])
  {
    ArrayList<Integer> a=new ArrayList();
	int i,j,b;
	System.out.println("Enter value");
	Scanner sc=new Scanner(System.in);
	for(i=1;i<=5;i++)
	{  
	  b=sc.nextInt();
	  a.add(b);
    }
	HashSet<Integer> a1=new HashSet<>();
	for(i=0;i<a.size();i++)
	{
	  for(j=i+1;j<a.size();j++)
	  {
	     if(a.get(i).equals(a.get(j)))
		 {
		   a1.add(a.get(i));
		   
		   break;
		   }
		}
   }
   System.out.println(a1);
   }
}   
	
	  
	
	