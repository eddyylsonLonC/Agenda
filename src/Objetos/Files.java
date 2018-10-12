/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;
import Graphics.Graphics;
import java.io.File;
import java.util.List;
import java.util.LinkedList;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;



/**
 *
 * @author edilson
 */
public class Files {
    public File elementos_agenda= new File ("DB.txt");
    public File Export ;
    
  
    
    public void insert_element (List <Agenda> ag)
    {
        try
        {
            FileOutputStream fos = new FileOutputStream(elementos_agenda);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(ag);
        }catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    
    public List read_elements ()
    {
        List elements = new LinkedList <Agenda> ();
        
        try
        {
            if (this.elementos_agenda.exists())
            {
            FileInputStream fs = new FileInputStream (this.elementos_agenda);
            ObjectInputStream ois = new ObjectInputStream(fs);
            elements=(List)ois.readObject();
            }
            else
            {
                insert_element (elements);
            }
            
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e)
        {
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        return elements;
                
        
    }
    
    public void export (List <Agenda> ag,String name_file)
    {
        if (name_file.contains(".txt"))
        {
        Export = new File (name_file);
        
       try
        {
            FileWriter fw = new FileWriter(Export);
            BufferedWriter bf = new BufferedWriter(fw);
            for (Agenda a : ag)
            {
            String exportlist =""; 
            exportlist=a.alias + ";" + a.correo_electronico + ";" + a.nombres + ";" + a.telefono;
            System.out.println(exportlist);
            bf.write(exportlist);
            bf.newLine();
            
            }
            bf.close();
            
        }catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }catch (IOException e)
        {
            e.printStackTrace();
        }
        }
     
    }
    
    public List <Agenda> Import (String name_file)
    {
         List ag = new LinkedList <Agenda> ();
        if (name_file.contains(".txt"))
        {
            Export = new File(name_file);
       
        try{
            FileReader fr = new FileReader (Export);
            BufferedReader br = new BufferedReader(fr);
            String elemento;
            String aux [];
            while ((elemento=br.readLine()) != null)
            {
                try
                {
                int telefonoAux;
                aux = elemento.split(";");
                String nombres=aux[2];
                String correo=aux[1];
                String telefono=aux[3];
                String alias =aux[0];
                
                try
                {
                    telefonoAux=Integer.parseInt(telefono);
                    Agenda a = new Agenda(nombres,telefono,correo,alias);
                     ag.add(a);
                }catch (NumberFormatException nfe)
                {
                    Graphics g = new Graphics(200,200);
                }
              
                }catch (ArrayIndexOutOfBoundsException e)
                {
                    System.out.println("error file");
                    Graphics g = new Graphics(200,200);
                }
            }
            
        }catch (FileNotFoundException e){
             Graphics g = new Graphics(200,200); 
        }catch(IOException e){
            Graphics g = new Graphics(200,200);
            
        }
       
        }
        System.out.println(ag);
         return ag;
    }
}
