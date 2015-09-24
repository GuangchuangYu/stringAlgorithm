public class KMPTEST {
    public static void main(String args[]) {
	String seq="ACACGACACACG";
	KMP kmp = new KMP(seq);
	// kmp.printTable();
	

	// kmp.search("AAAAACACGTTTACACACGGGG");
	// kmp.printMatchPosition();

        kmp.search("ACACGACACACGGGGACCGGGACAAAACACGACACACGGGGACACGACACACG");
	kmp.printMatchPosition();
    }
    
}
