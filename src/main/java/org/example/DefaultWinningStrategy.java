package org.example;

public class DefaultWinningStrategy implements WinningStrategy{

    @Override
    public boolean checkWin(Board board, Symbol symbol){
        int n = board.getSize();
        //check  rows and cols
        for(int r=0; r<n; r++){
            boolean rowWin = true;
            boolean colWin = true;

            for(int c=0; c<n; c++){
                rowWin = rowWin && board.getCellSymbol(r,c)==symbol;
                colWin = colWin && board.getCellSymbol(c,r)==symbol;
            }

            if(rowWin || colWin) return true;
        }

        //check diagonals

        boolean diag1=true;
        boolean diag2=true;

        for(int i =0; i<n; i++){
            diag1= diag1 && board.getCellSymbol(i,i)==symbol;
            diag2= diag2 && board.getCellSymbol(i,n-i-1)==symbol;
        }

        return diag1 || diag2;
    }
}
