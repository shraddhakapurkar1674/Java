import java.util.*;
public class ArrayListToVector
{
  public static void main(String args[])
  {  
    ArrayList a=new ArrayList();
	a.add(20);
	a.add(50);
	a.add(10);
	a.add(80);
	Vector v=new Vector(a);
	System.out.println(v);
	int i,j;
	for(i=0;i<v.size()-1;i++)
	{
		for(j=0;j<v.size()-i-1;j++)
		{
			int a1=(Integer)v.get(j);
			int b=(Integer)v.get(j+1);
			if(a1>b)
			{
				v.set(j,b);
				v.set(j+1,a1);
			}
		}
	}
	 System.out.println("Sorted vector in ascending");
	 System.out.println(v);
  }
}
			