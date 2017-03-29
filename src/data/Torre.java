
package data;
import java.util.*;

public class Torre {
    
    private int alcance;
    private int velocidad;
    private int precio;
    private Casilla casilla;
    private List<Casilla> rango;

    public Casilla getCasilla() {
        return casilla;
    }

    public void setCasilla(Casilla casilla) {
        this.casilla = casilla;
    }

    @Override
    public String toString() {
        return "^";
    }

    public Torre(int alcance, int velocidad, int precio, Casilla casilla) {
        this.alcance = alcance;
        this.velocidad = velocidad;
        this.precio = precio;
        this.casilla = casilla;
    }
    
    public Torre(int alcance, int velocidad, int precio) {
        this.alcance = alcance;
        this.velocidad = velocidad;
        this.precio = precio;
    }

    public int getAlcance() {
        return alcance;
    }

    public void setAlcance(int alcance) {
        this.alcance = alcance;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    
}