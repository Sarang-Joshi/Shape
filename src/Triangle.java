import java.io.BufferedReader;
import java.io.InputStreamReader;

import static java.lang.Math.sqrt;

class Triangle implements Shape {
    private double base;
    private double side1;
    private double side2;

    public void setBase(Double base)
    {
        this.base=base;
    }
    public void setSide1(Double side1)
    {
        this.side1=side1;
    }
    public void setSide2(Double side2)
    {
        this.side2=side2;
    }
    public void drawConsole()
    {
        System.out.print("I am drawing Triangle on console");
    }
    public void drawThreeD()
    {
        System.out.print("I am drawing Triangle in 3d");
    }
    public void drawColor()
    {
        System.out.print("I am drawing Triangle in color");
    }
    public double calculateArea() {
        double semiPerimeter=(base+side1+side2)/2;
        return sqrt(semiPerimeter*(semiPerimeter-side1)*(semiPerimeter-side2)*(semiPerimeter-base));
    }
    public double calculatePerimeter() {
        return (side2+side1+base);
    }


}