import java.util.*;
public class LeadingZerosReversePattern {

    public static void main(String[] args) {
        
	System.out.print("Enter a Number: ");
        byte i, j, n = new Scanner(System.in).nextByte();
        
        for(i=1; i<=n; i++){
            for(j=1; j<=n-i; j++){
                System.out.print(0+" ");
            }
            for(j=i; j>0; j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }
	}
}