import java.io.*;
import java.util.*;

public class BMTEST {
    public static void main(String args[]) throws FileNotFoundException{
	String seq="ACACGACACACG";
	
	// Scanner in = new Scanner(new File("lambda_virus.fa"));
	// String line="";
	// String header = in.nextLine();
	// while(in.hasNextLine()) {
        //     line += in.nextLine();
	// }

	// BM bm = new BM(seq);
	// for (int i=0; i<10; i++) {
	//     bm.search(line);
	//     bm.printPos();
	// }
	
	BM bm = new BM(seq);
	// // bm.search(line);	


	
	bm.search("ACACGACACACGGGGACCGGGACAAAACACGACACACGGGGACACGACACACG");
	bm.printMatchPosition();
    }

  


}
