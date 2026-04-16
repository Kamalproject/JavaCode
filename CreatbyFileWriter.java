import java.io.*;

class CreatbyFileWriter{
	public static void main(String[]args)throws IOException{
		String str="Kuna";
		FileWriter fw=new FileWriter("Newfile.txt");
		for(int i=0;i<str.length();i++){
			fw.write(str.charAt(i));
		}
		System.out.println("File creatred");
		
	}
}
