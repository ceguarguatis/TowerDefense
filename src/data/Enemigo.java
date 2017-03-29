
package data;
import java.util.*;


public class Enemigo {
    
    private int velocidad;
    private int vida;
    private int valor;
    private Casilla casilla;
    
    @Override
    public String toString() {
        return ":";
    }

    public Casilla getCasilla() {
        return casilla;
    }

    public void setCasilla(Casilla casilla) {
        this.casilla = casilla;
    }

    public Enemigo(int velocidad, int vida, int valor,Casilla casilla) {
        this.velocidad = velocidad;
        this.vida = vida;
        this.valor = valor;
        this.casilla = casilla;

    }
    
    public Enemigo(int velocidad, int vida, int valor) {
        this.velocidad = velocidad;
        this.vida = vida;
        this.valor = valor;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }



}
