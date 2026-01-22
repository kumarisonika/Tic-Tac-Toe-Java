package org.example;

public class Board {
    private final Cell[][] cells;
    private final int size;

    public Board(int size){
        this.size = size;
        cells = new Cell[size][size];

        for (int r=0; r<size; r++){
            for (int c=0; c<size; c++){
                cells[r][c]= new Cell();
            }
        }
    }

    public boolean placeMove(int row, int col, Symbol symbol){
        if (!isValidCell(row,col) || !cells[row][col].isEmpty()){
            return false;
        }
        cells[row][col].setSymbol(symbol);
        return true;
    }

    public Symbol getCellSymbol(int row, int col){
        return cells[row][col].getSymbol();
    }

    public boolean isFull(){
        for (int r=0; r<size; r++){
            for (int c=0; c<size; c++){
                if(cells[r][c].isEmpty()) return false;
            }
        }
        return true;
    }

    private boolean isValidCell(int row, int col){
        return row>=0 && row<size && col>=0 && col<size;
    }

    public int getSize(){return  this.size; }
}
