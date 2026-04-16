import java.util.*;
public class ArrayListRemoveEven
{
  public static void main(String args[])
  {
    ArrayList<Integer> a=new ArrayList<>();
	int i,b;
	System.out.println("Enter elements in arraylist");
	Scanner sc=new Scanner(System.in);
	for(i=0;i<5;i++)
	{
	  b=sc.nextInt();
	  a.add(b);
	}
	ArrayList a2=new ArrayList();
	ListIterator<Integer> l= a.listIterator();
	while(l.hasNext())
	{
	  int value=l.next();
	  if(value%2==0)
	  {
	    l.remove();
	  }
	  }
	  System.out.println("After remove even numbers "+a);
	  }
	  }
	  
	  
	