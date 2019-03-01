package Shapes.W5_2Square;

import Shapes.W5_1Circle.Circle;
import Shapes.W5_1Circle.Shape;

import java.util.ArrayList;
import java.util.List;

public class BasicShapesApplication {

    public static void main(String[] args) {
        Shape circle=new Circle();
        System.out.println("Shape: "+circle.getName());

        Shape squar=new Squar();
        System.out.println("Shape: "+squar.getName());

        Shape triangle=new Triangle();
        System.out.println("Shape: "+triangle.getName());
        List<Circle>circles=new ArrayList<>();
        //circles.add(circle);
        //circles.add(squar);
       // circles.add(triangle);

        List<Shape>shapes=new ArrayList<>();

         shapes.add(circle);
         shapes.add(squar);
         shapes.add(triangle);
        System.out.println("shapes: "+shapes);
        for (Shape shape : shapes) {

            System.out.println("shape: "+shape);

        }
    }

}
