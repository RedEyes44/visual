import java.time.LocalDate;

public class Lavoratore extends Persona{

    private String azienda, mansione;
    private double stipendio;

    public Lavoratore(String n, String c, LocalDate d, double p, double a, String azienda, String mansione, double stipendio) {
        super(n, c, d, p, a);
        this.azienda=azienda;
        this.mansione=mansione;
        this.stipendio=stipendio;
    }

    public String getAzienda(){
        return azienda;
    }

    public String getMansione(){
        return mansione;
    }

    public double getStipendio(){
        return stipendio;
    }

    public void setAzienda(String a){
        this.azienda=a;
    }

    public void setMansione(String m){
        this.mansione=m;
    }

    public void setStipendio(double s){
        this.stipendio=s;
    }

    public String toString(){
        String s = super.toString();
        
        s = s + "Azienda : " + azienda + "\n";
        s = s + "Mansione : " + mansione + "\n";
        s = s + "Stipendio : " + stipendio + "\n";

        return s;
    }

}
