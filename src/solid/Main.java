package solid;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String arg[]){

        AreaCalculator areaCalculator=new AreaCalculator();
        Circle circle=new Circle(10);
        Square square=new Square(10);
        List<Object> shapes=new ArrayList<>();
        shapes.add(circle);
        shapes.add(square);
        int sum=areaCalculator.sum(shapes);
        ShapesPrinter shapesPrinter=new ShapesPrinter();
        System.out.println(shapesPrinter.json(shapes));
    }
}
