import java.math.*;;
class Shape{
    void area(double r){
        System.out.println("Area of circle is "+3.14*r*r);
    }
    void area(int l){
        System.out.println("Area of square is "+Math.pow(l,2));
    }
    void area(int l,int b){
        System.out.println("Area of rectangle is "+l*b);
    }
    void area(double l,double h){
        System.out.println("Area of triangle is "+0.5*l*h);
    }
}

public class funoverload {
    public static void main(String args[]){
        Shape ob=new Shape();
        ob.area(3);
        ob.area(5.6);
        ob.area(6,7);
        float x=8,y=3;
        ob.area(x,y);
    }
}
