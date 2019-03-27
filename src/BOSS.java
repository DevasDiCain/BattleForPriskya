/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jose
 */
public class BOSS extends Enemigo {
    
        private int rage;//Contador para entrar en Rabiar
        private int objeto;//Nº de objeto que da si muere

    public BOSS(int rage, int objeto, String nombre, String rango, int hp, int defensa, int golpe, int nivel, int exp) {
        super(nombre, rango, hp, defensa, golpe, nivel, exp);
        this.rage = rage;
        this.objeto = objeto;
    }

    public int getRage() {
        return rage;
    }

    public void setRage(int rage) {
        this.rage = rage;
    }

    public int getObjeto() {
        return objeto;
    }

    public void setObjeto(int objeto) {
        this.objeto = objeto;
    }
        
}
