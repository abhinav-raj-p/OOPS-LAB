import java.util.Scanner;

class complexnum {
    float real, img;
    Scanner sc = new Scanner(System.in); 

    complexnum() {
        System.out.println("Enter the real part and imaginary part");
        real = sc.nextFloat();
        img = sc.nextFloat();
    }

    complexnum(float real, float img) { 
        this.real = real;
        this.img = img;
    }

    complexnum add(complexnum c) {
        complexnum result = new complexnum(this.real + c.real, this.img + c.img);
        return result;
    }
}

public class complex {
    public static void main(String args[]) {
        complexnum c1 = new complexnum();
        complexnum c2 = new complexnum();
        complexnum sum = c1.add(c2);
        System.out.println(sum.real + "+i" + sum.img);
    }
}