import java.util.*;
public class XBoxPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print((i==1 || i==n || j==1 || j==n || i==j || i+j==n+1)? "*":"-");
            }
            System.out.println();
            
        }
    }
}
