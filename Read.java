import java.io.*;
class Read{
	public static void main(String[]args)throws IOException{
		FileInputStream fis=new FileInputStream("Myfile.txt");
		int ch;
		while((ch=fis.read())!=-1){
			System.out.print((char)ch);
		}
	}
}