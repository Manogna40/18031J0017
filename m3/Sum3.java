<<<<<<< HEAD
package m3;

import java.util.Scanner;

public class Sum3 {

	public static void main(String[] args) {Scanner sc = new Scanner(System.in);
	int count=0;
	int i=0,j,k,l;
	System.out.println("enter size");
	int n=sc.nextInt();
int  q[]=new int[n];

		while(sc.hasNext() ) {
			 q[i] =  sc.nextInt();
			 i++;
		}
		for(j=0;j<q.length;j++)
		{
			for(k=(j+1);k<q.length;k++)
			{
				for(l=(k+1);l<q.length;l++)
				{
					if(q[j]+q[k]+q[l]==0)
					{
						count++;
						break;
					}
				}
			}
		}
		System.out.println(count);
	}
	

}
=======
package m3;

import java.util.Arrays;
import java.util.Scanner;

public class Sum3 {

	public static void main(String[] args) {Scanner sc = new Scanner(System.in);
	int count=0;
	int i=0,j,k,l,k1=0,sum;
	System.out.println("enter size");
	int n=sc.nextInt();
int  q[]=new int[n];

		while(sc.hasNext() ) {
			 q[i] =  sc.nextInt();
			 i++;
		}
		Arrays.sort(q);
		for(j=0;j<q.length;j++)
		{
			for(k=(j+1);k<q.length;k++)
			{
				 sum=q[j]+q[k];
				 k1 = Arrays.binarySearch(q, -sum);
				if(k1>0)
				{
	            if(sum+q[k1]==0)
	           	{count++;
					}
				}
			}
		}
		System.out.println(count);
	}
	

}
>>>>>>> f0781cc8fff40f6bcd6da6596c552137dd5954ff
