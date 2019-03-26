/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author peper
 */
public class TANK extends Campeon {

    private int defensa; //1000 puntos = 50% de reduccion de ataque
    private int esquivar; // prob de esquivar un ataque
    private int parada; //Prob de parar un ataque
    private int regVida;// Puntos de vida regenerados por turno
    private int aggro;// Recurso de los tankes. Si tienen más de 100 puntos de Aggro no se podrá atacar a otro campeón que no sea el. Cada golpe resta 50 puntos de Aggro

    public TANK(int defensa, int esquivar, int parada, int regVida, int aggro, String name, String faccion, int hp, int muertes, int exp, int nivel, int poder, int muertesEnemigas, int golpe) {
        super(name, faccion, hp, muertes, exp, nivel, poder, muertesEnemigas, golpe);
        this.defensa = defensa;
        this.esquivar = esquivar;
        this.parada = parada;
        this.regVida = regVida;
        this.aggro = aggro;
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

    //HABILIDADES GENÉRICAS
    //Generar Aggro
    public void GenerarAggro() {//Si tiene menos de 50 puntos de aggro general 100 y si tiene más 50
        if (aggro <= 50) {
            aggro += 100;
        } else {
            aggro += 50;
        }
    }

    //Aumentar defensa
    public void AumentarDefensa() {
        if (super.getHp() <= 500) {
            defensa += 100;
        } else {
            defensa += 50;
        }
    }

}
