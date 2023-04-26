package com.hitema.jpy.models;

import com.hitema.Shape;

public class TriangleJpy implements Shape {

    private String implementation = "JPY 2.0" ;
    private int number;
    private String symbol = "*" ;

    public TriangleJpy(){
        this(5,"*");
    }
    public TriangleJpy(int number){
        this(number,"*");
    }
    public TriangleJpy(int number, String symbol) {
        this.number = number;
        this.symbol = symbol;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String draw() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < getNumber(); i++) {
            for (int j = 0; j <= i; j++) {
                if (i == 0 || i == getNumber()-1)
                    sb.append(getSymbol()+" ");
                else if ( j==0 || j ==  i)
                    sb.append(getSymbol()+" ");
                else
                    sb.append("  ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    @Override
    public String getSymbol() {
        return this.symbol;
    }

    @Override
    public String getImplementation() {
        return this.implementation;
    }
}
