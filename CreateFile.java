import java.io.*;

class CreateFile{
	public static void main(String[]args)throws IOException{
		DataInputStream dis=new DataInputStream(System.in);
		FileOutputStream fout=new FileOutputStream("Mytextfile.txt");
		System.out.println("Enter Text press '@' to stop");
		char c;
		while((c=(char)dis.read())!='@'){
			fout.write(c);
		}
	}
}