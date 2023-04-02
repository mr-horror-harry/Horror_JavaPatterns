//Middle zeros Pattern - Enter a Number 

import java.util.*;

class MiddleZerosPattern{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
				System.out.print(i==n ? 1: j==1 || j==i ? 1:0);
			System.out.println();
		}
	}
}