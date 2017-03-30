//JULIO JAVIER MUÑOZ
//juanquis
//listo papuya lo actualizo
//listo niggis
//prueba
package business;

import data.*;
import ui.*;
import business.*;

public class GameEngine {

//    private static Player player1;
//    private static Player player2;
//    private static Tablero boar d;
    public static void main(String[] args) {

        UIConsole.menuInicio();
        iniciar();

//       juankis startGame();
    }

    public static void iniciar() {

        int opcion = UIConsole.leerOpcion();
        while (opcion < 3 && opcion > 0) {

            if (opcion == 1) {
                empezarJuego();
            } else if (opcion == 2) {
                UIConsole.imprimirInformacion();
            }
            UIConsole.menuInicio();
            opcion = UIConsole.leerOpcion();
        }

    }

    private static void empezarJuego() {
        Tablero board = new Tablero();
        System.out.println(board);
        UIConsole.menuJuego();
        int opcion = UIConsole.leerOpcion();
        int numTorres = 0;
        while (opcion != 3) {
            if (opcion == 1) {
                System.out.println("escriba la posicion(fila): ");
                int rowTorre = UIConsole.leerOpcion();
                System.out.println("escriba la posicion(columna): ");
                int colTorre = UIConsole.leerOpcion();
                board.getTorres().add(new Torre(1, 1, 1, new Casilla(rowTorre, colTorre, 1, 3)));
                MovementHandler.ponerTorre(rowTorre, colTorre, board);
                System.out.println(board);

                System.out.println(new Torre(1, 1, 1, new Casilla(rowTorre, colTorre, 1, 3)).toString(1));
            } else if (opcion == 2) {
                int numEnemies = board.getOleada().size();
                for (int i = 0; i < numEnemies; i++) {
                    int numbCasilla = 0;
                    while (numbCasilla < board.getCamino().size()) {
                        MovementHandler.ponerCasilla(board, i, numbCasilla);
                        board.updateSquare(new Casilla(board.getOleada().get(i).getCasilla().getRow(), board.getOleada().get(i).getCasilla().getCol(), 1, 1));
                        MovementHandler.updateTablero(board, i);
                        for (int numEne = 0; numEne < board.getOleada().size(); numEne++) {
                            for (int numTorr = 0; numTorr < board.getTorres().size(); numTorr++) {
                                for (int numRan = 0; numRan < board.getTorres().get(numTorr).getRango().size(); numRan++) {

                                    if (board.getOleada().get(numEne).getCasilla().getRow() == board.getTorres().get(numTorr).getRango().get(numRan).getRow()
                                            && board.getOleada().get(numEne).getCasilla().getCol() == board.getTorres().get(numTorr).getRango().get(numRan).getCol()) {
                                        board.getOleada().get(numEne).setVida(board.getOleada().get(numEne).getVida() - board.getTorres().get(numTorr).getDaño());
                                    }
                                }
                            }
                        }try {
                
                Thread.sleep(500);
                System.out.println(board.getOleada().get(i).getCasilla().getRow());
                        System.out.println(board.getOleada().get(i).getCasilla().getCol());
                        System.out.println(board);
                        System.out.println(board.getOleada().get(i).toString(0));
                        numbCasilla++;
                
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
                        
                        if (board.getOleada().get(i).getVida() <= 0) {
                            break;
                        }
                    }

                }
                System.out.println(board.getOleada().get(0).toString(0));
                System.out.println(board.getOleada().get(1).toString(0));
                System.out.println(board.getOleada().get(2).toString(0));
                System.out.println(board.getOleada().get(3).toString(0));
                System.out.println(board.getOleada().get(4).toString(0));
            }

            UIConsole.menuJuego();
            opcion = UIConsole.leerOpcion();
        }
    }

//    private static void startGame() {
//
//        player1 = new Player('X', true);
//        player2 = new Player('O', false);
//        board = new Tablero();
//
//        UIConsole.printWelcome(player1, player2);
//
//        play();
//    }
//
//    private static void play() {
//
//        Player current = null;
//        boolean isTie = false;
//        boolean isWinner = false;
//
//        do {
//            current = getCurrentPlayer(current);
//            board = TurnController.playTurn(board, current);
//
//            if (MovementHandler.isWinningMovement(board, current)) {
//                UIConsole.printWinner(current);
//                isWinner = true;
//            } else {
//                if (!TurnController.existFreeSquares(board, player1, player2)) {
//                    UIConsole.printTie();
//                    isTie = true;
//                }
//            }
//
//        } while (!isWinner && !isTie);
//
//    }
//
//    private static Player getCurrentPlayer(Player current) {
//
//        if (current == null) {
//            return player1;
//        } else {
//            if (current == player1) {
//                return player2;
//            } else {
//                return player1;
//            }
//        }
//    }
}
