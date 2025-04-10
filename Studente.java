import java.time.LocalDate;
import java.util.Vector;

public class Studente extends Persona{

    private int anno;
    private char sezione;
    private String scuola;
    private Vector <Double> voti = new Vector(5,5);
    
    public Studente(String n, String c, LocalDate d, double p, double a, int anno, char sez, String school) {
        super(n, c, d, p, a);
        this.anno=anno;
        this.sezione=sez;
        this.scuola=school;
    }

    public int getAnno(){
        return anno;
    }

    public char getSezione(){
        return sezione;
    }

    public String getScuola(){
        return scuola;
    }

    public void setAnno(int a){
        this.anno=a;
    }

    public void setSezione(char s){
        this.sezione=s;
    }

    public void setScuola(String s){
        this.scuola=s;
    }

    public void addVoto(double voto, int index){
        voti.add(index, voto);
    }

    public double getVoto(int index){
        return voti.elementAt(index);
    }

    public int getNVoti(){
        return voti.size();
    }

    public double media(){
        double somma = 0;
        for(int i=0;i<voti.size();i++){
            somma = somma + voti.elementAt(i);
        }
        return somma/getNVoti();
    }

    public String toString(){
        String s=super.toString();
        s = s + "Anno : " + this.anno + "\n";
        s = s + "Sezione : " + sezione + "\n";
        s = s + "Scuola : " + scuola + "\n";
        s = s + "Voti : \n";

        for(int i=0;i<getNVoti();i++){
            s = s + "Voto " + (i+1) + " --> " + voti.elementAt(i) + " \n";
        }

        return s;
    }
}
