package Shapes.W5_2Square;

import Shapes.W5_1Circle.Shape;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TriangleTest {

    @Test
    void getName() {

        Triangle triangle=new Triangle();
        Shape shape=new Triangle();
        Assertions.assertEquals("triangle ",triangle.getName());
        Assertions.assertEquals("triangle ",shape.getName());
    }
}