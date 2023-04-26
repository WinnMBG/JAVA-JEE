package com.hitema;
import com.hitema.models.Line;
import com.hitema.models.Square;
import com.hitema.models.Triangle;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Formes {
    private static String star = "* ";
    public static void main(String[] args) {
        // Press Alt+Entrée with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        String linef = "=".repeat(100);
        System.out.println(linef);
        System.out.println("Programme de génération de formes");
        System.out.println(linef);

        while(true) {
            System.out.println("Entrer un nombre entier:");
            Scanner in = new Scanner(System.in);
            String number = in.nextLine();

            if (number.equals("")) {
                break;
            }

            int n = Integer.valueOf(number);
            List<Shape> shapes = new ArrayList<Shape>();

            System.out.println("========= LIGNE ============");
            Line line = new Line(n);
            //System.out.println(line.draw());
            shapes.add(line);

            System.out.println("========= CARRE ============");
            Square square = new Square(n);
            //System.out.println(square.draw());
            shapes.add(square);

            System.out.println("========= TRIANGLE ============");
            Triangle triangle = new Triangle(n);
            //System.out.println(triangle.draw());
            shapes.add(triangle);

            ShapeServer.drawMultiple(shapes);

        }
        System.out.println("Fin du programme des formes!");
    }

}