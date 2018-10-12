/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;
import java.util.List;
import java.util.LinkedList;
import java.io.Serializable;
/**
 *
 * @author edilson
 */
public class Agenda implements Serializable {


    
    public String telefono,nombres,correo_electronico,alias="";
    List telefonos = new LinkedList ();
     public Agenda (String nombres,String telefono,String correo_electronico,String alias)
    {
        this.alias=alias;
        this.correo_electronico=correo_electronico;
        this.nombres=nombres;
        this.telefono=telefono;
        
      
    }


     public void modificar (String telefono,String nombres,String correo_electronico,String alias)
     {
        this.alias=alias;
        this.correo_electronico=correo_electronico;
        this.nombres=nombres;
        this.telefono=telefono;
        
        
     }

   public List ordenar (List <String> nombres)
    {
        String aux="";
      for (int i=0;i< nombres.size();i++)
      {
          for (int j=0;j < nombres.size() ;j++)
          {
              if (nombres.get(i).compareToIgnoreCase(nombres.get(j)) < 0)
              {
                  aux= nombres.get(i);
                 System.out.println( "aux : "+ aux );
                  nombres.set(i, nombres.get(j));
                  nombres.set(j,aux);
                 // System.out.println(i + " " + j);
                 // System.out.println(nombres);
              }
          }
      }
      return nombres;
    }
    
    public List Quicksort (List <String> nombres,int izq,int der)
    {
        
        int i=der;
        int j = izq;
        String pivote="";
        return nombres;
    }
    
    @Override
    public String toString ()
    {
        return "Name : " + nombres  +
                "Phone  : " + telefono +
                "Email  : " + this.correo_electronico + 
                "Alias : " + this.alias
                
                ;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getNombres() {
        return nombres;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public String getAlias() {
        return alias;
    }
    
    
}
