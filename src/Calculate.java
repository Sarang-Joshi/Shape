/**
 * Created by Sarang on 11/01/2015.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Calculate
{
    public static void main(String[] args) throws Exception
    {

        Shape shape = null;
        InputShapeReader shapeReader = new InputShapeReader();
        int option = 0;
        while (true)
        {
            shape=shapeReader.input();
            System.out.print("\n1.area\n2.perimeter\n6.Exit");
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                option = Integer.parseInt(br.readLine());
            } catch (Exception e) {
                System.out.print("Select option");
            }
            if (option >= 6)
                break;
            switch (option)
            {
                case 1:
                    System.out.print("" + shape.calculateArea());
                    break;
                case 2:
                    System.out.print("" + shape.calculatePerimeter());
                    break;

                default:
                    break;
            }
        }
    }
}