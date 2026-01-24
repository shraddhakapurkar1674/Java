import java.util.*;
public class PairSum
{
 public static void main(String args[])
 
 {
   int a[]=new int[5];
   int i,sum,count,l,r,target;
   l=0;
   r=a.length-1;
   count=0;
   sum=0;
   System.out.println("Enter array");
   Scanner sc=new Scanner(System.in);
  
   
   for(i=0;i<a.length;i++)
   {
     a[i]=sc.nextInt();
	 }
	  System.out.println("Enter target");
   target=sc.nextInt();
   Arrays.sort(a);
	 while(l<r)
	 {
	 sum=a[l]+a[r];
	 if(sum==target)
	 {
	   count++;
	   i++;
	   r--;
	   }
	   else if(sum<target)
	   {
	    l++;
		}
		else{
		r--;
		}
		}
		System.out.println("Count"+count);
		}
		}
   