package Personajes.mobs;


import java.text.DecimalFormat;
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author José Rodríguez Fernández
 */
public abstract class Campeon {
    
    private String name;
    private String faccion;
    private int hp;//Puntos de vida
    private int exp;//Experiencia
    private int nivel;//Se empieza a LVL 1 y cada nivel requiere 100 de exp++ .. 1 nivel = 50 puntos de poder
    private int poder;//Cada 10 puntos de poder == +1 a todos los stats
    private int muertesEnemigas;// Bajas enemigas
    private int muertes;//Nº de veces que ha muerto
    private int golpe;//Daño por golpe
    private int armadura;//Reducción por armadura --- 1000= 50%de reduccion de daño
    private double celeridad;// Velocidad de golpeo. EJ: 1.00 = 1 ataque cada ronda

    public Campeon(String name, String faccion, int hp, int exp, int nivel, int poder, int muertesEnemigas, int muertes, int golpe, int armadura, double celeridad) {
        this.name = name;
        this.faccion = faccion;
        this.hp = hp;
        this.exp = exp;
        this.nivel = nivel;
        this.poder = poder;
        this.muertesEnemigas = muertesEnemigas;
        this.muertes = muertes;
        this.golpe = golpe;
        this.armadura = armadura;
        this.celeridad = celeridad;
    }

    public double getCeleridad() {
        return celeridad;
    }

    public void setCeleridad(double celeridad) {
        this.celeridad = celeridad;
    }

  
    

    public int getGolpe() {
        return golpe;
    }

    public void setGolpe(int golpe) {
        this.golpe = golpe;
    }

    public int getMuertesEnemigas() {
        return muertesEnemigas;
    }

    public void setMuertesEnemigas(int muertesEnemigas) {
        this.muertesEnemigas = muertesEnemigas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaccion() {
        return faccion;
    }

    public void setFaccion(String faccion) {
        this.faccion = faccion;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMuertes() {
        return muertes;
    }

    public void setMuertes(int muertes) {
        this.muertes = muertes;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public int getArmadura() {
        return armadura;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + Objects.hashCode(this.name);
        hash = 13 * hash + Objects.hashCode(this.faccion);
        hash = 13 * hash + this.hp;
        hash = 13 * hash + this.muertes;
        hash = 13 * hash + this.exp;
        hash = 13 * hash + this.nivel;
        hash = 13 * hash + this.poder;
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
        final Campeon other = (Campeon) obj;
        if (this.hp != other.hp) {
            return false;
        }
        if (this.muertes != other.muertes) {
            return false;
        }
        if (this.exp != other.exp) {
            return false;
        }
        if (this.nivel != other.nivel) {
            return false;
        }
        if (this.poder != other.poder) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.faccion, other.faccion)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return  name + "\n"+"---------------------"+"\n Faccion ------> " + faccion + "\n HP -----------> " + hp + "\n Muertes ------> " + muertes + "\n EXP ----------> " + exp + "\n Nivel --------> " + nivel + "\n Poder --------> " + poder +"\n Golpe --------> "+golpe+" puntos \n Armadura------> "+armadura+" puntos \n Celeridad---> "+df.format(celeridad)+"\n --------------------";
    }
    
    
    //Métodos 
    //Habilidades GENÉRICAS
    
    //Golpear a Campeon
    public abstract void Golpear(Campeon enemigo);
    
    //Golpear a Enemigo
    public abstract void GolpearMOB(Enemigo enemigo);
    
    //Matar al enemigo (Otorga exp y Sube de nivel si cumple los requisitos)
    public abstract void MatarMOB(Enemigo enemigo);
}
