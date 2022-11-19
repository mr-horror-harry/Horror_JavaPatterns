// Print an X-form of word of odd length

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String s = sc.next();
	    
	    for(int i=0; i<s.length(); i++){
	        for(int j=0; j<s.length(); j++){
	             System.out.print(i==j || i+j==s.length()-1 ? s.charAt(j): " ");
	        }
	        System.out.println();
	    }
	}
}
