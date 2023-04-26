package com.hitema.jpy.models;

import com.hitema.Shape;

public class SquareJpy implements Shape {


    private String implementation = "JPY 1.0" ;
    private int number;
    private String symbol = "*" ;

    public SquareJpy(){
        this(5,"*");
    }
    public SquareJpy(int number) {
        this(number,"*");
    }
    public SquareJpy(int number, String symbol) {
        this.number = number;
        this.symbol = symbol;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String draw() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< getNumber(); i++){
            for(int j = 0; j< getNumber(); j++) {
                if (i == 0 || i == getNumber()-1)
                    sb.append(getSymbol()+" ");
                else if ( j==0 || j ==  getNumber()-1)
                        sb.append(getSymbol()+" ");
                else
                    sb.append("  ");
            }
            sb.append(" \n");
        }
        sb.append("\n");
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
