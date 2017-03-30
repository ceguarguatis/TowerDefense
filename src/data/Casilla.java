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

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Casilla other = (Casilla) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.col != other.col) {
            return false;
        }
        return true;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
    
    @Override
    public String toString() {
        return " . ";
    }  
    
    public String toString(char j) {
        return " . "+row+col;
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