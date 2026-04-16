import java.util.*;
public class ArraylistReverse
{
  public static void main(String args[])
  {
     ArrayList<Integer> a=new ArrayList<>();
	 int i,b;
	 System.out.println("Enter Values");
	 Scanner sc=new Scanner(System.in);
	 for(i=1;i<=5;i++)
	 {
	   b=sc.nextInt();
	   a.add(b);
	  }
	 // Collections.reverse(a);
	  //System.out.println("Reversed ArrayList "+a);
	  int n=a.size();
	  for(i=0;i<n/2;i++)
	  {
		  int temp=a.get(i);
		  a.set(i,a.get(n-1-i));
		  a.set(n-1-i,temp);
	  }
	  System.out.println("Reversed ArrayList "+a);
	  
  }
}
		
	   