import java.util.*;
public class CountCharacter
{
 public static void main(String args[])
 {
   System.out.println("Enter String");
   Scanner sc=new Scanner(System.in);
   String s;
   
   s=sc.nextLine();
   int a[]=new int[256];
   int i;
   for(i=0;i<256;i++)
   {
     a[i]=-1;
	 }
	 int start=0;
	 int max=0;
	 for(i=0;i<s.length();i++)
	 {
	   char ch=s.charAt(i);
	   if(a[ch]>=start)
	   {
	    start=a[ch]+1;
		}
		a[ch]=i;
		int l=i-start+1;
		if(l>max)
		{
		max=l;
		}
		}
		System.out.println(max);
		}
	}