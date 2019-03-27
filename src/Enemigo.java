
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

    public Enemigo(){};
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

    @Override
    public String toString() {
        return "Enemigo("+ nombre + ")\n ---------- \n Rango----> " + rango + "\n Hp-------> " + hp + " puntos \n Defensa--> " + defensa + " puntos \n Golpe----> " + golpe + " puntos \n Nivel----> " + nivel + "\n Exp------> " + exp + " puntos";
    }
    

    //Métodos
    //Generar Enemigo Aleatorio
    public void generarEnemigo(String nombre) {
        Random rdn = new Random();
        this.nombre = nombre;
        this.hp = rdn.nextInt(1500) + 1000;
        this.defensa = rdn.nextInt(200) + 50;
        this.golpe= rdn.nextInt(600)+50;
        this.exp= rdn.nextInt(150)+50;
        //Nivel en función de stats
        if (this.hp <= 1100 || this.defensa <= 100 || this.golpe<=100) {
            this.nivel = 1;
        } else if (this.hp <= 1200 || this.defensa <= 130|| this.golpe<=125) {
            this.nivel = 2;
        } else if (this.hp <= 1300 || this.defensa <= 140|| this.golpe<=250) {
            this.nivel = 3;
        } else if (this.hp <= 1400 || this.defensa <= 150|| this.golpe<=375) {
            this.nivel = 4;
        } else if (this.hp <= 1500 || this.defensa <= 200|| this.golpe<=600) {
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
    
    //Golpear enemigo
    public void Golpear(Campeon enemigo){
        int tmp = golpe-((enemigo.getArmadura()*1)/100);
        enemigo.setHp(enemigo.getHp()-tmp);
        System.out.println(nombre+" ha golpeado a "+enemigo.getName()+" realizandole "+tmp+" puntos de daño.");
    }
}
