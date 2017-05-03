
package lavorodatabase;

/**
 *
 * @author Administrator
 */
public class generalClass {
    private String nome;
    private String data;
    private String cognome;
    private String comune;
    private String sesso;
    private int idCode;
    
    public generalClass(String nome, String cognome, String data , String comune, String sesso){
        this.nome=nome;
        this.cognome=cognome;
        this.comune=comune;
        this.data=data;
        if(sesso=="F" || sesso=="M") this.sesso=sesso;
        else sesso="non definito";
        
        idCode=(int) (Math.random() * 1000);
    }
    public String getNomeCognome(){
        String nominativo=nome+" "+cognome;
        return nominativo;
    }
    public String getSesso(){
        return sesso;
    }
    public String getData(){
        return data;
    }
    public String getComune(){
        return comune;
    }
    public int getIdCode(){
        return idCode;
    }
    
}
