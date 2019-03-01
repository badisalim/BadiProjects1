package Shapes.W5_2Square;

import Shapes.W5_1Circle.Shape;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SquarTest {

    @Test
    void getName() {

        Squar squar=new Squar();
        Shape shape=new Squar();
        Assertions.assertEquals("squar",squar.getName());
        Assertions.assertEquals("squar",shape.getName());
    }
}