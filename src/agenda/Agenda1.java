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
        
        ventana v = new ventana();
        v.show_elements(v.agenda);
        
        
    }   
    
}
