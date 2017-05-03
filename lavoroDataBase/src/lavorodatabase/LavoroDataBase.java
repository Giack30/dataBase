/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lavorodatabase;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class LavoroDataBase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
       String nome;
       String data;
       String comune;
       String sesso;
       
       generalClass c=new generalClass("Giacomo", "Ravagnan", "26/05/2000" , "Venezia", "M");
       generalFile g;
        
            g = new generalFile(c.getNomeCognome(), c.getData(),c.getComune(),Integer.toString(c.getIdCode()) ,c.getSesso());
       
       listaFile d=new listaFile(c.getNomeCognome(),g.getPath());
    }
    
}
