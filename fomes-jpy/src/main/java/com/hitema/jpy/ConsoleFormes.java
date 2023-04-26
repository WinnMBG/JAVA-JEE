package com.hitema.jpy;

import com.hitema.Shape;
import com.hitema.jpy.models.SquareJpy;
import com.hitema.jpy.models.TriangleJpy;
import com.hitema.models.Square;

public class ConsoleFormes {
    public static void main(String[] args) {
        System.out.println("<<<<<<<<<<<<<<<Test Formes JPY (Tokyo)>>>>>>>>>>>>>>>");
        SquareJpy square = new SquareJpy();
        System.out.println(square.draw());
        Shape triangle = new TriangleJpy();
        System.out.println(triangle.draw());
        System.out.println("<<<<<<<<<<<<<<<FIN>>>>>>>>>>>>>>>");
    }
}