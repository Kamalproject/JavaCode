class Parent{
    void Show(){
        System.out.println("This is the Parent class");
    }
}
class Child extends Parent{
    void Show(){
        System.out.println("This is the Child Class");
    }
}
public class Overide {
    public static void main(String[] args) {
        Parent p=new Child();
        p.Show();
    }
}
