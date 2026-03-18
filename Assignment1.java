public class Assignment1 {
    public static void main(String[] args) {
        int Radius= 5;
        int Base=10;
        int Height=16;
        int Width=9;
        
        int Carea=(22/7) * Radius * Radius;
        double Tarea=0.5* Base * Height;
        int Sarea=Base * Base;
        int Rarea = Base * Width;
        
        System.out.println("The Radius , Base, Height and Width are "+ Radius + Base + Height + Width + "The Area of "
                + "Circle is "+ Carea + " The Area of Triangle is "+ Tarea+ " Area of the Square "+ Sarea +
                "Area of the Rectangle is "+ Rarea);
    }
}
