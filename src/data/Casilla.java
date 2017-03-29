package data;

import data.*;

public class Casilla {
    
    private int row;
    private int col;
    private int value;
    private int determinante;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
    
    @Override
    public String toString() {
        return " . ";
    }    
    
    public String toString(int a) {
        return "+++";
    } 
    
    public String toString(Enemigo enemigo) {
        return "+"+enemigo+"ù";
    }
    
    public String toString(Torre torre) {
        return "/"+ torre +"\\";          
    }

    public Casilla(int row, int col, int value) {
            this.row = row;
            this.col = col;
            this.value = value; 
            this.determinante = 0;
    }    
    
    public Casilla(int row, int col, int value, int determinante) {
            this.row = row;
            this.col = col;
            this.value = value; 
            this.determinante = determinante;
    }   

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getDeterminante() {
        return determinante;
    }

    public void setDeterminante(int determinante) {
        this.determinante = determinante;
    }


   
    
}