package com.hitema.models;

import com.hitema.Shape;

public class Triangle extends AbstractForm implements Shape {

    public Triangle(int number) {
        setNumber(number);
    }
    @Override
    public String draw() {
        StringBuilder triangle = new StringBuilder();
        for(int i = 1; i <= getNumber(); i++) {
            triangle.append(getSymbol().repeat(i));
            triangle.append("\n");
        }
        return triangle.toString();
    }

    @Override
    public String getImplementation() {
        return super.getImplementation();
    }
}
