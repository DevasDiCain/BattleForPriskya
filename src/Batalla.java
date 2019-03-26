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
       
        // DPS---->TipoDeGolpe----Celeridad---DañoCritico----ProbCritico---Penetracion---Nombre----Faccion---HP----Muertes----EXP----Nivel----Poder----MuertesEnemigas-----Golpe----Energia
        DPS Priskya = new DPS ("Range",1.00,0,0,0,"Priskya","Aire",1000,0,0,1,100,0,100,1000);
        DPS Devas = new DPS("Mele",1.00,0,0,0,"Devas","Aire",1000,0,0,1,100,0,100,1000);
        
        System.out.println(Devas);
        Devas.Golpear(Priskya);
        System.out.println(Priskya);
        Priskya.Potenciar();
        Priskya.Golpear(Devas);
        
    }
    
}
