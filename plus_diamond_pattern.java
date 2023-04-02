// n Plus-Diamond Pattern

import java.util.Scanner;

class PlusDiamond{

	static void repPrint(String s, int n){
		while(n-->0){
			System.out.print(s);
		}
	}
	
	public static void main(String args[]){

		System.out.println("Enter a no to see the Magix:");

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(), i, sp=n-1;

		for(i=1; i<=n; ){
			repPrint(" ", sp--);
			repPrint("*", i);
			System.out.print(" ");
			repPrint("*", i++);
		
			System.out.println();
		}
		System.out.println();
		
		for(i=i-1; i>=1; ){
			repPrint(" ",++sp);
			repPrint("*", i);
			System.out.print(" ");
			repPrint("*", i--);

			System.out.println();
		}		
	}
}