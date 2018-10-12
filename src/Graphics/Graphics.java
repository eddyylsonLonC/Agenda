/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphics;

import javax.swing.*;

import Objetos.Operaciones_agenda;

/**
 *
 * @author edilson
 */
public class Graphics extends JFrame  {
    JTextField textos = new JTextField (30);
    JButton search = new JButton ("search");
    Operaciones_agenda op= new Operaciones_agenda();
    private JScrollPane scrollpane;
    public Graphics (int sizex,int sizey)
    {
        super("la super agenda");
        setSize(
         sizex,sizey
        );
        JLabel jl = new JLabel ("error en el archivo");
        this.add(jl);
        this.setVisible(true);
    }
        
    
    
    
   
}
