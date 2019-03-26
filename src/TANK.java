/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author peper
 */
public class TANK {
    
     private int defensa; //1000 puntos = 50% de reduccion de ataque
     private int esquivar; // prob de esquivar un ataque
     private int parada; //Prob de parar un ataque
     private int regVida;// Puntos de vida regenerados por turno

    public TANK(int defensa, int esquivar, int parada, int regVida) {
        this.defensa = defensa;
        this.esquivar = esquivar;
        this.parada = parada;
        this.regVida = regVida;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getEsquivar() {
        return esquivar;
    }

    public void setEsquivar(int esquivar) {
        this.esquivar = esquivar;
    }

    public int getParada() {
        return parada;
    }

    public void setParada(int parada) {
        this.parada = parada;
    }

    public int getRegVida() {
        return regVida;
    }

    public void setRegVida(int regVida) {
        this.regVida = regVida;
    }
     
     
}
