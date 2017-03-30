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
        System.out.println(".-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
        System.out.println("Bienvenido a tower defense, seleccione alguna opciòn ");
        System.out.println(".-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
        System.out.println("1.Empezar juego");
        System.out.println("2. Informacion");
        System.out.println("3. Salir");
        System.out.println("_.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.");
    }

    public static void menuJuego() {
        System.out.println(" Seleccione una opciòn");
        System.out.println("1.Poner torre");
        System.out.println("2. Continuar(empezar horda)");
        System.out.println("3. Salir");
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
        System.out.println("INFORMACION");
        System.out.println("|_-|-_|-|_-|-_||_-|-_|-|_-|-_||_-|-_|-|_-|-_||_-|-_|-|_-|-_||_-|-_|-|_-|-_||_-");
        System.out.printf("%73s\n", "Bienvenido sea jugador, esperamos que este comodo para poder apreciar el");
        System.out.printf("%73s\n", " mejor juego  tipo  tower  defense en   fase de   desarrollo, hecho por sus");
        System.out.printf("%73s\n", "programadores  favoritos  ,por  el momento podra disfrutar del tablero,");
        System.out.printf("%73s\n", "el  primer  tipo  de  edificio, y  la  primera  clase de  enemigos ,");
        System.out.printf("%73s\n", "esperamos que sea de  su gusto");
        System.out.println("|_-|-_|-|_-|-_||_-|-_|-|_-|-_||_-|-_|-|_-|-_||_-|-_|-|_-|-_||_-|-_|-|_-|-_||_-");
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
