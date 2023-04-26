package com.hitema;

import java.util.List;

public class ShapeServer {
    public static void drawMultiple(List<Shape> shapes) {
        for(Shape shape: shapes) {
            System.out.println("Type Implementation :"+ shape.getImplementation());
            System.out.println(shape.draw()+"\n");
        }
    }
}
