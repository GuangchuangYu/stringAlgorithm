import java.util.*;

public class KMP {
    private String ref;
    private String seq;
    private int[] kmpTable;
    private ArrayList<Integer> match_pos;
    
    public KMP(String seq) {
	this.seq = seq;
	preprocess();
    }

    public void preprocess() {
	int m = seq.length();
	kmpTable = new int[m];
	int j = 0;
	for (int i=1; i<m; i++) {
	    while(j > 0 && seq.charAt(i) != seq.charAt(j)) {
		j = kmpTable[j-1];
	    }
	    
	    if (seq.charAt(i) == seq.charAt(j)) {
		j++;
	    }
	    kmpTable[i] = j;
	}
    }

    public void search(String ref) {
	this.ref = ref;
	match_pos = new ArrayList<Integer>();
	int i=0, j=0;
	
	while (i < ref.length()) {
	    while(j > 0 && ref.charAt(i) != seq.charAt(j)) {
		j = kmpTable[j-1];
	    }

	    if (j == 0 && ref.charAt(i) != seq.charAt(j)) {
	    	j--;
	    }

	    i++;
	    j++;

	    if (j == seq.length()) {
		match_pos.add(i-seq.length());
		j = 0;
	    }
	}
    }
    
    public void printTable() {
	for (int i=0; i<kmpTable.length; i++)
	    System.out.print(kmpTable[i] + " ");
	System.out.println();
    }

    
    public void printMatchPosition() {
	MatchPosition mp = new MatchPosition(ref, seq, match_pos);
	mp.print();
    }
}
