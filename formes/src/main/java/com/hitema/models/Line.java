package com.hitema.models;

import com.hitema.Shape;

/**
 * POJO: Représente un objet dessinant une ligne
 */
public class Line extends AbstractForm implements Shape {

    public Line(int number) {
        setNumber(number);
    }
    @Override
    public String draw() {
        return getSymbol().repeat(getNumber());
    }

    @Override
    public String getImplementation() {
        return super.getImplementation();
    }
}
