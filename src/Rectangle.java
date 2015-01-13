import java.io.BufferedReader;
import java.io.InputStreamReader;

class Rectangle implements Shape {
    private double length;
    private double breadth;

    public void setLength(double length)
    {
        this.length=length;
    }
    public void setBreadth(double breadth)
    {
        this.breadth=breadth;
    }
    public void drawConsole()
    {
        System.out.print("I am drawing Rectangle on console");
    }
    public void drawThreeD()
    {
        System.out.print("I am drawing Rectangle in 3d");
    }
    public void drawColor()
    {
        System.out.print("I am drawing Rectangle in color");
    }
    public double calculateArea() {
        return length * breadth;
    }

    public double calculatePerimeter() {
        return (2 * (length + breadth));
    }


}