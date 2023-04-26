package com.hitema.models;

import com.hitema.Shape;

public class Square extends AbstractForm implements Shape {
    public Square(int number) {
        setNumber(number);
    }
    @Override
    public String draw() {
        StringBuilder square = new StringBuilder();
        for(int i = 1; i <= getNumber(); i++) {
            square.append(getSymbol().repeat(getNumber()));
            square.append("\n");
        }
        return square.toString();
    }

    @Override
    public String getImplementation() {
        return super.getImplementation();
    }
}
