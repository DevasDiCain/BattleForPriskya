/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author peper
 */
public class Batalla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // DPS---->TipoDeGolpe----Celeridad---DañoCritico----ProbCritico---Penetracion-----Armadura---Nombre----Faccion---HP----Muertes----EXP----Nivel----Poder----MuertesEnemigas-----Golpe----Energia
        DPS Priskya = new DPS ("Range",1.00,0,0,0,500,"Priskya","Aire",5000,0,0,1,100,0,500,1000);
        DPS Devas = new DPS("Mele",1.00,0,0,0,500,"Devas","Aire",5000,0,0,1,100,0,500,1000);
        
        // TANK---->Defensa----Esquivar----Parada-----RegVida-----Aggro----Nombre---Faccion----HP----Muertes----EXP----Nivel----Poder----MuertesEnemigas-----Golpe----Armadura)
        TANK Pocho = new TANK(1000,0,0,100,1000,"Pocho","Tierra",10000,0,0,1,100,0,50,1000);
        System.out.println(Devas);
        Devas.Golpear(Priskya);
        System.out.println(Priskya);
        Priskya.Potenciar();
        Priskya.Golpear(Devas);
        System.out.println(Pocho);
        System.out.println(Pocho.getDefensa());
        Pocho.AumentarDefensa();
        System.out.println(Pocho.getDefensa());
        System.out.println(Pocho.getHp());
        Pocho.AumentarVida();
        System.out.println(Pocho.getHp());
        Pocho.ReducirGolpe(Devas);
        System.out.println("--------");
        System.out.println(Devas);
        System.out.println(Devas.infoDPS());
        
         Enemigo x = new Enemigo ();
         x.generarEnemigo("Demon");
         System.out.println(x);
       
        
    }
    
}
