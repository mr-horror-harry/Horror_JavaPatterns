import java.util.Scanner;

class NNumTriangle{
	public static void main(String args[]){

		System.out.println("Enter No. of Rows to see the magix:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int val=1;
		
		for(int i=1; i<=n; i++){
			for(int j=1; j<=i; j++) System.out.print(val++ + " ");

			System.out.println();
		}	
	}
}