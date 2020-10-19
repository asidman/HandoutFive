import acm.program.*;
import java.io.*;
import java.util.StringTokenizer;


public class WordCount extends ConsoleProgram {
	 public void run() {
	 int lines = 0;
	 int words = 0;
	 int chars = 0;
	 BufferedReader rd = openFileReader("File: ");
	 try {
	 while (true) {
	 String line = rd.readLine();
	 if (line == null) break;
	 lines++;
	 words += countWords(line);
	 chars += line.length();
	 }
	 rd.close();
	 } catch (IOException ex) {
	 println("An I/O exception has occurred");
	 }
	 println("Lines = " + lines);
	 println("Words = " + words);
	 println("Chars = " + chars);
	 }

	 private  int countWords(String line) {
		 int words = 0;

         for(int i = 1 ; i<line.length();i++){
         Character ch  = line.charAt(i-1);
         Character bch = line.charAt(i);
             if(Character.isLetterOrDigit(ch) == true && Character.isLetterOrDigit(bch)== false ) words++;
             if(i == line.length()-1 && Character.isLetterOrDigit(bch))words++;
         }
	return words;
	}

	private BufferedReader openFileReader(String prompt) {
	 BufferedReader rd = null;
	 while (rd == null) {
	 String name = readLine(prompt);
	 try {
	 rd = new BufferedReader(new FileReader(name));
	 } catch (IOException ex) {
	 println("Can't open that file.");
	
	 }
	 }
	 return rd;
	 } 
}