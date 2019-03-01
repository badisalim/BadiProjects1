package Shapes.W5_1Circle;

public class CircleApplication {
    public static void main(String[] args) {
        Circle circle=new Circle();
        System.out.println("Class: "+circle.getName());

        Shape shape=circle;
        System.out.println("Shape: "+shape.getName());

        Shape anothershape=shape;
        System.out.println("AnotherShape: "+anothershape.getName());
    }
}
