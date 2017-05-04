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
public class dataBase {
    String idCode;
    
    
   public dataBase(String nome,String cognome,String data,String comune,String sesso) throws FileNotFoundException, IOException{
    generalClass c=new generalClass(nome, cognome, data , comune, sesso);
       generalFile g = new generalFile(c.getNomeCognome(), c.getData(),c.getComune(),Integer.toString(c.getIdCode()) ,c.getSesso());
        listaFile d=new listaFile(c.getNomeCognome(),g.getPath());
        idCode=Integer.toString(c.getIdCode());
}
   public String getIDCode(){
       return idCode;
   }
}
