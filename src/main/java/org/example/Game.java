package org.example;

public class Game {
    private Board board;
    private Player[] players;
    private WinningStrategy winningStrategy;
    private int currPlayerIndex;
    private GameState gameState;

    public Game(Player p1, Player p2){
        this.board = new Board(3);
        this.players= new Player[]{p1,p2};
        this.winningStrategy= new DefaultWinningStrategy();
        this.currPlayerIndex=0;
        this.gameState=GameState.IN_PROGRESS;
    }

    public GameState playMove(int r, int c){
        if(gameState != GameState.IN_PROGRESS){
            return gameState;
        }

        Player currentPlayer = players[currPlayerIndex];
        boolean movePlaced = board.placeMove(r,c,currentPlayer.getSymbol());

        if(!movePlaced){ return gameState;} //invalid move

        if(winningStrategy.checkWin(board, currentPlayer.getSymbol())){
            gameState = GameState.WIN;
            System.out.println(currentPlayer.getName()+" wins");
            return  gameState;
        }

        if(board.isFull()){
            gameState = GameState.DRAW;
            System.out.println("Game draw!");
            return  gameState;
        }

        currPlayerIndex = 1-currPlayerIndex;
        return gameState;
    }

}
