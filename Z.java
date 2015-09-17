/*

Z algorithm

see annimation: http://www.utdallas.edu/~besp/demo/John2010/z-algorithm.htm

*/

import java.util.ArrayList;

public class Z {
    private String P;
    private String T;
    private int[] Z;
    private ArrayList<Integer> match_pos = new ArrayList<Integer>();

    public void calculateZ(String P) {
	int n = P.length();
	Z = new int[n];

	int L, R, k;
	L = R = 0;
	for (int i=1; i<n; i++) {
	    if (i > R) {
		L = R = i;
		while(R<n && P.charAt(R-L) == P.charAt(R))
		    R++;
		Z[i] = R-L;
		R--;
	    } else {
		k = i - L;
		if (Z[k] < R-i+1) {
		    Z[i] = Z[k];
		} else {
		    L = k;
		    while(R<n && P.charAt(R-L) == P.charAt(R))
			R++;
		    Z[i] = R-L;
		    R--;
		}
	    }
	}
	
    }

    public void search(String T, String P) {
	this.P = P;
	this.T = T;
	int n = P.length();

	String S = P + "$" + T;
	calculateZ(S);
	for (int i = 0; i<S.length(); i++) {
	    if (Z[i] == n) 
		match_pos.add(i-n-1);
	}
    }

    public void printMatchPosition() {
	if (match_pos.size() == 0) {
	    System.out.println("No match found...");
	}
	
	for (Integer match : match_pos) {
	    System.out.println("match position: " + match);
	    System.out.println(T);
	    for (int i=0; i<match; i++) {
		System.out.print(" ");
	    }
	    for (int i=match; i<match+P.length(); i++) {
		System.out.print("|");
	    }
	    System.out.println();
	    for (int i=0; i<match; i++) {
		System.out.print(" ");
	    }
	    System.out.println(P);
	    System.out.println();
	}
    }
}


