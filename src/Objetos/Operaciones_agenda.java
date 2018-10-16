/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;
/**
 *
 * @author edilson
 */
public class Operaciones_agenda {
    
   // public List agenda = new LinkedList  <Agenda>();
    
    public List <Agenda> buscar (List <Agenda> agenda,String elemento)
    {
     List AUX = new LinkedList  <Agenda>();
        for (Agenda a : agenda) {
            
            if (a.nombres.contains(elemento) || a.alias.contains(elemento) || a.telefono.contains(elemento) || a.correo_electronico.contains(elemento))
                AUX.add(a);
        }
      return AUX;
        
    }
    
    public boolean agregar (List <Agenda> agenda,Agenda elemento){
        
      for (Agenda ag : agenda )
      {
          if (ag.telefono.equals(elemento.getTelefono()))
          {
               return false;
          }
      }
     
       agenda.add(elemento);
        return true;
    }
    
    public Agenda modificar ( Agenda elemento,String nombres,String telefono,String correo_electronico,String alias ){
          elemento.modificar(telefono, nombres, correo_electronico, alias);
          return elemento;
    
    
    }
    
    public void eliminar (List <Agenda> agenda,Agenda elemento){ agenda.remove(elemento); }
    
    public List <Agenda> ordenar (List <Agenda> agenda)
    {
        Agenda aux;
        for (int i=0; i<agenda.size();i++)
        {
            for (int j=0;j<agenda.size();j++)
            {
                if (agenda.get(i).getNombres().compareToIgnoreCase(agenda.get(j).getNombres()) < 0)
                {
                    aux= agenda.get(i);
                    agenda.set(i, agenda.get(j));
                    agenda.set(j, aux);
                    
                }
            }
                
        }
        return agenda;
    }
}
