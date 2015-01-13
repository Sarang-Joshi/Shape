import java.io.BufferedReader;
import java.io.InputStreamReader;

class Circle implements Shape,DrawableThreeD {
    private double radius;

    public void setRadius(Double radius)
    {
        this.radius=radius;
    }
    public double calculateArea() {
        return 3.143*radius*radius;
    }
    public void drawThreeD() {
        System.out.print("I am drawing Circle in 3d");
    }

    public double calculatePerimeter() {
        return 2*3.14*radius;
    }

}