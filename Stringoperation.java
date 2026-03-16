package arrayop;

public class Stringoperation{
	String msg;
	int length;
	String rever="";
	public void reverse(String str){
		msg=str;
		for(int i=str.length()-1;i>=0;i--){
			rever+=str.charAt(i);
		}
	}
	public void length(){
		length=msg.length();
	}
	
	public void Display(){
		System.out.println("Original String is "+ msg);
		System.out.println("Reverse String is "+ rever);
		System.out.println("Length of the string is "+ length);
	}
}