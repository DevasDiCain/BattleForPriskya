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
    
    public int getAggro() {
        return aggro;
    }

    public void setAggro(int aggro) {
        this.aggro = aggro;
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
    public void AumentarDefensa() {//Si tiene menos de un 50% de los HP aumentará su defensa un 100% y si no un 50%
        if (super.getHp() <= (super.getHp()*50)/100) {
            int tmp= (defensa*100)/100;
            defensa += tmp;
            System.out.println("Defensa aumentada a "+defensa+" puntos");
        } else {
            int tmp = (defensa*50)/100;
            defensa +=tmp;
            System.out.println("Defensa aumentada a "+defensa+" puntos");
        }
    }

    //Aumentar vida
    public void AumentarVida() {//Si tiene menos de un 25% de los HP aumentará estos en 1000% y si no un 200%
        if (super.getHp() <= (super.getHp()*25)/100) {
            super.setHp((super.getHp() * 500) / 100);
            System.out.println("Vida aumentada a "+super.getHp()+" HP");
        } else {
            super.setHp((super.getHp() * 200) / 100);
            System.out.println("Vida aumentada a "+super.getHp()+ " HP");
        }
    }
    
}
