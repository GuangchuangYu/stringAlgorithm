public class KMP {
    private String ref;
    private String seq;
    private int[] kmpTable;
    private int match_pos;
    
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
		match_pos = i-seq.length();
		return;
	    }
	}

	match_pos = -1;
    }
    
    public void printTable() {
	for (int i=0; i<kmpTable.length; i++)
	    System.out.print(kmpTable[i] + " ");
	System.out.println();
    }

    public int getMatchPosition() {
	return match_pos;
    }
    
    public void printMatchPosition() {
	if (match_pos < 0) {
	    System.out.println("No match found...");
	    return;
	}
	
	System.out.println(ref);
	for (int i=0; i<match_pos; i++) {
	    System.out.print(" ");
	}
	for (int i=match_pos; i<match_pos+seq.length(); i++) {
	    System.out.print("|");
	}
	System.out.println();
	for (int i=0; i<match_pos; i++) {
	    System.out.print(" ");
	}
	System.out.println(seq);
    }
}
