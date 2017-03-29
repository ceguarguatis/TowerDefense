package data;

public class Jugador {

    private char player;
    private boolean humanPlayer;

    public Jugador(char player, boolean humanPlayer) {
        this.player = player;
        this.humanPlayer = humanPlayer;
    }

    public char getPlayer() {
        return player;
    }

    public void setPlayer(char player) {
        this.player = player;
    }

    public boolean isHumanPlayer() {
        return humanPlayer;
    }

    @Override
    public String toString() {

        String printPlayer = "I am the player "
                + String.valueOf(this.getPlayer()) + " and I am ";

        if (this.isHumanPlayer()) {
            printPlayer = printPlayer.concat("HUMAN");
        } else {
            printPlayer = printPlayer.concat("A ROBOT");
        }
        return printPlayer;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Jugador other = (Jugador) obj;
        if (this.player != other.player) {
            return false;
        }
        return true;
    }
}