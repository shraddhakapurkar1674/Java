import java.util.*;
public class ArraylistRotates
{
 public static void main(String args[])
   {
     ArrayList a=new ArrayList();
	 a.add(1);
	 a.add(2);
	 a.add(3);
     a.add(4);
     a.add(5);
	 int k,i;
	 System.out.println("Enter value of k");
	 Scanner sc=new Scanner(System.in);
	 k=sc.nextInt();
	 ArrayList a2=new ArrayList();
	 for(i=0;i<a.size();i++)
	 {
		 if(i>=k)
		 {  
	     a2.add(a.get(i));
	     }
	 }
	  for(i=0;i<a.size()-k-1;i++)
	 {
	   a2.add(a.get(i));
	  }
	System.out.println(a2);	 
	}
  }
	
		 
	   

	 
  