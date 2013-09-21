package samples.sample037;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Hoge {
	public static void main(String[] args) throws IOException {

		File obj1 = new File("/Users/e125716","test");
		File obj2 = new File(obj1,"hoge.txt");
		obj2.createNewFile();
		FileOutputStream outFile = new FileOutputStream(obj2);
		outFile.write(10000000);
		BufferedOutputStream buf = new BufferedOutputStream(outFile);
	}
}
