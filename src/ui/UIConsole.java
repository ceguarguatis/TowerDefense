package ui;

import java.util.Scanner;
import data.Tablero;
import data.Jugador;

public class UIConsole {
//
//    private static String lineDecorator = "xoXOxo xoXOxo oxoX-Oxox xoXOxo xoXOxo";

    private static Scanner reader = new Scanner(System.in);

    public static void menuInicio() {
        System.out.println("MENU DE INICIO");
        System.out.println("bienvenido que quiere hacer?");
        System.out.println("1.empezar juego");
        System.out.println("2. informacion");
        System.out.println("3. salir");
    }

    public static void menuJuego() {
        System.out.println(" que quiere hacer?");
        System.out.println("1.poner torre");
        System.out.println("2. continuar");
        System.out.println("3. salir");
    }

    public static int leerOpcion() {
        int a = reader.nextInt();
        return a;
    }

    public static void printBoard(Tablero board) {
        System.out.println(board);
    }

    public static void imprimirInformacion() {
        System.out.println();
        System.out.println("#########################################################################");
        System.out.printf("%73s\n", "bienvenido sea jugador, le presento le nuevo juego");
        System.out.printf("%73s\n", "en fase de desarrollo, desarrollado por");
        System.out.printf("%73s\n", "nosotros, sus desarrolladores favoritos; por el momento");
        System.out.printf("%73s\n", "solo podra visualizar un tablero, el cual muestra por donde va");
        System.out.printf("%73s\n", "nuestro camino");
        System.out.println("#########################################################################");
        System.out.println();
    }

//    public static void printWelcome(Jugador player1, Jugador player2) {
//        System.out.println(lineDecorator);
//        System.out.println("xoXOxo xoXOxo TicTacToe xoXOxo xoXOxo");
//        System.out.println(lineDecorator);
//
//        System.out.println();
//
//        System.out.println(player1);
//        System.out.println(player2);
//
//        System.out.println();
//        System.out.println(lineDecorator);
//        System.out.println("\nPlayer " + player1.getPlayer() + " starts");
//
//    }
//
//    public static int askMovement(Tablero board, char player) {
//
//        printBoard(board);
//
//        System.out.println("Jugador " + player + " turn ");
//        System.out.println("Select the square to play and press the enter key: ");
//
//        return reader.nextInt();
//    }
//
//    public static void printError() {
//        System.out.println("\n\tPLEASE TRY AGAIN");
//    }
//
//
//    public static void printWinner(Jugador player) {
//        System.out.println(lineDecorator);
//        System.out.println(lineDecorator);
//        System.out.println();
//        System.out.println("\t Winner is player " + player.getPlayer());
//        System.out.println();
//        System.out.println(lineDecorator);
//        System.out.println(lineDecorator);
//    }
//
//    public static void printTie() {
//        System.out.println(lineDecorator);
//        System.out.println(lineDecorator);
//        System.out.println();
//        System.out.println("\t\t TIE");
//        System.out.println();
//        System.out.println(lineDecorator);
//        System.out.println(lineDecorator);
//    }
//    
}
