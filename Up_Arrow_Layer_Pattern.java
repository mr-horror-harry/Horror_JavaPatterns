import java.util.Scanner;
public class UpArrowLayerPattern {

    public static void main(String[] args) {
        
	System.out.print("Enter a Number: ");
        int n = new Scanner(System.in).nextInt();
        
        int d = n-1, ct, i ,j;
        
        for(i=1; i<=n; i++){
            System.out.print("- ".repeat(d));
            
            ct=0;
            for(j=n; ct<n-d; j--){
                System.out.print(j+" ");
                ct++;
            }
            
            ct=0;
            j++;
            for(j=j+1; ct<n-d-1; j++){
                System.out.print(j+" ");
                ct++;
            }
            
            System.out.println();
            d--;
        }

	}
}