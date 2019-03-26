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
    private double celeridad;// Velocidad de golpeo. EJ: 1.00 = 1 ataque cada ronda
    private int dañoCritico;// % de daño critico
    private int probCritico;// prob en % de hacer un golpe critico
    private int penetracionArmadura;// % de reduccion de armadura
    private int energia; // Recurso necesario para atacar

    public DPS(String tipoGolpe, double celeridad, int dañoCritico, int probCritico, int penetracionArmadura, String name, String faccion, int hp, int muertes, int exp, int nivel, int poder, int muertesEnemigas, int golpe, int energia) {
        super(name, faccion, hp, muertes, exp, nivel, poder, muertesEnemigas, golpe);
        this.tipoGolpe = tipoGolpe;
        this.celeridad = celeridad;
        this.dañoCritico = dañoCritico;
        this.probCritico = probCritico;
        this.penetracionArmadura = penetracionArmadura;
        this.energia = energia;
    }

    public String getTipoGolpe() {
        return tipoGolpe;
    }

    public void setTipoGolpe(String tipoGolpe) {
        this.tipoGolpe = tipoGolpe;
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

    //HABILIDADES GENÉRICAS
    //Potenciar
    public void Potenciar() {
        if (energia > 100) {
            super.setGolpe(super.getGolpe() + ((super.getPoder() * 200) / 100));
            System.out.println("Golpe aumentado a " + super.getGolpe());
        } else {
            System.out.println("No hay energía suficiente");
        }
    }

}
