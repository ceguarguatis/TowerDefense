package business;

import data.*;

public class MovementHandler {

    public static void ponerTorre(int row, int col, Tablero tablero) {
        Casilla cuadro = new Casilla(row, col, 1, 2);
        tablero.updateSquare(cuadro);
    }

    public static void ponerCasilla(Tablero tablero, int enemigo, int numbCasilla) {
        tablero.getOleada().get(enemigo).setCasilla(tablero.getCamino().get(numbCasilla));

    }

    public static void updateTablero(Tablero board, int j) {
        for (int i = 0; i < board.getCamino().size(); i++) {
            if (board.getCamino().get(i) != board.getOleada().get(j).getCasilla()) {
                board.updateSquare(new Casilla(board.getCamino().get(i).getRow(), board.getCamino().get(i).getCol(), 1, 3));
            }
        }
    }
    

//gh
//    public static boolean isValid(Tablero board, int square) {
//
//        if (square < 1 || square > 9) {
//            return false;
//        }
//
//        int row = (square - 1) / 3;
//        int col = (square - 1) % 3;
//
//        if (board.getBoard()[row][col].getValue() != 'X' && board.getBoard()[row][col].getValue() != 'O') {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public static boolean isWinningMovement(Tablero board, Player player) {
//
//        Casilla[][] squares = board.getBoard();
//        char playerSymbol = player.getPlayer();
//
//        boolean playerWon;
//
//        for (int row = 0; row < squares.length; row++) {
//            playerWon = true;
//            for (int col = 0; col < squares.length; col++) {
//                if (squares[row][col].getValue() != playerSymbol) {
//                    playerWon = false;
//                }
//            }
//            if (playerWon) {
//                return playerWon;
//            }
//        }
//
//        for (int col = 0; col < squares.length; col++) {
//            playerWon = true;
//            for (int row = 0; row < squares.length; row++) {
//                if (squares[row][col].getValue() != playerSymbol) {
//                    playerWon = false;
//                }
//            }
//            if (playerWon) {
//                return playerWon;
//            }
//        }
//
//        playerWon = true;
//        for (int rowCol = 0; rowCol < squares.length; rowCol++) {
//            if (squares[rowCol][rowCol].getValue() != playerSymbol) {
//                playerWon = false;
//            }
//        }
//        if (playerWon) {
//            return playerWon;
//        }
//
//        playerWon = true;
//        for (int row = 0; row < squares.length; row++) {
//            if (squares[row][((squares.length - row - 1) % squares.length)].getValue() != playerSymbol) {
//                playerWon = false;
//            }
//        }
//
//        return playerWon;
//    }
    
}
