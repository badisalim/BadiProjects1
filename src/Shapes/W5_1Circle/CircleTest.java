package Shapes.W5_1Circle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CircleTest {

    @Test
    void getName() {
        String expected="circle";

        Circle circle=new Circle();
        Assertions.assertEquals(expected, circle.getName());

        Shape shape=new Circle();
        Assertions.assertEquals(expected, shape.getName());
    }

}