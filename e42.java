abstract class q2 {
    abstract void area();    
}

class Circle extends q2{
    double r;

    Circle(double radius){
        this.r=radius;
    }

    void area(){
        double area=3.14*r*r;
        System.out.println(area);
    }
}

class Rectangle extends q2{

    double l; double b;
    
    Rectangle(double length, double breadth){
        this.l=length;
        this.b=breadth;
    }
    void area(){
        double area=l*b;
        System.out.println(area);
    }
}

class Triangle extends q2{

    double b; double h;

    Triangle(double b, double h){
        this.b=b;
        this.h=h;
    }

    void area(){
        double area=0.5*h*b;
        System.out.println(area);

    }
}

public class e42{
    public static void main(String[] args) {

        Circle c= new Circle(3.0);
        c.area();

        
    }
}
