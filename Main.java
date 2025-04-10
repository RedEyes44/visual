import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        
        Coda c = new Coda();

        String nome, cognome, scuola, laurea, materia, azienda, mansione;
        LocalDate dataDiNascita;
        double peso, altezza, stipendio;
        int anno, nClassi, anniDiServizio;
        char sezione;

        String message = "";

        Menu m = new Menu(7);

        do { 
            m.menu();
            int scelta = m.getScelta();

            switch(scelta){
                case 1:{
                    message = "Inserire il nome -->";
                    nome = Tools.leggiStringa(message);
                    message = "Inserire il cognome -->";
                    cognome = Tools.leggiStringa(message);
                    message = "Inserire la data di nascita --> ";
                    dataDiNascita = Tools.leggiData(message);
                    message = "Inserisci il peso --> ";
                    peso = Tools.leggiDoublePos(message);
                    message = "Inserisci l'altezza --> ";
                    altezza = Tools.leggiDoublePos(message);
                    do{
                        message = "Inserisci l'anno --> ";
                        anno = Tools.leggiInteroPos(message);
                    }while(anno<1 || anno>5);

                    do{
                        message = "Inserisci la sezione --> ";
                        sezione = Tools.leggiChar(message);
                    }while(sezione<'A' || sezione>'Z');

                    break;
                }

                case 2:{

                    break;
                }

                case 3:{

                    break;
                }

                case 4:{

                    break;
                }

                case 5:{

                    break;
                }

                case 6:{

                    break;
                }

                case 7:{

                    break;
                }
            }
        } while (m.getScelta()!=0);


        

    }
}
