import java.io.BufferedReader;
import java.io.InputStreamReader;

class Square implements Shape {
    private double side;

    public void setSide(double side)
    {
        this.side=side;
    }
    public double calculateArea() {
        return side * side;
    }
    public void drawConsole()
    {
        System.out.print("I am drawing Square on console");
    }
    public void drawThreeD()
    {
        System.out.print("I am drawing Square in 3d");
    }
    public void drawColor()
    {
        System.out.print("I am drawing Square in color");
    }

    public double calculatePerimeter() {
        return (4 * side);
    }


}