package data;

import java.util.*;

public class Torre {

    private int alcance;
    private int daño;
    private int precio;
    private Casilla casilla;
    private List<Casilla> rango;

    public List<Casilla> getRango() {
        return rango;
    }

    public void setRango(List<Casilla> rango) {
        this.rango = rango;
    }

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
    
    public String toString(int a) {
        String palabra="";
        for(int i=0;i<rango.size();i++){
            palabra = palabra.concat(rango.get(i).toString('f'));
        }
       return palabra;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Torre other = (Torre) obj;
        if (!Objects.equals(this.casilla, other.casilla)) {
            return false;
        }
        return true;
    }

    public Torre(int alcance, int daño, int precio, Casilla casilla) {
        this.alcance = alcance;
        this.daño = daño;
        this.precio = precio;
        this.casilla = casilla;
        rango = new ArrayList<Casilla>();
            if (alcance == 1) {
                this.rango.add(new Casilla(casilla.getRow() - 1, casilla.getCol() - 1, 1));
                this.rango.add(new Casilla(casilla.getRow() - 1, casilla.getCol(), 1));
                this.rango.add(new Casilla(casilla.getRow() - 1, casilla.getCol() + 1, 1));
                this.rango.add(new Casilla(casilla.getRow(), casilla.getCol() - 1, 1));
                this.rango.add(new Casilla(casilla.getRow(), casilla.getCol() + 1, 1));
                this.rango.add(new Casilla(casilla.getRow() + 1, casilla.getCol() - 1, 1));
                this.rango.add(new Casilla(casilla.getRow() + 1, casilla.getCol(), 1));
                this.rango.add(new Casilla(casilla.getRow() + 1, casilla.getCol() + 1, 1));
            }
            if (alcance == 2) {
                this.rango.add(new Casilla(casilla.getRow() - 1, casilla.getCol() - 1, 1));
                this.rango.add(new Casilla(casilla.getRow() - 1, casilla.getCol(), 1));
                this.rango.add(new Casilla(casilla.getRow() - 1, casilla.getCol() + 1, 1));
                this.rango.add(new Casilla(casilla.getRow(), casilla.getCol() - 1, 1));
                this.rango.add(new Casilla(casilla.getRow(), casilla.getCol() + 1, 1));
                this.rango.add(new Casilla(casilla.getRow() + 1, casilla.getCol() - 1, 1));
                this.rango.add(new Casilla(casilla.getRow() + 1, casilla.getCol(), 1));
                this.rango.add(new Casilla(casilla.getRow() + 1, casilla.getCol() + 1, 1));
                this.rango.add(new Casilla(casilla.getRow() - 2, casilla.getCol() + 1, 1));
                this.rango.add(new Casilla(casilla.getRow() - 2, casilla.getCol(), 1));
                this.rango.add(new Casilla(casilla.getRow() - 2, casilla.getCol() - 1, 1));
                this.rango.add(new Casilla(casilla.getRow() - 2, casilla.getCol() + 2, 1));
                this.rango.add(new Casilla(casilla.getRow() - 1, casilla.getCol() + 2, 1));
                this.rango.add(new Casilla(casilla.getRow(), casilla.getCol() + 2, 1));
                this.rango.add(new Casilla(casilla.getRow() + 1, casilla.getCol() + 2, 1));
                this.rango.add(new Casilla(casilla.getRow() + 2, casilla.getCol() + 2, 1));
                this.rango.add(new Casilla(casilla.getRow() + 2, casilla.getCol() + 1, 1));
                this.rango.add(new Casilla(casilla.getRow() + 2, casilla.getCol(), 1));
                this.rango.add(new Casilla(casilla.getRow() + 2, casilla.getCol() - 1, 1));
                this.rango.add(new Casilla(casilla.getRow() - 2, casilla.getCol() - 2, 1));
                this.rango.add(new Casilla(casilla.getRow() - 1, casilla.getCol() - 2, 1));
                this.rango.add(new Casilla(casilla.getRow(), casilla.getCol() - 2, 1));
                this.rango.add(new Casilla(casilla.getRow() + 1, casilla.getCol() - 2, 1));
                this.rango.add(new Casilla(casilla.getRow() + 2, casilla.getCol() - 2, 1));
            }
            if (alcance == 3) {
                this.rango.add(new Casilla(casilla.getRow() - 3, casilla.getCol() + 3, 1));
                this.rango.add(new Casilla(casilla.getRow() - 3, casilla.getCol() + 2, 1));
                this.rango.add(new Casilla(casilla.getRow() - 3, casilla.getCol() + 1, 1));
                this.rango.add(new Casilla(casilla.getRow() - 3, casilla.getCol(), 1));
                this.rango.add(new Casilla(casilla.getRow() - 3, casilla.getCol() - 1, 1));
                this.rango.add(new Casilla(casilla.getRow() - 3, casilla.getCol() - 2, 1));
                this.rango.add(new Casilla(casilla.getRow() + 3, casilla.getCol() - 3, 1));
                this.rango.add(new Casilla(casilla.getRow() + 3, casilla.getCol() + 3, 1));
                this.rango.add(new Casilla(casilla.getRow() + 3, casilla.getCol() + 2, 1));
                this.rango.add(new Casilla(casilla.getRow() + 3, casilla.getCol() + 1, 1));
                this.rango.add(new Casilla(casilla.getRow() + 3, casilla.getCol(), 1));
                this.rango.add(new Casilla(casilla.getRow() + 3, casilla.getCol() - 1, 1));
                this.rango.add(new Casilla(casilla.getRow() + 3, casilla.getCol() - 2, 1));
                this.rango.add(new Casilla(casilla.getRow() + 3, casilla.getCol() - 3, 1));
                this.rango.add(new Casilla(casilla.getRow() - 2, casilla.getCol() + 3, 1));
                this.rango.add(new Casilla(casilla.getRow() - 1, casilla.getCol() + 3, 1));
                this.rango.add(new Casilla(casilla.getRow(), casilla.getCol() + 3, 1));
                this.rango.add(new Casilla(casilla.getRow() + 1, casilla.getCol() + 3, 1));
                this.rango.add(new Casilla(casilla.getRow() + 2, casilla.getCol() + 3, 1));
                this.rango.add(new Casilla(casilla.getRow() - 2, casilla.getCol() - 3, 1));
                this.rango.add(new Casilla(casilla.getRow() - 1, casilla.getCol() - 3, 1));
                this.rango.add(new Casilla(casilla.getRow(), casilla.getCol() - 3, 1));
                this.rango.add(new Casilla(casilla.getRow() + 1, casilla.getCol() - 3, 1));
                this.rango.add(new Casilla(casilla.getRow() + 2, casilla.getCol() - 3, 1));
                this.rango.add(new Casilla(casilla.getRow() - 1, casilla.getCol() - 1, 1));
                this.rango.add(new Casilla(casilla.getRow() - 1, casilla.getCol(), 1));
                this.rango.add(new Casilla(casilla.getRow() - 1, casilla.getCol() + 1, 1));
                this.rango.add(new Casilla(casilla.getRow(), casilla.getCol() - 1, 1));
                this.rango.add(new Casilla(casilla.getRow(), casilla.getCol() + 1, 1));
                this.rango.add(new Casilla(casilla.getRow() + 1, casilla.getCol() - 1, 1));
                this.rango.add(new Casilla(casilla.getRow() + 1, casilla.getCol(), 1));
                this.rango.add(new Casilla(casilla.getRow() + 1, casilla.getCol() + 1, 1));
                this.rango.add(new Casilla(casilla.getRow() - 2, casilla.getCol() + 1, 1));
                this.rango.add(new Casilla(casilla.getRow() - 2, casilla.getCol(), 1));
                this.rango.add(new Casilla(casilla.getRow() - 2, casilla.getCol() - 1, 1));
                this.rango.add(new Casilla(casilla.getRow() - 2, casilla.getCol() + 2, 1));
                this.rango.add(new Casilla(casilla.getRow() - 1, casilla.getCol() + 2, 1));
                this.rango.add(new Casilla(casilla.getRow(), casilla.getCol() + 2, 1));
                this.rango.add(new Casilla(casilla.getRow() + 1, casilla.getCol() + 2, 1));
                this.rango.add(new Casilla(casilla.getRow() + 2, casilla.getCol() + 2, 1));
                this.rango.add(new Casilla(casilla.getRow() + 2, casilla.getCol() + 1, 1));
                this.rango.add(new Casilla(casilla.getRow() + 2, casilla.getCol(), 1));
                this.rango.add(new Casilla(casilla.getRow() + 2, casilla.getCol() - 1, 1));
                this.rango.add(new Casilla(casilla.getRow() - 2, casilla.getCol() - 2, 1));
                this.rango.add(new Casilla(casilla.getRow() - 1, casilla.getCol() - 2, 1));
                this.rango.add(new Casilla(casilla.getRow(), casilla.getCol() - 2, 1));
                this.rango.add(new Casilla(casilla.getRow() + 1, casilla.getCol() - 2, 1));
                this.rango.add(new Casilla(casilla.getRow() + 2, casilla.getCol() - 2, 1));
                this.rango.add(new Casilla(casilla.getRow() - 1, casilla.getCol() - 1, 1));
                this.rango.add(new Casilla(casilla.getRow() - 1, casilla.getCol(), 1));
                this.rango.add(new Casilla(casilla.getRow() - 1, casilla.getCol() + 1, 1));
                this.rango.add(new Casilla(casilla.getRow(), casilla.getCol() - 1, 1));
                this.rango.add(new Casilla(casilla.getRow(), casilla.getCol() + 1, 1));
                this.rango.add(new Casilla(casilla.getRow() + 1, casilla.getCol() - 1, 1));
                this.rango.add(new Casilla(casilla.getRow() + 1, casilla.getCol(), 1));
                this.rango.add(new Casilla(casilla.getRow() + 1, casilla.getCol() + 1, 1));
                this.rango.add(new Casilla(casilla.getRow() - 2, casilla.getCol() + 1, 1));
                this.rango.add(new Casilla(casilla.getRow() - 2, casilla.getCol(), 1));
                this.rango.add(new Casilla(casilla.getRow() - 2, casilla.getCol() - 1, 1));
                this.rango.add(new Casilla(casilla.getRow() - 2, casilla.getCol() + 2, 1));
                this.rango.add(new Casilla(casilla.getRow() - 1, casilla.getCol() + 2, 1));
                this.rango.add(new Casilla(casilla.getRow(), casilla.getCol() + 2, 1));
                this.rango.add(new Casilla(casilla.getRow() + 1, casilla.getCol() + 2, 1));
                this.rango.add(new Casilla(casilla.getRow() + 2, casilla.getCol() + 2, 1));
                this.rango.add(new Casilla(casilla.getRow() + 2, casilla.getCol() + 1, 1));
                this.rango.add(new Casilla(casilla.getRow() + 2, casilla.getCol(), 1));
                this.rango.add(new Casilla(casilla.getRow() + 2, casilla.getCol() - 1, 1));
                this.rango.add(new Casilla(casilla.getRow() - 2, casilla.getCol() - 2, 1));
                this.rango.add(new Casilla(casilla.getRow() - 1, casilla.getCol() - 2, 1));
                this.rango.add(new Casilla(casilla.getRow(), casilla.getCol() - 2, 1));
                this.rango.add(new Casilla(casilla.getRow() + 1, casilla.getCol() - 2, 1));
                this.rango.add(new Casilla(casilla.getRow() + 2, casilla.getCol() - 2, 1));
            }

        
    }

    public Torre(int alcance, int daño, int precio) {
        this.alcance = alcance;
        this.daño = daño;
        this.precio = precio;
    }

    public int getAlcance() {
        return alcance;
    }

    public void setAlcance(int alcance) {
        this.alcance = alcance;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

}
