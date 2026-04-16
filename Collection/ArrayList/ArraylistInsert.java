import java.util.*;
public class ArraylistInsert
{
  public static void main(String args[])
  {
    ArrayList a=new ArrayList();
	a.add(10);
	a.add(20);
	a.add(30);
	a.add(40);
	System.out.println("Before add"+a);
	a.add(2,60);
	System.out.println("After Add"+a);
	}
}
	