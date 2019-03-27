
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jose
 */
public class Enemigo {

    private String nombre;
    private String rango;//Rango del enemigo(Habrá de muchos tipos)
    private int hp;
    private int defensa;
    private int golpe;
    private int nivel;//Influirá en los atributos hp/defensa/golpe
    private int exp;//Experiencia que concede al morir

    public Enemigo(String nombre, String rango, int hp, int defensa, int golpe, int nivel, int exp) {
        this.nombre = nombre;
        this.rango = rango;
        this.hp = hp;
        this.defensa = defensa;
        this.golpe = golpe;
        this.nivel = nivel;
        this.exp = exp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getGolpe() {
        return golpe;
    }

    public void setGolpe(int golpe) {
        this.golpe = golpe;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    //Métodos
    //Generar Enemigo Aleatorio
    public void generarEnemigo(String nombre) {
        Random rdn = new Random();
        this.nombre = nombre;
        this.hp = rdn.nextInt(1500) + 1000;
        this.defensa = rdn.nextInt(200) + 50;
        //Nivel en función de stats
        if (this.hp <= 1100 || this.defensa <= 100) {
            this.nivel = 1;
        } else if (this.hp <= 1200 || this.defensa <= 130) {
            this.nivel = 2;
        } else if (this.hp <= 1300 || this.defensa <= 140) {
            this.nivel = 3;
        } else if (this.hp <= 1400 || this.defensa <= 150) {
            this.nivel = 4;
        } else if (this.hp <= 1500 || this.defensa <= 200) {
            this.nivel = 5;
        }
        //Rango
        switch (this.nivel) {
            case 1:
                this.rango = "Recluta";
                break;
            case 2:
                this.rango = "Soldado";
                break;
            case 3:
                this.rango = "Guerrero";
                break;
            case 4:
                this.rango = "General";
                break;
            case 5:
                this.rango = "Elite";
                break;
        }

    }
}
