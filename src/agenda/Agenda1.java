/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;
import java.util.List;
import java.util.LinkedList;
import Objetos.Agenda;
import Objetos.Files;
import Objetos.Operaciones_agenda;
import Graphics.Graphics;
import Graphics.ventana;
import javax.swing.JFrame;



/**
 *
 * @author edilson
 */
public class Agenda1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      //  List nombres = new ArrayList <String>();
          List AG = new LinkedList <Agenda>();
           List AG1 = new LinkedList <Agenda>();
      
     /*   Agenda Ag = new Agenda("312344","Edilson Londoño Castañeda","eddylson.londonio@gmail.com","eddy");
        Agenda Ag1 = new Agenda("312344","Juaquin","juaquin@hotmail.com","juaco");
        Agenda Ag3 = new Agenda("312344","Valeria","Valeria@gmail.com","La hermosa");
        Agenda Ag4 = new Agenda("312344","Juan es puto","Elmasouto@gmail.com","severa loca");
        AG.add(Ag);
        AG.add(Ag1);
        AG.add(Ag3);
        AG.add(Ag4);*/
        Files f = new  Files ();
      //  f.inserNewJFramet_element(AG);
        //AG1=f.read_elements();
      //  f.export(AG);
        //System.out.println(AG1);
      // Agenda Ag5 = new Agenda("312344","Juan esffff puto","Elmasouffto@gmail.com","seffffvera loca");
       //AG1.add(Ag5);
       //f.insert_element(AG1);
       AG1=f.read_elements();
       System.out.println(AG1);
       /* System.out.println(AG1);
        Operaciones_agenda op =  new Operaciones_agenda();
        AG1.set(0,op.modificar((Agenda) AG1.get(0), "wddwd", "este", "dwdw", "wwdd"));
        System.out.println(AG1);
        op.eliminar(AG1, (Agenda)AG1.get(0));
        System.out.println(AG1);
        Agenda Ag3 = new Agenda("1312344","Valeria","Valeria@gmail.com","La hermosa");
        if (op.agregar(AG1, Ag3))
            System.out.println(AG1);
        else
            System.out.println("El número ya existe");
         */
       
      ventana v = new ventana();
      v.show_elements(v.agenda);
        
        
    }   
    
}
