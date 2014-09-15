import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class TextFileOutputDemo{
	public static void main(String [] args){
		PrintWriter outputStream=null;
		try{
			outputStream=new PrintWriter(new FileOutputStream("coba2.txt"));
			}
		catch(FileNotFoundException e){
			System.out.println("Error opening file coba2.txt.");
			System.exit(0);
			}
		System.out.println("Writing to file.");
		outputStream.println("Saya sedang menulis file baru");
		outputStream.println("Menulis data baru kedalam file");
		outputStream.close();
		System.out.println("End of program");
		}
	}