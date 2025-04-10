import java.util.Scanner;

public class Menu {

    private int scelta;
    private int nScelte;

    public Menu(int n){
        this.nScelte=n;
    }

    public int getScelta(){
        return this.scelta;
    }

    public void setScelta(int s){
        this.scelta=s;
    }

    private void mostraMenu(){
        System.out.println("**MENU'**");
        System.out.println("1)Aggiungere uno studente");
        System.out.println("2)Aggiungere un prof");
        System.out.println("3)Aggiungere un lavoratore");
        System.out.println("4)Servire il prossimo cliente");
        System.out.println("5)Ottenere i dati di una persona tramite il nome");
        System.out.println("6)Trovare lo studente con la media piu' alta");
        System.out.println("7)Trovare il prof con piu' anni di esperienza\n");
        System.out.println("0)ESCI");
    }

    public void menu(){
        Scanner tastiera = new Scanner(System.in);
        int s=0;
        do { 

            mostraMenu();
            s = Tools.leggiIntero("");
            
        } while (s<0 || s>nScelte);

        setScelta(s);
    }

}
