import java.time.LocalDate;

public class Professore extends Persona{

    private int nClassi, anniDiServizio;
    private String laurea, materia;

    public Professore(String n, String c, LocalDate d, double p, double a, int nC, int ads, String l, String m) {
        super(n, c, d, p, a);
        this.nClassi=nC;
        this.anniDiServizio=ads;
        this.laurea=l;
        this.materia=m;
    }

    public int getNClassi(){
        return nClassi;
    }

    public int getAnniServizio(){
        return anniDiServizio;
    }

    public String getLaurea(){
        return laurea;
    }

    public String getMateria(){
        return materia;
    }

    public void setNClassi(int n){
        this.nClassi=n;
    }

    public void setAnniServizio(int a){
        this.anniDiServizio=a;
    }

    public void setLaurea(String l){
        this.laurea=l;
    }

    public void setMateria(String m){
        this.materia=m;
    }

    public String toString(){
        String s=super.toString();
        
        s = s + "Numero di classi : " + nClassi + "\n";
        s = s + "Anni di servizio : " + anniDiServizio + " \n";
        s = s + "Laurea : " + laurea + "\n";
        s = s + "Materia : " + materia + "\n";
        
        return s;
    }

}
