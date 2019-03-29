
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
    public void generarEnemigo(String nombre) {//Creacion de BOSS con atributos específicos
        Random rdn = new Random();
        super.setNombre(nombre);
        super.setHp(rdn.nextInt(10000) + 5000);
        super.setDefensa(rdn.nextInt(1500) + 500);
        super.setGolpe(rdn.nextInt(1000)+500);
        rage=0;
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
                super.setNombre("Normal");
                super.setExp(rdn.nextInt(400)+100);
                break;
            case 2:
                super.setNombre("Heroico");
                super.setExp(rdn.nextInt(600)+200);
                break;
            case 3:
                super.setRango("Mitico");
                super.setExp(rdn.nextInt(800)+300);
                break;
            case 4:
                super.setNombre("Mitico+");
                super.setExp(rdn.nextInt(1000)+400);
                break;
            case 5:
                super.setNombre("Mitico++");
                super.setExp(rdn.nextInt(1500)+500);
                break;
        }
       
        
        
    }
    public void Rabiar(){//Cuando el contador de rabia llega a 100, el boss entra en RABIAR
        if(rage == 100){
            super.setHp(super.getHp()+1000);
            super.setDefensa(super.getDefensa()+200);
            super.setGolpe(super.getGolpe()+200);
            this.rage=0;
            super.setRango("RABIAR");
            System.out.println("!!!!!!Cuidado!!!!!!!");
            System.out.println(super.getNombre()+" a entrado en RABIAR");
        }else {System.out.println("El boss no tiene la rabia suficiente");}
    }
    
    
    //Skills Boss
    
    public void temblor(Campeon enemigo){
        System.out.println(super.getNombre()+" golpea el suelo bajo sus pies y hace temblar todo");
        int tmp=super.getGolpe()-(enemigo.getArmadura()*10)/100;
        enemigo.setHp(tmp);
        System.out.println(enemigo.getName()+" sufre "+tmp+" puntos de daño" );
        int decrease = enemigo.getArmadura()-((super.getGolpe()*10)/100);
        enemigo.setArmadura(decrease);
        System.out.println(super.getNombre()+" reduce la defensa de "+enemigo.getName()+" en "+decrease+" puntos");
        
    }
    
   
}
