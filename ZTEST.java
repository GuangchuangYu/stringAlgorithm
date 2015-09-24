import java.io.*;
import java.util.*;

public class ZTEST {
    public static void main(String args[]) throws FileNotFoundException{
	

	// String seq="TTCCGGTGATCCGACAGGTTA";

	// Scanner in = new Scanner(new File("lambda_virus.fa"));
	// String line="";
	// String header = in.nextLine();

	// while(in.hasNextLine()) {
        //     line += in.nextLine();
	// }
	// zz.search(line, seq);
	// zz.printPos();

	String seq="ACACGACACACG";
	String ref="ACACGACACACGGGGACCGGGACAAAACACGACACACGGGGACACGACACACG";
	Z zz = new Z();
	zz.search(ref, seq);
	zz.printMatchPosition();

    }
    
}
