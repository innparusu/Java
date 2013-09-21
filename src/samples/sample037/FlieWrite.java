package samples.sample037;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FlieWrite {
	static int BUFSIZE=1024;
	public static void main(String[] args) throws IOException {
		String name = null,str = null;
		int size = BUFSIZE,bufferSize = BUFSIZE;
		for(int i = 0;i < args.length;i++){
			switch(args[i]){
			case "-s":
				size = Integer.valueOf(args[++i]).intValue();
				break;

			case "-b":
				bufferSize = Integer.valueOf(args[++i]).intValue();
				break;

			case "-n":
				name = args[++i];
				break;

			case "-c":
				str = args[++i];
				break;

			default:
				System.out.println("unknown"+args[i]);
				return;
			}
		}
		
		if (str == null){
			System.out.println("no output strings");
			return;
		}

		String path = "/Users/e125716/test/"+name;
		File file = new File(path);
		file.createNewFile();
		FileOutputStream outFile = new FileOutputStream(file);
		BufferedOutputStream buf = new BufferedOutputStream(outFile);
		for (int i = size; i > 0;i -= bufferSize){
			int wirteSize = bufferSize > i ? i :bufferSize;
			buf.write(str.getBytes(),0,wirteSize);
		}
		buf.flush();
		outFile.close();
		System.out.println(size);
		System.out.println(bufferSize);
	}
}