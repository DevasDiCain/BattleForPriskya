package Personajes.mobs;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author peper
 */
public class HEALER {
    
        private int curacion; // Puntos de vida curados por rondas
        private int mana; // Recurso para utilizar "habilidades"/ cada habilidad requerirá una cantidad de mana
        private int resurreciones; // Cantidad de resurreciones restantes

    public HEALER(int curacion, int mana, int resurreciones) {
        this.curacion = curacion;
        this.mana = mana;
        this.resurreciones = resurreciones;
    }

    public int getCuracion() {
        return curacion;
    }

    public void setCuracion(int curacion) {
        this.curacion = curacion;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getResurreciones() {
        return resurreciones;
    }

    public void setResurreciones(int resurreciones) {
        this.resurreciones = resurreciones;
    }
        
}
