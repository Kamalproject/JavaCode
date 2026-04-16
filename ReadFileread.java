import java.io.*;

class ReadFileread{
	public static void main(String[]args)throws IOException{
		FileReader fr=null;
		try{
			fr=new FileReader("Mytextfile.txt");
		}
		catch(FileNotFoundException fe){
			System.out.println("This file moved or this file corupted");
		}
		int c;
		while((c=fr.read())!=-1){
			System.out.print((char)c);
		}
	}
}