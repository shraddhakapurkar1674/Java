import java.util.*;
public class MargeArrayList
{
 public static void main(String args[])
 {
   ArrayList a1=new ArrayList();
   ArrayList a2=new ArrayList();
   ArrayList a3=new ArrayList();
   a1.add(10);
   a1.add(20);
   a1.add(30);
   a1.add(40);
   a2.add(50);
   a2.add(60);
   a2.add(70);
   a2.add(80);   
  int i;
  for(i=0;i<a1.size();i++)
  {
     Object obj=a1.get(i);
	 if(!a3.contains(obj))
	 {
	    a3.add(obj);
		}
   }
   for(i=0;i<a2.size();i++)
  {
     Object obj=a2.get(i);
	 if(!a3.contains(obj))
	 {
	    a3.add(obj);
		}
   }
   System.out.println("Meraged  ArrayList without Dupllicate");
   System.out.println(a3);
   }
   }
		
  
  
   