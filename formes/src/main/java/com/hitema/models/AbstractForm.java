package com.hitema.models;

public abstract class AbstractForm {
    private String implementation = "FRF";
    private int number;
    private String symbol = "* ";

    public abstract String draw();

    public int getNumber() {
        return number;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getImplementation() {
        return implementation;
    }

    public void setImplementation(String implementation) {
        this.implementation = implementation;
    }
}
