package Shapes.W5_3Colore;

import Shapes.W5_1Circle.Shape;

import java.util.ArrayList;
import java.util.List;

public class BasicColorApplication<colored> {

    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle();
        System.out.println("colore: "+rectangle.getColore());

        Rectangle rectangle1=new Rectangle();

        System.out.println("Name: " + rectangle1.getName());
        Colored colored = (Colored) rectangle;
        System.out.println("Colored: " + colored.getColore());

        Shape shape = (Shape) rectangle;
        System.out.println("shape: "+shape.getName());

        List<Rectangle> rectangles=new ArrayList<>();
         rectangles.add(rectangle);

            System.out.println(rectangles);



        List<Colored>colores=new ArrayList<>();
        colores.add(colored);
        colores.add(rectangle);

            System.out.println(colores);



        List<Shape>shapes=new ArrayList<>();
        shapes.add(shape);
        shapes.add(rectangle);
            System.out.println(shapes);
        }

    }

