/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author peper
 */
public class DPS extends Campeon {
    
        private String tipoGolpe;//Si el DPS es a Distancia o Cuerpo a Cuerpo (Range/Mele)
        private int alcance;//Ya sea Range o Mele, el alcance de sus ataques
        private double celeridad;// Velocidad de golpeo. EJ: 1.00 = 1 ataque cada ronda
        private int dañoCritico;// % de daño critico
        private int probCritico;// prob en % de hacer un golpe critico
        private int penetracionArmadura;// % de reduccion de armadura
        private int golpe;//Daño por golpe

    public DPS(String tipoGolpe, int alcance, double celeridad, int dañoCritico, int probCritico, int penetracionArmadura, int golpe, String name, String faccion, int hp, int muertes, int exp, int nivel, int poder, int muertesEnemigas) {
        super(name, faccion, hp, muertes, exp, nivel, poder, muertesEnemigas);
        this.tipoGolpe = tipoGolpe;
        this.alcance = alcance;
        this.celeridad = celeridad;
        this.dañoCritico = dañoCritico;
        this.probCritico = probCritico;
        this.penetracionArmadura = penetracionArmadura;
        this.golpe = golpe;
    }

    public String getTipoGolpe() {
        return tipoGolpe;
    }

    public void setTipoGolpe(String tipoGolpe) {
        this.tipoGolpe = tipoGolpe;
    }

    public int getAlcance() {
        return alcance;
    }

    public void setAlcance(int alcance) {
        this.alcance = alcance;
    }

    public double getCeleridad() {
        return celeridad;
    }

    public void setCeleridad(double celeridad) {
        this.celeridad = celeridad;
    }

    public int getDañoCritico() {
        return dañoCritico;
    }

    public void setDañoCritico(int dañoCritico) {
        this.dañoCritico = dañoCritico;
    }

    public int getProbCritico() {
        return probCritico;
    }

    public void setProbCritico(int probCritico) {
        this.probCritico = probCritico;
    }

    public int getPenetracionArmadura() {
        return penetracionArmadura;
    }

    public void setPenetracionArmadura(int penetracionArmadura) {
        this.penetracionArmadura = penetracionArmadura;
    }

    public int getGolpe() {
        return golpe;
    }

    public void setGolpe(int golpe) {
        this.golpe = golpe;
    }
   

        
}
