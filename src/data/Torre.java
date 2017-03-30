package data;

import java.util.*;

public class Torre {

    private int alcance;
    private int velocidad;
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

    public Torre(int alcance, int velocidad, int precio, Casilla casilla) {
        this.alcance = alcance;
        this.velocidad = velocidad;
        this.precio = precio;
        this.casilla = casilla;
        rango =new ArrayList<Casilla>();
        for (int i = 0; i < (4 * alcance) * (alcance + 1); i++) {
            if(alcance==1){
                this.rango.add(new Casilla(casilla.getRow()-1,casilla.getCol()-1,1));
                this.rango.add(new Casilla(casilla.getRow()-1,casilla.getCol(),1));
                this.rango.add(new Casilla(casilla.getRow()-1,casilla.getCol()+1,1));
                this.rango.add(new Casilla(casilla.getRow(),casilla.getCol()-1,1));
                this.rango.add(new Casilla(casilla.getRow(),casilla.getCol()+1,1));
                this.rango.add(new Casilla(casilla.getRow()+1,casilla.getCol()-1,1));
                this.rango.add(new Casilla(casilla.getRow()+1,casilla.getCol(),1));
                this.rango.add(new Casilla(casilla.getRow()+1,casilla.getCol()+1,1));
            }if(alcance==2){
            this.rango.add(new Casilla(casilla.getRow()-1,casilla.getCol()-1,1));
                this.rango.add(new Casilla(casilla.getRow()-1,casilla.getCol(),1));
                this.rango.add(new Casilla(casilla.getRow()-1,casilla.getCol()+1,1));
                this.rango.add(new Casilla(casilla.getRow(),casilla.getCol()-1,1));
                this.rango.add(new Casilla(casilla.getRow(),casilla.getCol()+1,1));
                this.rango.add(new Casilla(casilla.getRow()+1,casilla.getCol()-1,1));
                this.rango.add(new Casilla(casilla.getRow()+1,casilla.getCol(),1));
                this.rango.add(new Casilla(casilla.getRow()+1,casilla.getCol()+1,1));
                this.rango.add(new Casilla(casilla.getRow()-2,casilla.getCol()+1,1));
                this.rango.add(new Casilla(casilla.getRow()-2,casilla.getCol(),1));
                this.rango.add(new Casilla(casilla.getRow()-2,casilla.getCol()-1,1));
                this.rango.add(new Casilla(casilla.getRow()-2,casilla.getCol()+2,1));
                this.rango.add(new Casilla(casilla.getRow()-1,casilla.getCol()+2,1));
                this.rango.add(new Casilla(casilla.getRow(),casilla.getCol()+2,1));
                this.rango.add(new Casilla(casilla.getRow()+1,casilla.getCol()+2,1));
                this.rango.add(new Casilla(casilla.getRow()+2,casilla.getCol()+2,1));
                this.rango.add(new Casilla(casilla.getRow()+2,casilla.getCol()+1,1));
                this.rango.add(new Casilla(casilla.getRow()+2,casilla.getCol(),1));
                this.rango.add(new Casilla(casilla.getRow()+2,casilla.getCol()-1,1));
                this.rango.add(new Casilla(casilla.getRow()-2,casilla.getCol()-2,1));
                this.rango.add(new Casilla(casilla.getRow()-1,casilla.getCol()-2,1));
                this.rango.add(new Casilla(casilla.getRow(),casilla.getCol()-2,1));
                this.rango.add(new Casilla(casilla.getRow()+1,casilla.getCol()-2,1));
                this.rango.add(new Casilla(casilla.getRow()+2,casilla.getCol()-2,1));
            }
            if(alcance==3){
                this.rango.add(new Casilla(casilla.getRow()-3,casilla.getCol()+3,1));
                this.rango.add(new Casilla(casilla.getRow()-3,casilla.getCol()+2,1));
                this.rango.add(new Casilla(casilla.getRow()-3,casilla.getCol()+1,1));
                this.rango.add(new Casilla(casilla.getRow()-3,casilla.getCol(),1));
                this.rango.add(new Casilla(casilla.getRow()-3,casilla.getCol()-1,1));
                this.rango.add(new Casilla(casilla.getRow()-3,casilla.getCol()-2,1));
                this.rango.add(new Casilla(casilla.getRow()+3,casilla.getCol()-3,1));
                this.rango.add(new Casilla(casilla.getRow()+3,casilla.getCol()+3,1));
                this.rango.add(new Casilla(casilla.getRow()+3,casilla.getCol()+2,1));
                this.rango.add(new Casilla(casilla.getRow()+3,casilla.getCol()+1,1));
                this.rango.add(new Casilla(casilla.getRow()+3,casilla.getCol(),1));
                this.rango.add(new Casilla(casilla.getRow()+3,casilla.getCol()-1,1));
                this.rango.add(new Casilla(casilla.getRow()+3,casilla.getCol()-2,1));
                this.rango.add(new Casilla(casilla.getRow()+3,casilla.getCol()-3,1));
                this.rango.add(new Casilla(casilla.getRow()-2,casilla.getCol()+3,1));
                this.rango.add(new Casilla(casilla.getRow()-1,casilla.getCol()+3,1));
                this.rango.add(new Casilla(casilla.getRow(),casilla.getCol()+3,1));
                this.rango.add(new Casilla(casilla.getRow()+1,casilla.getCol()+3,1));
                this.rango.add(new Casilla(casilla.getRow()+2,casilla.getCol()+3,1));
                this.rango.add(new Casilla(casilla.getRow()-2,casilla.getCol()-3,1));
                this.rango.add(new Casilla(casilla.getRow()-1,casilla.getCol()-3,1));
                this.rango.add(new Casilla(casilla.getRow(),casilla.getCol()-3,1));
                this.rango.add(new Casilla(casilla.getRow()+1,casilla.getCol()-3,1));
                this.rango.add(new Casilla(casilla.getRow()+2,casilla.getCol()-3,1));
                 this.rango.add(new Casilla(casilla.getRow()-1,casilla.getCol()-1,1));
                this.rango.add(new Casilla(casilla.getRow()-1,casilla.getCol(),1));
                this.rango.add(new Casilla(casilla.getRow()-1,casilla.getCol()+1,1));
                this.rango.add(new Casilla(casilla.getRow(),casilla.getCol()-1,1));
                this.rango.add(new Casilla(casilla.getRow(),casilla.getCol()+1,1));
                this.rango.add(new Casilla(casilla.getRow()+1,casilla.getCol()-1,1));
                this.rango.add(new Casilla(casilla.getRow()+1,casilla.getCol(),1));
                this.rango.add(new Casilla(casilla.getRow()+1,casilla.getCol()+1,1));
                this.rango.add(new Casilla(casilla.getRow()-2,casilla.getCol()+1,1));
                this.rango.add(new Casilla(casilla.getRow()-2,casilla.getCol(),1));
                this.rango.add(new Casilla(casilla.getRow()-2,casilla.getCol()-1,1));
                this.rango.add(new Casilla(casilla.getRow()-2,casilla.getCol()+2,1));
                this.rango.add(new Casilla(casilla.getRow()-1,casilla.getCol()+2,1));
                this.rango.add(new Casilla(casilla.getRow(),casilla.getCol()+2,1));
                this.rango.add(new Casilla(casilla.getRow()+1,casilla.getCol()+2,1));
                this.rango.add(new Casilla(casilla.getRow()+2,casilla.getCol()+2,1));
                this.rango.add(new Casilla(casilla.getRow()+2,casilla.getCol()+1,1));
                this.rango.add(new Casilla(casilla.getRow()+2,casilla.getCol(),1));
                this.rango.add(new Casilla(casilla.getRow()+2,casilla.getCol()-1,1));
                this.rango.add(new Casilla(casilla.getRow()-2,casilla.getCol()-2,1));
                this.rango.add(new Casilla(casilla.getRow()-1,casilla.getCol()-2,1));
                this.rango.add(new Casilla(casilla.getRow(),casilla.getCol()-2,1));
                this.rango.add(new Casilla(casilla.getRow()+1,casilla.getCol()-2,1));
                this.rango.add(new Casilla(casilla.getRow()+2,casilla.getCol()-2,1));
                this.rango.add(new Casilla(casilla.getRow()-1,casilla.getCol()-1,1));
                this.rango.add(new Casilla(casilla.getRow()-1,casilla.getCol(),1));
                this.rango.add(new Casilla(casilla.getRow()-1,casilla.getCol()+1,1));
                this.rango.add(new Casilla(casilla.getRow(),casilla.getCol()-1,1));
                this.rango.add(new Casilla(casilla.getRow(),casilla.getCol()+1,1));
                this.rango.add(new Casilla(casilla.getRow()+1,casilla.getCol()-1,1));
                this.rango.add(new Casilla(casilla.getRow()+1,casilla.getCol(),1));
                this.rango.add(new Casilla(casilla.getRow()+1,casilla.getCol()+1,1));
                this.rango.add(new Casilla(casilla.getRow()-2,casilla.getCol()+1,1));
                this.rango.add(new Casilla(casilla.getRow()-2,casilla.getCol(),1));
                this.rango.add(new Casilla(casilla.getRow()-2,casilla.getCol()-1,1));
                this.rango.add(new Casilla(casilla.getRow()-2,casilla.getCol()+2,1));
                this.rango.add(new Casilla(casilla.getRow()-1,casilla.getCol()+2,1));
                this.rango.add(new Casilla(casilla.getRow(),casilla.getCol()+2,1));
                this.rango.add(new Casilla(casilla.getRow()+1,casilla.getCol()+2,1));
                this.rango.add(new Casilla(casilla.getRow()+2,casilla.getCol()+2,1));
                this.rango.add(new Casilla(casilla.getRow()+2,casilla.getCol()+1,1));
                this.rango.add(new Casilla(casilla.getRow()+2,casilla.getCol(),1));
                this.rango.add(new Casilla(casilla.getRow()+2,casilla.getCol()-1,1));
                this.rango.add(new Casilla(casilla.getRow()-2,casilla.getCol()-2,1));
                this.rango.add(new Casilla(casilla.getRow()-1,casilla.getCol()-2,1));
                this.rango.add(new Casilla(casilla.getRow(),casilla.getCol()-2,1));
                this.rango.add(new Casilla(casilla.getRow()+1,casilla.getCol()-2,1));
                this.rango.add(new Casilla(casilla.getRow()+2,casilla.getCol()-2,1));
            }
            
            
        }
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
