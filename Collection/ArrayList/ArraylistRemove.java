import java.util.*;
public class ArraylistRemove
{
   public static void main(String args[])
   {
     ArrayList<Integer>a=new ArrayList<>();
	 a.add(10);
	 a.add(21);
	 a.add(11);
	 a.add(88);
	 a.add(89);
	 ListIterator<Integer> it=a.listIterator();
	 System.out.println("Before remove odd numbers"+a);
	
	 while(it.hasNext())
	 {
	      int val=it.next();
		  if(val%2!=0)
		  {
		    it.remove();
	  }
   }
    System.out.println("After remove all odd numbers"+a);
  }
}	  