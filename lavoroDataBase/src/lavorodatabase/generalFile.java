/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lavorodatabase;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Administrator
 */
public class generalFile {
    public String nome;
    public String data;
    public String fileName;
    public String Path;
    public String comune;
    public String sesso;
    //I SEGUENTI CAMPI DEL COSTRUTTORE POSSONO ESSERE MODIFICATI IN BASE ALLE ESIGENZE DEI DATTI CHE SI VOGLIONO INSERIRE
    //E.G. calcolo del codice fiscale
    /**
     * 
     * @param author inserire persona a cui corrisponde il file creato
     * @param data      inserire la data (se necessario)
     * @param fileName  inserire il nome che comparirà nel file
     * estensione omessa in quanto si vogliono creare solo file .txt contenenti informazioni
     * @throws IOException 
     */
    public generalFile(String nome, String data,String comune, String fileName,String sesso/*String estensione*/) throws IOException{
        this.nome=nome;
        this.data=data;
        this.fileName=fileName;
        this.comune=comune;
        this.sesso=sesso;
       // this.Estensione=estensione;
        this.Path="F:/3^IC/INFORMATICA/lavoroDB/dataBase/lavoroDataBase/src/repository/"+fileName+".txt";
        File file=new File(Path);
        if(file.exists()){
                System.out.println("questo file esiste già");
       }  else if(file.createNewFile()){
                    System.out.println("il file è stato creato");
                }
       PrintWriter p=new PrintWriter(Path);
        p.println("nome: "+nome);
        p.println("data di nascita : "+data);
        p.println("comune : "+comune);
        p.println("sesso : "+sesso);
        p.close();
    }
    public String getPath(){
        return Path;
    }
}
