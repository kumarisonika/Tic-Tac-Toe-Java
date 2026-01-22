package org.example;

public class Cell {
    private Symbol symbol;

    public Cell(){
        this.symbol=Symbol.EMPTY;
    }

    public boolean isEmpty(){
        return symbol==Symbol.EMPTY;
    }

    public Symbol getSymbol(){
        return symbol;
    }

    public void setSymbol(Symbol symbol){
        this.symbol= symbol;
    }
}
