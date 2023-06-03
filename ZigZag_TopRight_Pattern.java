// Java zigzag pattern int using odd and even rows using StringBuilder

import java.util.*;

public class ZigZagTopRight {
    public static void main(String[] args) {

        System.out.print("Enter a Number: ");
        int n = new Scanner(System.in).nextInt();

        int val = 1, f = 1;
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder("");

            if (f % 2 == 1) {
                for (int j = 0; j < n; j++) {
                    sb.insert(0, val++ + " ");
                }
            } else {
                for (int j = 0; j < n; j++) {
                    sb.append(val++ + " ");
                }
            }
            System.out.println(sb);
            f++;
        }
    }
}
