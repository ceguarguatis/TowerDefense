package data;

import data.*;
import java.util.*;

public class Tablero {

    private Casilla[][] board;
    private List<Torre> torres;
    private List<Enemigo> oleada;
    private List<Casilla> camino;

    public List<Casilla> getCamino() {
        return camino;
    }

    public void setCamino(List<Casilla> camino) {
        this.camino = camino;
    }

    public List<Torre> getTorres() {
        return torres;
    }

    public void setTorres(List<Torre> torres) {
        this.torres = torres;
    }

    public List<Enemigo> getOleada() {
        return oleada;
    }

    public void setOleada(List<Enemigo> oleada) {
        this.oleada = oleada;
    }

    public Tablero() {

        int value = 0;
        board = new Casilla[10][10];
        torres = new ArrayList<Torre>();
        oleada = new ArrayList<Enemigo>();
        oleada.add(new Enemigo(1,1,1));
        oleada.add(new Enemigo(1,1,1));
        
        camino = new ArrayList<Casilla>();
        camino.add(new Casilla(0,0,1,3));
        camino.add(new Casilla(0,1,1,3));
        camino.add(new Casilla(1,1,1,3));
        camino.add(new Casilla(1,2,1,3));
        camino.add(new Casilla(2,2,1,3));
        camino.add(new Casilla(2,3,1,3));
        camino.add(new Casilla(2,4,1,3));
        camino.add(new Casilla(3,4,1,3));
        camino.add(new Casilla(3,5,1,3));
        camino.add(new Casilla(3,6,1,3));
        camino.add(new Casilla(2,6,1,3));
        camino.add(new Casilla(1,6,1,3));
        camino.add(new Casilla(1,7,1,3));
        camino.add(new Casilla(1,8,1,3));
        camino.add(new Casilla(2,8,1,3));
        camino.add(new Casilla(3,8,1,3));
        camino.add(new Casilla(4,8,1,3));
        camino.add(new Casilla(5,8,1,3));
        camino.add(new Casilla(6,8,1,3));
        camino.add(new Casilla(6,7,1,3));
        camino.add(new Casilla(6,6,1,3));
        camino.add(new Casilla(5,6,1,3));
        camino.add(new Casilla(5,5,1,3));
        camino.add(new Casilla(5,4,1,3));
        camino.add(new Casilla(5,3,1,3));
        camino.add(new Casilla(5,2,1,3));
        camino.add(new Casilla(5,1,1,3));
        camino.add(new Casilla(5,0,1,3));
        camino.add(new Casilla(6,0,1,3));
        camino.add(new Casilla(7,0,1,3));
        camino.add(new Casilla(7,1,1,3));
        camino.add(new Casilla(7,2,1,3));
        camino.add(new Casilla(8,2,1,3));
        camino.add(new Casilla(8,3,1,3));
        camino.add(new Casilla(8,4,1,3));
        camino.add(new Casilla(8,5,1,3));
        camino.add(new Casilla(8,6,1,3));
        camino.add(new Casilla(8,7,1,3));
        camino.add(new Casilla(8,8,1,3));
        camino.add(new Casilla(8,9,1,3));
        
        
        
        
        
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                if ((row == 0 && col == 0)
                        || (row == 0 && col == 1)
                        || (row == 1 && col == 1)
                        || (row == 1 && col == 2)
                        || (row == 2 && col == 2)
                        || (row == 2 && col == 3)
                        || (row == 2 && col == 4)
                        || (row == 3 && col == 4)
                        || (row == 3 && col == 5)
                        || (row == 3 && col == 6)
                        || (row == 2 && col == 6)
                        || (row == 1 && col == 6)
                        || (row == 1 && col == 7)
                        || (row == 1 && col == 8)
                        || (row == 2 && col == 8)
                        || (row == 3 && col == 8)
                        || (row == 4 && col == 8)
                        || (row == 5 && col == 8)
                        || (row == 6 && col == 8)
                        || (row == 6 && col == 7)
                        || (row == 6 && col == 6)
                        || (row == 5 && col == 6)
                        || (row == 5 && col == 5)
                        || (row == 5 && col == 4)
                        || (row == 5 && col == 3)
                        || (row == 5 && col == 2)
                        || (row == 5 && col == 1)
                        || (row == 5 && col == 0)
                        || (row == 6 && col == 0)
                        || (row == 7 && col == 0)
                        || (row == 7 && col == 1)
                        || (row == 7 && col == 2)
                        || (row == 8 && col == 2)
                        || (row == 8 && col == 3)
                        || (row == 8 && col == 4)
                        || (row == 8 && col == 5)
                        || (row == 8 && col == 6)
                        || (row == 8 && col == 7)
                        || (row == 8 && col == 8)
                        || (row == 8 && col == 9)) {
                    Casilla square = new Casilla(row, col, (char) ++value, 3);
                    board[row][col] = square;
                } else {
                    Casilla square = new Casilla(row, col, (char) ++value);
                    board[row][col] = square;
                }
            }
        }
    }

    public Casilla[][] getBoard() {
        return board;
    }

    public void updateSquare(Casilla square) {
        board[square.getRow()][square.getCol()] = square;
    }

    @Override
    public String toString() {
        Enemigo enemigo = new Enemigo(1, 1, 1);
        Torre torre = new Torre(1, 1, 1);
        String printBoard = "\n";
        for (int row = 0; row < board.length; row++) {
            printBoard = printBoard.concat("\t ");
            for (int col = 0; col < board.length; col++) {
                if (board[row][col].getDeterminante() == 0) {
                    printBoard = printBoard.concat(board[row][col].toString());
                } else if (board[row][col].getDeterminante() == 1) {
                    printBoard = printBoard.concat(board[row][col].toString(enemigo));
                } else if (board[row][col].getDeterminante() == 2) {
                    printBoard = printBoard.concat(board[row][col].toString(torre));
                } else if (board[row][col].getDeterminante() == 3) {
                    printBoard = printBoard.concat(board[row][col].toString(7978));
                }
            }
            printBoard = printBoard.concat("\n");
        }
        return printBoard;
    }
}