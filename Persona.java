
import java.time.LocalDate;

public class Persona {
    
    private String nome, cognome;
    private LocalDate dataDiNascita;
    private double peso, altezza;

    public Persona(String n, String c, LocalDate d, double p, double a){

        this.nome=n;
        this.cognome=c;
        this.dataDiNascita=d;
        this.peso=p;
        this.altezza=a;

    }

    public String getNome(){
        return nome;
    }

    public String getCognome(){
        return cognome;
    }

    public LocalDate getData(){
        return dataDiNascita;
    }

    public double getPeso(){
        return peso;
    }

    public double getAltezza(){
        return altezza;
    }

    public void setNome(String n){
        this.nome=n;
    }

    public void setCognome(String c){
        this.cognome=c;
    }

    public void setData(LocalDate d){
        this.dataDiNascita=d;
    }

    public void setPeso(double p){
        this.peso=p;
    }

    public void setAltezza(double a){
        this.altezza=a;
    }

    public String toString(){
        String s="";
        
        s = s + "Nome : " + nome + "\n";
        s = s + "Cognome : " + cognome + "\n";
        s = s + "Data di nascita : " + dataDiNascita + "\n";
        s = s + "Peso : " + peso + "\n";
        s = s + "Altezza : " + altezza + "\n";
        
        return s;
    }




































}
