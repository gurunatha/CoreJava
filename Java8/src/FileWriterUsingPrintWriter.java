import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

public class FileWriterUsingPrintWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter f = new FileWriter("abc.txt");
		
		PrintWriter pw = new PrintWriter(f);
		pw.println(1);
		pw.println(2);
		
		pw.println(56);
		pw.flush();

	}

}
