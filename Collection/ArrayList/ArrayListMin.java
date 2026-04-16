import java.util.*;
public class ArrayListMin
{
  public static void main(String args[])
  {
    ArrayList<Integer> a=new ArrayList<>();
	 int i,b;
	 System.out.println("Enter elements in ArrayList");
	 Scanner sc=new Scanner(System.in);
	 for(i=1;i<=5;i++)
	 {
		b=sc.nextInt();
	   a.add(b);
	   }
	   Iterator<Integer> i1=a.iterator();
	   int min=Integer.MAX_VALUE;
	   int max=Integer.MIN_VALUE;
	   while(i1.hasNext())
	   {
	      int v=i1.next();
		  if(v<min)
		  {
		       min=v;
			}
			else if(v>max)
			{
				max=v;
			}
			}
			System.out.println("Min value "+min);
			System.out.println("Max value "+max);
			}
	}