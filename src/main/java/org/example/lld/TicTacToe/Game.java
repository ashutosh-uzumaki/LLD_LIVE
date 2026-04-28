package org.example.lld.TicTacToe;

import org.example.lld.TicTacToe.enums.Symbol;
import org.example.lld.TicTacToe.models.Board;
import org.example.lld.TicTacToe.models.Move;
import org.example.lld.TicTacToe.models.Player;

import java.util.*;

public class Game {
    private final Board board;
    private final List<Player> players;
    private final Queue<Player> playerPositions;
    private Player gameWinner;
    private boolean isGameOver;

    Game(int size, List<Player> players) {
        board = new Board(size);
        this.players = players;
        playerPositions = new ArrayDeque<>();
        initializePlayerPositions(players);
    }

    public void initializePlayerPositions(List<Player> players) {
        playerPositions.addAll(players);
    }

    public void play() {
        if(Objects.isNull(board)){
            System.out.println("Board is not ready yet!!");
            return;
        }
        if(playerPositions.isEmpty()){
            System.out.println("Players are not ready yet!!");
            return;
        }

        while(!isGameOver){
            Player currentPlayer = playerPositions.poll();
            Move move = getPlayerMove(currentPlayer);
            while(!board.makeMove(move, currentPlayer.getSymbol())){
                move = getPlayerMove(currentPlayer);
            }

            if(checkWinner(move.getRow(), move.getCol(), currentPlayer.getSymbol())){
                isGameOver = true;
                gameWinner = currentPlayer;
                break;
            }
            playerPositions.add(currentPlayer);
        }

        if(gameWinner == null){
            System.out.println("Game is drawn!!");
        }
        System.out.println("Player " + gameWinner + " has won!");

    }
    public Move getPlayerMove(Player currentPlayer){
        System.out.println("Player " + currentPlayer.getName() + " has move!");
        System.out.println("Please Enter Cell To Place On Board");
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int col = scn.nextInt();
        return new Move(row-1, col-1);
    }

    public boolean checkWinner(int row, int col, Symbol symbol) {
        boolean win = true;
        int n = board.getSize();
        Symbol[][] grid = board.getBoard();
        for(int i = 0; i < n; i++){
            if(grid[row][i] != symbol){
                win = false;
                break;
            }
        }

        if(win) return true;

        for(int i=0; i < n; i++){
            if(grid[i][col] != symbol){
                win = false;
                break;
            }
        }

        for(int i=0; i < n; i++){
            if(grid[i][i] != symbol){
                if(grid[i][col] != symbol){
                    win = false;
                    break;
                }
            }
        }
        if(win) return true;

        if(row + col == n-1){
            win = true;
            for(int i=0; i < n; i++){
                if(grid[i][n-i-1] != symbol){
                    win = false;
                    break;
                }
            }
            if(win) return true;
        }
        return false;
    }

}
