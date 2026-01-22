package org.example;

public class Main {
    static void main() {

        Board board= new Board(3);
        Player player1= new Player("Monica", Symbol.O);
        Player player2= new Player("Rachel", Symbol.X);

        Game game = new Game(player1,player2);

        game.playMove(2,0);
        game.playMove(0,1);
        game.playMove(1,1);
        game.playMove(0,2);
        game.playMove(2,2);
        game.playMove(0,0);


    }
}
