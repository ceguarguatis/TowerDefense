//package tictactoe.business;
//
//import java.util.Random;
//import tictactoe.data.Board;
//import tictactoe.data.Player;
//import tictactoe.data.Square;
//import tictactoe.ui.UI;
//
//public class TurnController {
//
//    public static Board playTurn(Board board, Player player) {
//
//        int square;
//        boolean validMovement = false;
//        char playerSymbol;
//
//        playerSymbol = player.getPlayer();
//
//        do {
//
//            if (player.isHumanPlayer()) {
//                square = UI.askMovement(board, playerSymbol);
//            } else {
//                square = generateRobotMovement();
//            }
//            validMovement = MovementHandler.isValid(board, square);
//
//            if (!validMovement) {
//                UI.printError();
//            } else {
//                markBoard(board, square, playerSymbol);
//            }
//
//            UI.printBoard(board);
//
//        } while (!validMovement);
//
//        return board;
//    }
//
//    private static Board markBoard(Board board, int squareIndex, char symbol) {
//
//        Square square = new Square(squareIndex, symbol);
//        board.updateSquare(square);
//
//        return board;
//    }
//
//    public static boolean existFreeSquares(Board board, Player player1, Player player2) {
//
//        Square[][] charBoard = board.getBoard();
//        char player1Symbol = player1.getPlayer();
//        char player2Symbol = player2.getPlayer();
//
//        for (int row = 0; row < charBoard.length; row++) {
//            for (int col = 0; col < charBoard.length; col++) {
//                if (charBoard[row][col].getValue() != player1Symbol
//                        && charBoard[row][col].getValue() != player2Symbol) {
//                    return true;
//                }
//
//            }
//        }
//        return false;
//    }
//
//    private static int generateRobotMovement() {
//
//        Random randGenerator = new Random();
//        return randGenerator.nextInt(9) + 1;
//    }
//}
//
