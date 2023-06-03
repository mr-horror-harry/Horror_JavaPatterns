import java.util.Scanner;

class TriangleHyphenAsterik {
	public static void main(String args[]) {

		System.out.print("Enter a Number (<= 100):");

		byte n = new Scanner(System.in).nextByte();
		byte s = 1;

		while (n-- > 0)
			System.out.println("-".repeat(n) + "*".repeat(s) + "*".repeat(s++) + "-".repeat(n));
		// since byte can't exceed 128byte "*" repeat ==> 2 times
	}
}