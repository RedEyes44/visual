import java.util.Vector;

public class Coda <O>{

    Vector <O> coda = new Vector(5,5);

    public void push(O o){
        coda.add(o);
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
