public class ZTEST {
    public static void main(String args[]) {
	String seq="ACACGACACACG";
	String ref="ACACGACACACGGGGACCGGGACAAAACACGACACACGGGGACACGACACACG";
	Z zz = new Z();
	zz.search(ref, seq);
	zz.printMatchPosition();
    }
    
}
