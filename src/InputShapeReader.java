import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Sarang on 11/01/2015.
 */
class InputShapeReader
{
    public Shape input() throws Exception
    {

        Shape shape=null;
        while (true) {
            int option;
            option = 0;
            System.out.print("\n1.Square\n2.Rectangle\n3.Triangle\n4.Circle\n5.Exit");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            option = Integer.parseInt(br.readLine());
            if (option >= 5)
                break;
            switch (option) {
                case 1:
                    Square square = new Square();
                    shape = inputSquare(square);
                    break;
                case 2:
                    Rectangle rectangle = new Rectangle();
                    shape = inputRectangle(rectangle);
                    break;
                case 3:
                    Triangle triangle = new Triangle();
                    shape = inputTriangle(triangle);
                    break;
                case 4:
                    Circle circle = new Circle();
                    shape = inputCircle(circle);
                    break;
                default:
                    break;
            }
            return shape;
        }

        return shape;
    }

    public Shape inputCircle(Circle circle) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int flg;
        while (true) {

            try {
                System.out.print("Please enter radius:");
                Double radius = Double.parseDouble(br.readLine());
                circle.setRadius(radius);
                flg = 0;
            } catch (Exception e) {
                System.out.print("Number not valid please re-enter");
                flg = 1;
            }
            if (flg == 0)
                break;
        }
        return circle;
    }

    public Shape inputTriangle(Triangle triangle) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int flg;
        while (true) {

            try {
                System.out.print("Please enter three sides:");
                Double base = Double.parseDouble(br.readLine());
                Double side1 = Double.parseDouble(br.readLine());
                Double side2 = Double.parseDouble(br.readLine());
                triangle.setBase(base);
                triangle.setSide1(side1);
                triangle.setSide2(side2);
                flg = 0;
            } catch (Exception e) {
                System.out.print("Number not valid please re-enter");
                flg = 1;
            }
            if (flg == 0)
                break;
        }
        return triangle;
    }

    public Shape inputRectangle(Rectangle rectangle) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int flg;
        while (true) {

            try {
                System.out.print("Please enter length and breadth:");
                Double length = Double.parseDouble(br.readLine());
                Double breadth = Double.parseDouble(br.readLine());
                rectangle.setLength(length);
                rectangle.setBreadth(breadth);
                flg = 0;
            } catch (Exception e) {
                System.out.print("Number not valid please re-enter");
                flg = 1;
            }
            if (flg == 0)
                break;
        }
        return rectangle;
    }

    public Shape inputSquare(Square square) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int flg;
        while (true) {

            try {
                System.out.print("Please enter side:");
                Double side = Double.parseDouble(br.readLine());
                square.setSide(side);
                flg = 0;
            } catch (Exception e) {
                System.out.print("Number not valid please re-enter");
                flg = 1;
            }
            if (flg == 0)
                break;
        }
        return square;
    }
}
