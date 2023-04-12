// Java zigzag pattern int using odd and even rows

import java.util.*;

class ZigZagInt
{
public static void main(String[] args) {
   
   System.out.println("Enter an integer to see the Magix:");
   int n = new Scanner(System.in).nextInt();
   
   int val=1, f=1;
   for(int i=0; i<n; i++){
       StringBuilder sb = new StringBuilder("");
       
       if(f%2==1){
           for(int j=0; j<n; j++){
               sb.insert(0, val++ + " ");
           }
       }
       else{
           for(int j=0; j<n; j++){
               sb.append(val++ + " ");
           }
       }
       System.out.println(sb);
       f++;
   }
}
}

