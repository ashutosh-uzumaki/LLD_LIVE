package org.example.lld.TicTacToe.models;

import org.example.lld.TicTacToe.enums.Symbol;

public class Board {
    private final int size;
    private Symbol[][] board;
    public Board(int size) {
        this.size = size;
        board = new Symbol[size][size];
        for(int i = 0; i < size; i++){
           for(int j = 0; j < size; j++){
               board[i][j] = Symbol.EMPTY;
           }
        }
    }


    public boolean makeMove(Move move, Symbol symbol) {
        int row = move.getRow();
        int col = move.getCol();
        if(board[row][col] != Symbol.EMPTY){
            System.out.println("Already Player has played the move at this position");
            return false;
        }

        if(!checkBounds(row, col)){
            return false;
        }
        board[row][col] = symbol;
        return true;
    }

    public boolean checkBounds(int row, int col) {
        if(row < 0 || row >= size || col < 0 || col >= size){
            return false;
        }
        return true;
    }

    public int getSize() {
        return size;
    }

    public Symbol[][] getBoard() {
        Symbol[][] copy = new Symbol[size][size];
        for(int i = 0; i < size; i++){
            copy[i] = board[i].clone();
        }
        return copy;
    }
}
