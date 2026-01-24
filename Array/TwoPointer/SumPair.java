import java.util.*;
public class SumPair
{
 public static void main(String args[])
 {
   int a[]=new int[5];
   int i,l,r,sum,target;
   boolean flag=false;
   l=0;
   r=a.length-1;
   System.out.println("Enter array");
   Scanner sc=new Scanner(System.in);
   for(i=0;i<a.length;i++)
  {
    a[i]=sc.nextInt();
   }
   
    System.out.println("Enter target");
    target=sc.nextInt();
    
    while(l<r)
   {
     sum=a[l]+a[r];
	 if(sum==target)
	 {
	   System.out.println("["+a[l]+" ,"+a[r]+"]");
	   flag=true;
	   break;
	   }
	  else if(sum<target)
	   {
	     l++;
		 }
	  else{
		 r--;
		 }
		 }
	  if(!flag)
		 {
			 System.out.println("Not found");
		 }
		 }
  }