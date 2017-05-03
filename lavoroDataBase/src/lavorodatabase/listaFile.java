/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lavorodatabase;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author Administrator
 */
public class listaFile {
   public String Path="F:\\3^IC\\INFORMATICA\\lavoroDB\\dataBase\\lavoroDataBase\\src\\repository\\FileList\\FileList.txt";
   public String nome;

    public listaFile(String nome, String percorso) throws FileNotFoundException{
       this.nome=nome;
        PrintWriter p=new PrintWriter(Path);
       p.print(nome+"        "+percorso);
       p.close();
       
    }
}
