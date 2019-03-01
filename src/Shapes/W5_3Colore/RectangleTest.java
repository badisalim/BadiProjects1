package Shapes.W5_3Colore;

import Shapes.W5_1Circle.Shape;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RectangleTest {
    @Test
    void getName() {
        String expected = "rectangle";

        Rectangle rectangle = new Rectangle();

        Assertions.assertEquals(expected, rectangle.getName());
        Shape shape=new Rectangle();
        Assertions.assertEquals(expected, shape.getName());

        Colored colored=new Rectangle();
        Assertions.assertEquals("violet", colored.getColore());


    }
}