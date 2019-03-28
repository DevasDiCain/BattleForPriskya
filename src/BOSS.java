
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
        
    
    //Métodos heredados
    public void generarEnemigo(String nombre) {//Adaptado al BOSS
        Random rdn = new Random();
        super.setNombre(nombre);
        super.setHp(rdn.nextInt(10000) + 5000);
        super.setDefensa(rdn.nextInt(1500) + 500);
        super.setGolpe(rdn.nextInt(1000)+500);
        //Nivel en función de stats
        if (super.getHp() <= 6000 || super.getDefensa() <= 600 || super.getGolpe()<=600) {
            super.setNivel(1);
        } else if (super.getHp() <= 7000 || super.getDefensa() <= 730|| super.getGolpe()<=700) {
            super.setNivel(2);
        } else if (super.getHp() <= 8300 || super.getDefensa() <= 840|| super.getGolpe()<=750) {
            super.setNivel(3);
        } else if (super.getHp() <= 9400 || super.getDefensa() <= 890|| super.getGolpe()<=375) {
            super.setNivel(4);
        } else if (super.getHp() >= 9600 && super.getDefensa() <= 1000|| super.getGolpe()<=600 && super.getHp() >=1500) {
            super.setNivel(5);
        }
        //Rango
        switch (super.getNivel()) {
            case 1:
                super.setNombre("Recluta");
                super.setExp(rdn.nextInt(200)+100);
                break;
            case 2:
                super.setNombre("Soldado");
                super.setExp(rdn.nextInt(400)+200);
                break;
            case 3:
                super.setRango("Guerrero");
                super.setExp(rdn.nextInt(600)+300);
                break;
            case 4:
                super.setNombre("General");
                super.setExp(rdn.nextInt(800)+400);
                break;
            case 5:
                super.setNombre("Elite");
                super.setExp(rdn.nextInt(1000)+500);
                break;
        }
       
        
        
    }
}
