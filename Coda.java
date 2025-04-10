import java.util.Vector;

public class Coda {

    Vector <Persona> coda = new Vector(5,5);

    public void push(Persona p){
        coda.add(p);
    }

    public int getSize(){
        return coda.size();
    }

    public boolean pop(){
        if(getSize()==0){
            return false;
        }else{
            coda.remove(0);
            return true;
        }
    }

    public Persona getPersona(String nome){
        for(int i=0;i<coda.size();i++){
            if(nome.equals(coda.elementAt(i).getNome())){
                return coda.elementAt(i);
            }
        }
        return null;
    }

    public Studente mediaMax(){
        Vector <Studente>studenti = getStudenti();
        double max = studenti.elementAt(0).media();
        int c=0;
        for(int i=1;i<studenti.size();i++){
            if(studenti.elementAt(i).media()>max){
                max = studenti.elementAt(i).media();
                c=i;
            }
        }

        return studenti.elementAt(c);
    }

    public Professore anniMax(){
        Vector <Professore> prof = getProf();

        int max = prof.elementAt(0).getAnniServizio();
        int c=0;

        for(int i=0;i<prof.size();i++){
            if(prof.elementAt(i).getAnniServizio()>max){
                max = prof.elementAt(i).getAnniServizio();
                c = i;
            }
        }

        return prof.elementAt(c);
    }

    public Vector getProf(){
        Vector <Professore> prof = new Vector();
        for(int i=0;i<getSize();i++){
            if(coda.elementAt(i) instanceof Professore){
                prof.add((Professore) coda.elementAt(i));
            }
        }

        return prof;
    }

    public Vector getStudenti(){
        Vector <Studente> studenti = new Vector();
        for(int i=0;i<getSize();i++){
            if(coda.elementAt(i) instanceof Studente){
                studenti.add((Studente) coda.elementAt(i));
            }
        }

        return studenti;
    }

    public Vector getLavoratori(){
        Vector <Lavoratore> workers = new Vector();
        for(int i=0;i<getSize();i++){
            if(coda.elementAt(i) instanceof Lavoratore){
                workers.add((Lavoratore) coda.elementAt(i));
            }
        }

        return workers;
    }
    

}
