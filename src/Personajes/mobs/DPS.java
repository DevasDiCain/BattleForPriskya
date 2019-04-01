package Personajes.mobs;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author José Rodríguez Fernández
 */
public class DPS extends Campeon {

    private String tipoGolpe;//Si el DPS es a Distancia o Cuerpo a Cuerpo (Range/Mele)
    private int dañoCritico;// % de daño critico
    private int probCritico;// prob en % de hacer un golpe critico
    private int penetracionArmadura;// % de reduccion de armadura
    private int energia; // Recurso necesario para atacar

    public DPS(String tipoGolpe, int dañoCritico, int probCritico, int penetracionArmadura, int energia, String name, String faccion, int hp, int exp, int nivel, int poder, int muertesEnemigas, int muertes, int golpe, int armadura, double celeridad) {
        super(name, faccion, hp, exp, nivel, poder, muertesEnemigas, muertes, golpe, armadura, celeridad);
        this.tipoGolpe = tipoGolpe;
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

    public String infoDPS() {
        return "DPS/INFO \n------------" + "\n Tipo=" + tipoGolpe  + "\n DañoCritico=" + dañoCritico + " Puntos" + "\n ProbCritico=" + probCritico + " Puntos" + "\n PenetracionArmadura=" + penetracionArmadura + " Puntos" + "\n Energia= " + energia + " Puntos" + "\n------------";
    }

    //HABILIDADES GENÉRICAS
    //Potenciar
    public int Potenciar() {
        int tmp = ((super.getGolpe() * 50) / 100);
        if (energia > 100) {
            super.setGolpe(super.getGolpe() + tmp);
            System.out.println(super.getName() + " aumenta su golpe   " + tmp + " puntos ");
        } else {
            System.out.println("No hay energía suficiente");
        }
        return tmp;
    }
    
    //Ruptura
    public void Ruptura(Enemigo enemigo){
        int tmp = (super.getGolpe()*110)/100;
        int sangrado = (super.getGolpe()*40)/100;
        enemigo.setHp(enemigo.getHp()-tmp);
        System.out.println(super.getName()+" desgarra a su rival inflingiendole "+tmp+" puntos de vida");
        System.out.println(super.getName()+" aplica efectos de Sangrado a "+enemigo.getNombre()+" inflingiendole "+sangrado+" puntos de vida cada turno");
    }

    //Polimorfismo
    @Override
    public void Golpear(Campeon enemigo) {//DPS golpear se ve afectado por el 10% de la armadura enemiga
        int tmp = (super.getGolpe() - (enemigo.getArmadura() * 10) / 100);
        enemigo.setHp(enemigo.getHp() - tmp);
        System.out.println(super.getName() + " golpea a " + enemigo.getName() + " inflingiendole " + tmp + " puntos de vida");
        if(super.getGolpe()>1000){System.out.println("Efectos de Potenciar desvaneciedose");
        super.setGolpe(super.getGolpe()-Potenciar());
        }
    }

    @Override
    public void GolpearMOB(Enemigo enemigo) {
        int tmp = (super.getGolpe() - (enemigo.getDefensa() * 10) / 100);
        enemigo.setHp(enemigo.getHp() - tmp);
        System.out.println(super.getName() + " golpea a " + enemigo.getNombre() + " inflingiendole " + tmp + " puntos de vida");
        if(super.getGolpe()>1000){System.out.println("Efectos de Potenciar desvaneciedose");
        super.setGolpe(super.getGolpe()-Potenciar());
        }
    }

    //Matar al enemigo (Otorga exp y Sube de nivel si cumple los requisitos)
    @Override
    public void MatarMOB(Enemigo enemigo) {
        if (enemigo.getHp() <= 0) {
            System.out.println(super.getName() + " ha derrotado a " + enemigo.getNombre() + "\n" + super.getName() + "Recibe " + enemigo.getExp() + " puntos de EXP");
            super.setExp(enemigo.getExp());
            if (super.getExp() >= 100 && super.getExp() < 200) {
                super.setNivel(2);
                System.out.println("Enhorabuena has subido al nivel " + super.getNivel());
                System.out.println("------------");
                super.setGolpe(super.getGolpe() + 100);
                super.setHp(super.getHp() + 300);
                super.setMuertes(super.getMuertes() + 1);
                super.setArmadura(super.getArmadura()+100);
                System.out.println("I-------------------------------------------I");
                System.out.println("I  Se ha aumentado el golpe en 100 puntos   I");
                System.out.println("I  Se ha aumentado los HP en 300 puntos     I");
                System.out.println("I  Se ha aumentado la armadura en 100 puntosI");
                System.out.println("I-------------------------------------------I");
            } else if (super.getExp() >= 200 && super.getExp() < 400) {
                super.setNivel(3);
                System.out.println("Enhorabuena has subido al nivel " + super.getNivel());
                super.setGolpe(super.getGolpe() + 100);
                super.setHp(super.getHp() + 300);
                super.setMuertes(super.getMuertes() + 1);
                super.setArmadura(super.getArmadura()+200);
                  System.out.println("Se ha aumentado el golpe en 100 puntos");
                System.out.println("Se ha aumentado los HP en 300 puntos");
                System.out.println("Se ha aumentado la armadura en 200 puntos");
            } else if (super.getExp() >= 400 && super.getExp() < 700) {
                super.setNivel(4);
                System.out.println("Enhorabuena has subido al nivel " + super.getNivel());
                super.setGolpe(super.getGolpe() + 100);
                super.setHp(super.getHp() + 300);
                super.setMuertes(super.getMuertes() + 1);
                super.setArmadura(super.getArmadura()+300);
                  System.out.println("Se ha aumentado el golpe en 100 puntos");
                System.out.println("Se ha aumentado los HP en 300 puntos");
                System.out.println("Se ha aumentado la armadura en 300 puntos");
            } else if (super.getExp() >= 700 && super.getExp() < 1100) {
                super.setNivel(5);
                System.out.println("Enhorabuena has subido al nivel " + super.getNivel());
                super.setGolpe(super.getGolpe() + 150);
                super.setHp(super.getHp() + 400);
                super.setMuertes(super.getMuertes() + 1);
                super.setArmadura(super.getArmadura()+400);
                  System.out.println("Se ha aumentado el golpe en 150 puntos");
                System.out.println("Se ha aumentado los HP en 400 puntos");
                System.out.println("Se ha aumentado la armadura en 400 puntos");
            } else {
                System.out.println(super.getName() + " recibe " + enemigo.getExp() + " puntos de EXP ");
            }

        }else {System.out.println("No puedes matar a alguien con más de 1 punto de vida");}
    }

}
