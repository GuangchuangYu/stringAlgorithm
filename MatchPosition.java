import java.util.ArrayList;

public class MatchPosition {
    private String T;
    private String P;
    private ArrayList<Integer> match_pos;

    public MatchPosition(String T, String P, ArrayList<Integer> match_pos) {
	this.T = T;
	this.P = P;
	this.match_pos = match_pos;
    }

   
    public void print() {
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
