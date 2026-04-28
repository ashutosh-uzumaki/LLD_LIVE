package org.example.lld.TicTacToe;

import org.example.lld.TicTacToe.enums.Symbol;
import org.example.lld.TicTacToe.models.Player;

import java.util.ArrayList;
import java.util.List;

public class TicTacToeDemo {
    public static void main(String[] args) {
        int boardSize = 3;
        Player player1 = new Player("Ashutosh", Symbol.X);
        Player player2 = new Player("Ashutosh", Symbol.O);
        List<Player> players = List.of(player1, player2);
        Game game = new Game(boardSize, players);
        game.play();
    }
}
