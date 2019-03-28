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
         
    // DPS---->TipoDeGolpe----Celeridad---DañoCritico----ProbCritico---Penetracion-----Armadura---Nombre----Faccion---HP----Muertes----EXP----Nivel----Poder----MuertesEnemigas-----Golpe----Energia
        DPS Priskya = new DPS ("Range",1.00,0,0,0,500,"Priskya","Aire",5000,0,0,1,100,0,500,1000);
        DPS Devas = new DPS("Mele",1.00,0,0,0,500,"Devas","Aire",5000,0,0,1,100,0,500,1000);
        
        // TANK---->Defensa----Esquivar----Parada-----RegVida-----Aggro----Nombre---Faccion----HP----Muertes----EXP----Nivel----Poder----MuertesEnemigas-----Golpe----Armadura)
        TANK Pocho = new TANK(1000,0,0,100,1000,"Pocho","Tierra",10000,0,0,1,100,0,50,1000);
        
        //Primer enfrentamiento
        
        //Generamos enemigo
        Enemigo demonio = new Enemigo();
        demonio.generarEnemigo("Demonio");
 
        
        //Enfrentamos a Devas con el Demonio
        System.out.println(Devas);
        System.out.println(demonio);
        System.out.println("-----------------------------------------------------------------------------");
        do{
        ////Primer turno -
        System.out.println("Primer Turno");
        Devas.GolpearMOB(demonio);
        demonio.Golpear(Devas);
            System.out.println("------------------------------------------------------------------------------------");
        System.out.println(Devas);
        System.out.println(demonio);
        
        //Segundo Turno
        Devas.Potenciar();
        demonio.Golpear(Devas);
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println(Devas);
        System.out.println(demonio);
        
        //Tercer turno
        Devas.GolpearMOB(demonio);
        demonio.Golpear(Devas);
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println(Devas);
        System.out.println(demonio);
        }while(demonio.getHp()>=0);
        //Demonio muere y otorga exp a Devas
        Devas.MatarMOB(demonio);
        System.out.println(Devas);
        //La exp otorgada 
        
        
    }
}
