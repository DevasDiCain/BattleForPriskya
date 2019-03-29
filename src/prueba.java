
import Personajes.mobs.TANK;
import Personajes.mobs.Enemigo;
import Personajes.mobs.DPS;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jose
 */
public class prueba {
    public static void main(String[] args) {
         
    // DPS---->TipoDeGolpe-------DañoCritico----ProbCritico---Penetracion-----Armadura---Nombre----Faccion---HP----Muertes----EXP----Nivel----Poder----MuertesEnemigas-----Golpe----Energia---Celeridad
        DPS Priskya = new DPS ("Range",0,0,0,500,"Priskya","Aire",5000,0,0,1,100,0,500,1000,1.00);
        DPS Devas = new DPS("Mele",0,0,0,500,"Devas","Aire",5000,0,0,1,100,0,500,1000,1.00);
        
        // TANK---->Defensa----Esquivar----Parada-----RegVida-----Aggro----Nombre---Faccion----HP----Muertes----EXP----Nivel----Poder----MuertesEnemigas-----Golpe----Armadura---Celeridad)
        TANK Pocho = new TANK(1000,0,0,100,1000,"Pocho","Tierra",10000,0,0,1,100,0,50,1000,1.00);
        
        //Primer enfrentamiento
        
        //Generamos enemigo
        Enemigo demonio = new Enemigo();
        demonio.generarEnemigo("Demonio");
 
        
        //Enfrentamos a Devas con el Demonio
        System.out.println("--------------CAMPEON---------------");
        System.out.println(Devas);
        System.out.println("-------------ENEMIGO-----------------");
        System.out.println(demonio);
        System.out.println("-----------------------------------------------------------------------------");
        
        while(demonio.getHp()>=0){
        ////Primer turno -
        System.out.println("PRIMER TURNO");
        Devas.GolpearMOB(demonio);
            System.out.println("-  -  -");
        demonio.Golpear(Devas);
            System.out.println("------------------------------------------------------------------------------------");
       System.out.println("--------------CAMPEON---------------");
        System.out.println(Devas);
        System.out.println("-------------ENEMIGO-----------------");
        System.out.println(demonio);
        System.out.println("-----------------------------------------------------------------------------");
        
        //Segundo Turno
        Devas.Potenciar();
        demonio.Golpear(Devas);
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("--------------CAMPEON---------------");
        System.out.println(Devas);
        System.out.println("-------------ENEMIGO-----------------");
        System.out.println(demonio);
        System.out.println("-----------------------------------------------------------------------------");
        //Tercer turno
        Devas.GolpearMOB(demonio);
        demonio.Golpear(Devas);
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("--------------CAMPEON---------------");
        System.out.println(Devas);
        System.out.println("-------------ENEMIGO-----------------");
        System.out.println(demonio);
        System.out.println("-----------------------------------------------------------------------------");
        }
        //Demonio muere y otorga exp a Devas
        Devas.MatarMOB(demonio);
        System.out.println(Devas);
        //La exp otorgada 
        
        
    }
}
